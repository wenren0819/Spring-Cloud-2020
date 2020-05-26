package com.wenren.springcloud.alibaba.service.impl;

import com.wenren.springcloud.alibaba.dao.OrderDao;
import com.wenren.springcloud.alibaba.domain.Order;
import com.wenren.springcloud.alibaba.service.AccountService;
import com.wenren.springcloud.alibaba.service.OrderService;
import com.wenren.springcloud.alibaba.service.StorageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author wangyang
 * @version V1.0
 * @create 2020-05-25-14:14
 */
@Service
@Slf4j
public class OrderServiceImpl implements OrderService {
    @Resource
    private OrderDao orderDao;

    @Resource
    private StorageService storageService;

    @Resource
    private AccountService accountService;

    /**
     * 创建订单->调用库存服务扣减库存->调用账户服务扣减账户余额->修改订单状态
     * 简单说：下订单->扣库存->减余额->改状态
     * @param order
     */
    @Override
    public void create(Order order) {
        //1、新建订单
        log.info("------>开始新建订单");
        orderDao.create(order);
        //2、扣减库存
        log.info("------>订单微服务开始调用库存，做扣减start");
        storageService.decrease(order.getProductId(), order.getCount());
        log.info("------>订单微服务开始调用库存，做扣减end");
        //3、扣减账户
        log.info("------>订单微服务开始调用账户，做扣减start");
        accountService.decrease(order.getUserId(), order.getMoney());
        log.info("------>订单微服务开始调用账户，做扣减end");
        //4、修改订单状态，从0到1，1代表已经完成
        log.info("------>修改订单状态start");
        orderDao.update(order.getUserId(), 0);
        log.info("------>修改订单状态end");

        log.info("------>下订单结束了，O(∩_∩)O哈哈~");
    }
}

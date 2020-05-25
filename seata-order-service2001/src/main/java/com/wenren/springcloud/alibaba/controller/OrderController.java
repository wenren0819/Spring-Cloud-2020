package com.wenren.springcloud.alibaba.controller;

import com.wenren.springcloud.alibaba.domain.CommonResult;
import com.wenren.springcloud.alibaba.domain.Order;
import com.wenren.springcloud.alibaba.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author wangyang
 * @version V1.0
 * @create 2020-05-25-14:39
 */
@RestController
public class OrderController {
    @Resource
    private OrderService orderService;

    @GetMapping("/order/create")
    public CommonResult create(Order order) {
        orderService.create(order);

        return new CommonResult(200, "订单创建成功");
    }
}

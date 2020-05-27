package com.wenren.springcloud.alibaba.service.impl;

import com.wenren.springcloud.alibaba.dao.AccountDao;
import com.wenren.springcloud.alibaba.service.AccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.concurrent.TimeUnit;

/**
 * @author wangyang
 * @version V1.0
 * @create 2020-05-25-15:59
 * 业务实现类
 */
@Service
@Slf4j
public class AccountServiceImpl implements AccountService {
    @Resource
    private AccountDao accountDao;

    /**
     * 扣减账户余额
     *
     * @param userId
     * @param money
     */
    @Override
    public void decrease(Long userId, BigDecimal money) {
        log.info("------>account-service中扣减账户余额开始");
        //模拟超时异常，全局事务回滚
        //暂停几秒钟线程
        /*try {
            TimeUnit.SECONDS.sleep(20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        accountDao.decrease(userId, money);
        log.info("------>account-service中扣减账户余额结束");
    }
}

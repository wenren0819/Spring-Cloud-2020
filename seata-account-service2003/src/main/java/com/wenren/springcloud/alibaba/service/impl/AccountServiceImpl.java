package com.wenren.springcloud.alibaba.service.impl;

import com.wenren.springcloud.alibaba.dao.AccountDao;
import com.wenren.springcloud.alibaba.service.AccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;

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
        accountDao.decrease(userId, money);
        log.info("------>account-service中扣减账户余额结束");
    }
}

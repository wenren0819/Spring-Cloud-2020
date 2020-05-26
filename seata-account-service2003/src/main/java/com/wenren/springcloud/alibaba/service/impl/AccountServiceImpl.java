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
 */
@Service
@Slf4j
public class AccountServiceImpl implements AccountService {
    @Resource
    private AccountDao accountDao;

    @Override
    public void decrease(Long userId, BigDecimal money) {
        log.info("------>开始扣减账户");
        accountDao.decrease(userId,money);
        log.info("------>扣减账户结束，O(∩_∩)O哈哈~");
    }
}

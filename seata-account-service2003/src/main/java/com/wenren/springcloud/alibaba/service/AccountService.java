package com.wenren.springcloud.alibaba.service;

import java.math.BigDecimal;

/**
 * @author wangyang
 * @version V1.0
 * @create 2020-05-25-15:57
 */
public interface AccountService {
    void decrease(Long userId, BigDecimal money);
}

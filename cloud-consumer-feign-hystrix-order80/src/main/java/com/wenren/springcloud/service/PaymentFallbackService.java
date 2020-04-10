package com.wenren.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @author wangyang
 * @version V1.0
 * @create 2020-04-10-11:40
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "------PaymentFallbackService fall back-paymentInfo_OK, o(╥﹏╥)o";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "------PaymentFallbackService fall back-paymentInfo_TimeOut, o(╥﹏╥)o";
    }
}

package com.wenren.springcloud.service;

import com.wenren.springcloud.entities.CommonResult;
import com.wenren.springcloud.entities.Payment;
import org.springframework.stereotype.Component;

/**
 * @author wangyang
 * @version V1.0
 * @create 2020-05-21-15:01
 */
@Component
public class PaymentFallbackService implements PaymentService {
    @Override
    public CommonResult<Payment> paymentSQL(Long id) {
        return new CommonResult<>(44444, "服务降级返回，---PaymentFallbackService", new Payment(id, "errorSerial"));
    }
}

package com.wenren.springcloud.service;

import com.wenren.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author wangyang
 * @version V1.0
 * @create 2020-03-23-14:21
 */
public interface PaymentService {

    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}

package com.wenren.springcloud.impl;

import com.wenren.springcloud.dao.PaymentDao;
import com.wenren.springcloud.entities.Payment;
import com.wenren.springcloud.service.PaymentService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author wangyang
 * @version V1.0
 * @create 2020-03-23-14:25
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(@Param("id") Long id) {
        return paymentDao.getPaymentById(id);
    }
}

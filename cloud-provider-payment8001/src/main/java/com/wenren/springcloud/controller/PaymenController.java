package com.wenren.springcloud.controller;

import com.oracle.tools.packager.Log;
import com.wenren.springcloud.entities.CommonResult;
import com.wenren.springcloud.entities.Payment;
import com.wenren.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author wangyang
 * @version V1.0
 * @create 2020-03-23-14:28
 */
@RestController
@Slf4j
public class PaymenController {

    @Resource
    private PaymentService paymentService;

    @PostMapping(value = "/payment/create")
    public CommonResult create(Payment payment) {
        int result = paymentService.create(payment);
        Log.info("******插入结果:" + result);

        if (result > 0) {
            return new CommonResult(200, "插入数据成功", result);
        } else {
            return new CommonResult(444, "插入数据失败", null);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult<Payment> create(@PathVariable("id") Long id) {
        Payment payment = paymentService.getPaymentById(id);
        Log.info("******插入结果:" + payment + "\t" + "O(∩_∩)O哈哈~");

        if (payment != null) {
            return new CommonResult(200, "查询成功", payment);
        } else {
            return new CommonResult(444, "没有对应记录，查询ID:" + id, null);
        }
    }
}

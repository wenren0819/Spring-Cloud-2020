package com.wenren.springcloud.alibaba.controller;

import com.wenren.springcloud.entities.CommonResult;
import com.wenren.springcloud.entities.Payment;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * @author wangyang
 * @version V1.0
 * @create 2020-05-21-11:26
 */
@RestController
public class PaymentController {
    @Value("${server.port}")
    private String serverPort;

    public static HashMap<Long, Payment> hashMap = new HashMap<>();

    static {
        hashMap.put(1L, new Payment(1L, "8229b054d47542ac9dbe36c8091f4a26"));
        hashMap.put(2L, new Payment(2L, "31d86d8a000f4491a20ffc990c81de30"));
        hashMap.put(3L, new Payment(3L, "06511bfcdf2747cbb433c15cff4f5c0b"));
    }

    @GetMapping(value = "/paymentSQL/{id}")
    public CommonResult<Payment> paymentSQL(@PathVariable("id") Long id) {
        Payment payment = hashMap.get(id);
        CommonResult<Payment> result = new CommonResult<>(200, "from mysql,serverPort: " + serverPort, payment);
        return result;
    }
}

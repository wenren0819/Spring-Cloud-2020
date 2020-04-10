package com.wenren.springcloud.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @author wangyang
 * @version V1.0
 * @create 2020-04-09-11:58
 */
@Service
public class PaymentService {
    /**
     * 正常访问，肯定OK
     *
     * @param id
     * @return
     */
    public String paymentInfo_OK(Integer id) {
        return "线程池:" + Thread.currentThread().getName() + " paymentInfo_OK,id:" + id + "\t" + "O(∩_∩)O哈哈~";
    }

    @HystrixCommand(fallbackMethod = "paymentInfo_TimeOutHandler", commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "5000")
    })
    public String paymentInfo_TimeOut(Integer id) {
//        int age = 10/0;
        int timeNumber = 3000;
        try {
            TimeUnit.MILLISECONDS.sleep(timeNumber);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "线程池:" + Thread.currentThread().getName() + " paymentInfo_TimeOut,id:" + id + "\t" + "O(∩_∩)O哈哈~" + " 耗时（秒）" + timeNumber;
    }

    public String paymentInfo_TimeOutHandler(Integer id) {
        return "线程池:" + Thread.currentThread().getName() + " 8001系统繁忙或者运行报错，请稍后再试,id:" + id + "\t" + "o(╥﹏╥)o";
    }
}

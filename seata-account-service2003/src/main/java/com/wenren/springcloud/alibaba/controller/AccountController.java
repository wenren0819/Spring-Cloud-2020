package com.wenren.springcloud.alibaba.controller;

import com.wenren.springcloud.alibaba.domain.CommonResult;
import com.wenren.springcloud.alibaba.service.AccountService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * @author wangyang
 * @version V1.0
 * @create 2020-05-25-16:01
 */
@RestController
public class AccountController {
    @Resource
    private AccountService accountService;

    @PostMapping(value = "/account/decrease")
    CommonResult decrease(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money) {
        accountService.decrease(userId, money);

        return new CommonResult(200, "扣减库存成功");
    }
}

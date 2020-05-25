package com.wenren.springcloud.alibaba.service;

import com.wenren.springcloud.alibaba.domain.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * @author wangyang
 * @version V1.0
 * @create 2020-05-25-14:15
 */
@FeignClient(value = "seata-account-service")
public interface AccountService {
    @PostMapping(value = "/account/decrease")
    CommonResult decrease(@RequestParam("productId") Long productId, @RequestParam("money") BigDecimal money);
}

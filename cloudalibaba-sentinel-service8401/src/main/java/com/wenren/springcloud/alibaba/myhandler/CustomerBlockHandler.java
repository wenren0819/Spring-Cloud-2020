package com.wenren.springcloud.alibaba.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.wenren.springcloud.entities.CommonResult;

/**
 * @author wangyang
 * @version V1.0
 * @create 2020-05-20-15:17
 */
public class CustomerBlockHandler {
    public static CommonResult handlerException(BlockException exception) {
        return new CommonResult(4444, "按客户自定义,global handerException----1");
    }

    public static CommonResult handlerException2(BlockException exception) {
        return new CommonResult(4444, "按客户自定义,global handerException----2");
    }
}

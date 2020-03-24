package com.wenren.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author wangyang
 * @version V1.0
 * @create 2020-03-23-13:53
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {

    //404 not_found
    private Integer code;
    private String message;
    private T data;

    public CommonResult(Integer code, String message) {
        this(code, message, null);
    }
}

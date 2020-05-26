package com.wenren.springcloud.alibaba.service;

/**
 * @author wangyang
 * @version V1.0
 * @create 2020-05-26-10:18
 */
public interface StorageService {
    void decrease(Long productId, Integer count);
}

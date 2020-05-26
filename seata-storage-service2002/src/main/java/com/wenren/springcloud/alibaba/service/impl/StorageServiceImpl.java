package com.wenren.springcloud.alibaba.service.impl;

import com.wenren.springcloud.alibaba.dao.StorageDao;
import com.wenren.springcloud.alibaba.service.StorageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author wangyang
 * @version V1.0
 * @create 2020-05-26-10:20
 */
@Service
@Slf4j
public class StorageServiceImpl implements StorageService {
    @Resource
    private StorageDao storageDao;

    @Override
    public void decrease(Long productId, Integer count) {
        log.info("------>开始扣减库存");
        storageDao.decrease(productId,count);
        log.info("------>扣减库存结束，O(∩_∩)O哈哈~");
    }
}

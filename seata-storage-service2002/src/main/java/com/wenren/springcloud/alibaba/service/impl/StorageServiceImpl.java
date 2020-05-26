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

    /**
     * 扣减库存
     *
     * @param productId
     * @param count
     */
    @Override
    public void decrease(Long productId, Integer count) {
        log.info("------>storage-service中扣减库存开始");
        storageDao.decrease(productId,count);
        log.info("------>storage-service中扣减库存结束");
    }
}

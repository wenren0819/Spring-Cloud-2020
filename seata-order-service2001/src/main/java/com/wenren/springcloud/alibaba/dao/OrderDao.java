package com.wenren.springcloud.alibaba.dao;

import com.wenren.springcloud.alibaba.domain.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author wangyang
 * @version V1.0
 * @create 2020-05-25-13:53
 */
@Mapper
public interface OrderDao {
    //1、新建订单
    void create(Order order);

    //2、修改订单状态，从0改为1
    void update(@Param("userId") Long userId, @Param("status") Integer status);
}

package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author laowang
 * @email 1584460297@qq.com
 * @date 2022-06-18 19:07:57
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}

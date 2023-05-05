package com.atguigu.gmall.order.dao;

import com.atguigu.gmall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author yumeko
 * @email yjs601060533@gmail.com
 * @date 2023-05-09 07:03:31
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}

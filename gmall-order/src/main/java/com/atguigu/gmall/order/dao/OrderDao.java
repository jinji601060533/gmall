package com.atguigu.gmall.order.dao;

import com.atguigu.gmall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author yumeko
 * @email yjs601060533@gmail.com
 * @date 2023-05-09 07:03:31
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}

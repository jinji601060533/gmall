package com.atguigu.gmall.coupon.dao;

import com.atguigu.gmall.coupon.entity.CouponHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券领取历史记录
 * 
 * @author yumeko
 * @email yjs601060533@gmail.com
 * @date 2023-05-08 19:00:22
 */
@Mapper
public interface CouponHistoryDao extends BaseMapper<CouponHistoryEntity> {
	
}

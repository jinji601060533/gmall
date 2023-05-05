package com.atguigu.gmall.ware.dao;

import com.atguigu.gmall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author yumeko
 * @email yjs601060533@gmail.com
 * @date 2023-05-09 07:09:41
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}

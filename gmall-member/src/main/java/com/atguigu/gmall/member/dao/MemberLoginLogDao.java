package com.atguigu.gmall.member.dao;

import com.atguigu.gmall.member.entity.MemberLoginLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员登录记录
 * 
 * @author yumeko
 * @email yjs601060533@gmail.com
 * @date 2023-05-08 20:18:14
 */
@Mapper
public interface MemberLoginLogDao extends BaseMapper<MemberLoginLogEntity> {
	
}

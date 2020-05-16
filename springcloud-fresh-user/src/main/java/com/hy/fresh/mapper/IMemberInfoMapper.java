package com.hy.fresh.mapper;

import com.hy.fresh.entity.MemberInfo;

public interface IMemberInfoMapper {
	/**
	 * 登录
	 * @param user
	 * @return
	 */
	public MemberInfo login(MemberInfo memberInfo);
	/**
	 * 注册
	 * @param user
	 * @return
	 */
	public int register(MemberInfo memberInfo);
}

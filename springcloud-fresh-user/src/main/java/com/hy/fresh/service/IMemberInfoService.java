package com.hy.fresh.service;

import com.hy.fresh.entity.MemberInfo;

public interface IMemberInfoService {
	
	public MemberInfo login(MemberInfo memberInfo);
	
	public int reg(MemberInfo memberInfo);
}

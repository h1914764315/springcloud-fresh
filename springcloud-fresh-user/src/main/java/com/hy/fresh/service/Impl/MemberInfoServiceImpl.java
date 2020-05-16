package com.hy.fresh.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hy.fresh.entity.MemberInfo;
import com.hy.fresh.mapper.IMemberInfoMapper;
import com.hy.fresh.service.IMemberInfoService;
import com.hy.fresh.util.StringUtil;

@Service
public class MemberInfoServiceImpl implements IMemberInfoService{
	@Autowired
	private IMemberInfoMapper mapper;


	@Override
	public MemberInfo login(MemberInfo memberInfo) {
		if(StringUtil.checkNull(memberInfo.getNickName(),memberInfo.getPwd())) {
			return null;
		}
		return mapper.login(memberInfo);
	}

	@Override
	public int reg(MemberInfo memberInfo) {
		if(StringUtil.checkNull(memberInfo.getNickName(), memberInfo.getEmail(),memberInfo.getPwd())) {
			return -1;
		}
		return mapper.register(memberInfo);
	}

}

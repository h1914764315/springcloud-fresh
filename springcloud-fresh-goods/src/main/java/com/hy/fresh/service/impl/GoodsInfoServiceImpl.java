package com.hy.fresh.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hy.fresh.mapper.IGoodsInfoMapper;
import com.hy.fresh.mapper.IGoodsTypeMapper;
import com.hy.fresh.service.IGoodsInfoService;


@Service
public class GoodsInfoServiceImpl implements IGoodsInfoService{
	@Autowired
	private IGoodsInfoMapper goodsInfoMapper;
	@Autowired
	private IGoodsTypeMapper goodsTypeMapper;
	
	
	@Override
	public Map<String, Object> finds() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("types",goodsTypeMapper.finds());
		map.put("goods",goodsInfoMapper.finds());
		return map;
	}

}

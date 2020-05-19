package com.hy.fresh.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hy.fresh.entity.GoodsInfo;
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


	@Override
	public List<GoodsInfo> findByType(Map<String, Object> map) {
		return goodsInfoMapper.findByType(map);
	}


	@Override
	public Map<String, Object> findByFirst(Map<String, Object> map) {
		int total = goodsInfoMapper.getTotal(Integer.valueOf(String.valueOf(map.get("tno"))));
		Map<String, Object> result = new HashMap<String,Object>();
		result.put("total",total);
		result.put("goods",this.findByType(map));
		return result;
	}


	@Override
	public GoodsInfo findByGno(int gno) {
		return goodsInfoMapper.findByGno(gno);
	}

}

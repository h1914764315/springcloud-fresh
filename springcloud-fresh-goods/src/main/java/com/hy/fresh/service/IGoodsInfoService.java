package com.hy.fresh.service;

import java.util.List;
import java.util.Map;

import com.hy.fresh.entity.GoodsInfo;

public interface IGoodsInfoService {
	
	public Map<String, Object> finds();
	
	public List<GoodsInfo> findByType(Map<String,Object>map);
	
	public Map<String,Object> findByFirst(Map<String,Object> map);
	
	public GoodsInfo findByGno(int gno);
	
}

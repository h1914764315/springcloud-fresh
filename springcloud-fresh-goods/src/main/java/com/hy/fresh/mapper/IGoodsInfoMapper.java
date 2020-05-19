package com.hy.fresh.mapper;

import java.util.List;
import java.util.Map;

import com.hy.fresh.entity.GoodsInfo;


public interface IGoodsInfoMapper {
	
	public List<GoodsInfo> finds();
	
	public List<GoodsInfo> findByType(Map<String,Object>map);
	
	public GoodsInfo findByGno(int gno);
	
	public int getTotal(Integer tno);
	
	public int updateStore(String[] cno);
}

package com.hy.fresh.service;

import java.util.List;

import com.hy.fresh.entity.CartInfo;
import com.hy.fresh.entity.GoodsInfo;

public interface ICartInfoService {
	
	public int add(CartInfo cartInfo);
	
	public int findnums(Integer mno);
	
	public List<GoodsInfo> findByMno(Integer mno);
	
	public int del(Integer cno);
	
	public int update(CartInfo cartInfo);
	
	public int check(CartInfo cartInfo);
	
	public List<GoodsInfo> findByCons(List<String> list);
	
	public int delete(List<String> list);
}

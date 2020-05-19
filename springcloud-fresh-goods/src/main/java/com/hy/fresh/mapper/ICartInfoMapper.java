package com.hy.fresh.mapper;

import java.util.List;

import com.hy.fresh.entity.CartInfo;
import com.hy.fresh.entity.GoodsInfo;

public interface ICartInfoMapper {
	/**
	 * 添加购物车
	 * @param cartInfo
	 * @return
	 */
	public int add(CartInfo cartInfo);
	/**
	 * 通过用户查购物车有多少件商品
	 * @param mno
	 * @return
	 */
	public int findnums(Integer mno);
	/**
	 * 
	 * @param mno
	 * @return
	 */
	public List<GoodsInfo> findByMno(Integer mno);
	
	
	/**
	 * 删除购物车
	 * @param cno
	 * @return
	 */
	
	public int del(Integer cno);
	
	/**
	 * 更改购物车数
	 * @param cartInfo
	 * @return
	 */
	public int update(CartInfo cartInfo);
	
	public int check(CartInfo cartInfo);
	
	public List<GoodsInfo> findByCons(List<String> list);
	
	public int delete (List<String>list);
}

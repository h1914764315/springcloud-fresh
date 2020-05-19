
package com.hy.fresh.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hy.fresh.entity.CartInfo;
import com.hy.fresh.entity.GoodsInfo;
import com.hy.fresh.mapper.ICartInfoMapper;
import com.hy.fresh.service.ICartInfoService;
@Service
public class CartInfoServiceImpl implements ICartInfoService{
	
	@Autowired
	private ICartInfoMapper mapper;

	@Override
	public int add(CartInfo cartInfo) {
		return mapper.add(cartInfo);
	}

	@Override
	public int findnums(Integer mno) {
		return mapper.findnums(mno);
	}

	@Override
	public List<GoodsInfo> findByMno(Integer mno) {
		return mapper.findByMno(mno);
	}

	@Override
	public int del(Integer cno) {
		return mapper.del(cno);
	}

	@Override
	public int update(CartInfo cartInfo) {
		return mapper.update(cartInfo);
	}

	@Override
	public int check(CartInfo cartInfo) {
		return mapper.check(cartInfo);
	}

	@Override
	public List<GoodsInfo> findByCons(List<String> list) {
		return mapper.findByCons(list);
	}

	@Override
	public int delete(List<String> list) {
		return mapper.delete(list);
	}
}

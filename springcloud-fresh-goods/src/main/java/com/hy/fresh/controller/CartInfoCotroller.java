package com.hy.fresh.controller;

import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hy.fresh.entity.CartInfo;
import com.hy.fresh.entity.GoodsInfo;
import com.hy.fresh.entity.MemberInfo;
import com.hy.fresh.service.ICartInfoService;

@RestController
@RequestMapping("/cart")
public class CartInfoCotroller {
	@Autowired
	private ICartInfoService cartInfoService;
	
	private MemberInfo getMemberInfo(HttpSession session) {
		Object obj = session.getAttribute("loginMember");
		if(obj == null) {
			return null;
		}
		return (MemberInfo) obj;
	}
	
	@RequestMapping("/add")
	private int add (CartInfo cartInfo){
		return cartInfoService.add(cartInfo);
	}
	
	@RequestMapping("/findByMno")
	private List<GoodsInfo> findByMno(HttpSession session){
		MemberInfo mf = this.getMemberInfo(session);
		if(mf == null) {
			return null;
		}
		return cartInfoService.findByMno(mf.getMno());
	}
	
	@RequestMapping("/del")
	private int del(Integer cno){
		return cartInfoService.del(cno);
	}
	
	@RequestMapping("/update")
	private int update(CartInfo cartInfo){
		int result = -1;
		result = cartInfoService.update(cartInfo);
		return result;
	}
	
	@RequestMapping("/check")
	private int check(CartInfo cartInfo){
		int result = -1;
		result = cartInfoService.check(cartInfo);
		return result;
	}
	
	@RequestMapping("/findByCnos")
	private List<GoodsInfo> findByCons(String cnos){
		List<String> list = Arrays.asList(cnos.split(","));
		return cartInfoService.findByCons(list);
	}
	
	@RequestMapping("/delete")
	private int delete(String cnos){
		List<String> list = Arrays.asList(cnos.split(","));
		return cartInfoService.delete(list);
	}
}

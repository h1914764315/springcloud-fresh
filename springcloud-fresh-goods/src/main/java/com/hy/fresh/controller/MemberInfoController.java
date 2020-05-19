package com.hy.fresh.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hy.fresh.entity.MemberInfo;
import com.hy.fresh.service.ICartInfoService;
import com.hy.fresh.util.ResponseUtil;



@RestController
@RequestMapping("/member")
public class MemberInfoController {
	@Autowired
	private ICartInfoService cartInfoService;
	
	@GetMapping("/check")
	public Map<String, Object> checkLogin(HttpSession session){
		Object obj = session.getAttribute("loginMember");
		if(obj == null) {
			return ResponseUtil.responseMap(500,null,null);
		}
		Map<String,Object>map = new HashMap<String,Object>();
		map.put("member",obj);
		MemberInfo mf = (MemberInfo) obj;
		map.put("carts",cartInfoService.findByMno(mf.getMno()));
		return ResponseUtil.responseMap(200, null, map);
	}
}

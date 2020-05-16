package com.hy.fresh.controller;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hy.fresh.util.ResponseUtil;



@RestController
@RequestMapping("/member")
public class MemberInfoController {
	
	@GetMapping("/check")
	public Map<String, Object> checkLogin(HttpSession session){
		Object obj = session.getAttribute("loginMember");
		if(obj == null) {
			return ResponseUtil.responseMap(500,null,null);
		}
		return ResponseUtil.responseMap(200, null, obj);
	}
}

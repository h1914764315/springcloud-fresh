package com.hy.fresh.controller;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hy.fresh.entity.MemberInfo;
import com.hy.fresh.service.IMemberInfoService;
import com.hy.fresh.util.ResponseUtil;
import com.hy.fresh.util.SendMailUtil;


@RestController
@RequestMapping("/member")
public class MemberInfoContoller {
	private SendMailUtil sendMailUtil;
	@Autowired
	private IMemberInfoService service;
	
	@RequestMapping("/code")
	public Map<String, Object> sendCode(String receive, String name, HttpSession session){
		String code = "";
		Random rd = new Random();
		while (code.length() <6) {
			code += rd.nextInt(10);	
		}
		if(sendMailUtil.sendHtmlMail(receive, name, code)) {
			session.setAttribute("sendCode", code);
			TimerTask task = new TimerTask() {
				
				@Override
				public void run() {
					session.removeAttribute("sendCode");
				}
			};
			Timer time = new Timer();
			time.schedule(task, 180000);
			return ResponseUtil.responseMap(200, null, null);
		}
		return ResponseUtil.responseMap(500, null, null);
	}
	
	@RequestMapping("/reg")
	public Map<String,Object> reg(HttpSession session, MemberInfo mf){
		Object obj = session.getAttribute("code");
		if(obj == null) {
			return ResponseUtil.responseMap(501, null, null);
		}
		String code = (String) obj;
		if(!code.equals(mf.getRealName())) {
			return ResponseUtil.responseMap(502,null,null);
		}
		int result = service.reg(mf);
		if(result >0) {
			return ResponseUtil.responseMap(200,null,null);
		}
		return ResponseUtil.responseMap(503,null,null);
	}
	
	@RequestMapping("/login")
	public Map<String,Object> login(HttpSession session, MemberInfo mf){
		String code = mf.getRealName();
		String vcode = (String)session.getAttribute("validateCode");
		
		if(!code.equalsIgnoreCase(vcode)) {
			return ResponseUtil.responseMap(501,null,null);
		}
		MemberInfo memberInfo = service.login(mf);
		if(memberInfo == null) {
			return ResponseUtil.responseMap(500,null,null);
		}
		session.setAttribute("loginMember",memberInfo);
		return ResponseUtil.responseMap(200,null,null);
	}
	
	
	@RequestMapping("/check")
	public Map<String,Object> checkLogin(HttpSession session){
		Object obj = session.getAttribute("loginMember");
		if(obj == null) {
			return Collections.emptyMap();
		}
		Map<String, Object> map = new HashMap<String,Object>();
		map.put("member",obj);
		map.put("carts",session.getAttribute("cartInfos"));
		return map;
	}
}

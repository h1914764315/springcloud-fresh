package com.hy.fresh.util;

import java.util.HashMap;
import java.util.Map;


public class RequestParameterUtil {
	/**
	 * 将请求中的参数封装成map对象
	 */
	
	public static Map<String, Object> pageParam(Integer page, Integer rows){
		Map<String, Object> map = new HashMap<String,Object>();
		map.put("page", (page -1) * rows);
		map.put("rows", rows);
		return map;
	}
	
	public static Map<String, Object> pageParam(Map<String,Object>map){
		int page = Integer.parseInt(String.valueOf(map.get("page")));
		int rows = Integer.parseInt(String.valueOf(map.get("rows")));
		map.put("page", (page -1) * rows);
		map.put("rows", rows);
		return map;
	}
}

package com.hy.fresh.util;

import java.util.HashMap;
import java.util.Map;

public class ResponseUtil {
	public static Map<String, Object> responseMap(int code,String msg,Object data){
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("code",code);
		map.put("msg",msg);
		map.put("data",data);
		return map;
	}
}

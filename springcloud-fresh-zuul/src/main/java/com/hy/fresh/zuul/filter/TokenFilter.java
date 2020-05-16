package com.hy.fresh.zuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;

public class TokenFilter extends ZuulFilter{

	@Override
	public String filterType() {
		return "pre";
	}
	
	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public Object run() throws ZuulException {
		return null;
	}
	@Override
	public int filterOrder() {
		return 0;
	}
	
}

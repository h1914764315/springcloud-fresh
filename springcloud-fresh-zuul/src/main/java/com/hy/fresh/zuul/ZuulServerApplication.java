package com.hy.fresh.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

import com.hy.fresh.zuul.filter.TokenFilter;


@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
public class ZuulServerApplication {
    public static void main( String[] args ){
    	SpringApplication.run(ZuulServerApplication.class,args);
    }
    public TokenFilter tokenFilter() {
    	return new TokenFilter();
    }
}

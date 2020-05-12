package com.hy.fresh.goods;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;



@SpringBootApplication
@EnableEurekaClient
@EnableRedisHttpSession //启动redis缓存 session存到redis
@MapperScan("com.hy.fresh.goods.mapper")
public class FreshGoodApplication {
	public static void main(String[] args) {
		SpringApplication.run(FreshGoodApplication.class, args);
	}
}
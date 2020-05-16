package com.hy.fresh;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

@SpringBootApplication
@EnableEurekaClient
@EnableRedisHttpSession //启动redis缓存 session存到reds
@MapperScan("com.hy.fresh.mapper")
public class FreshUserApplication {
	public static void main(String[] args) {
		SpringApplication.run(FreshUserApplication.class, args);
	}
}

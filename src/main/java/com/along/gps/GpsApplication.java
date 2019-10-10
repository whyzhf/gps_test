package com.along.gps;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@EnableTransactionManagement
@SpringBootApplication
@EnableCaching  //开启缓存
@MapperScan("com.along.gps.dao")
public class GpsApplication  extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(GpsApplication.class, args);


	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(GpsApplication.class);
	}

}

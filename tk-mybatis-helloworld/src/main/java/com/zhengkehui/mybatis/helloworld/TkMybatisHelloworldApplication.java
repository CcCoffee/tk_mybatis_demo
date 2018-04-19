package com.zhengkehui.mybatis.helloworld;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@tk.mybatis.spring.annotation.MapperScan(basePackages = "com.zhengkehui.mybatis.helloworld.mapper")
@SpringBootApplication
public class TkMybatisHelloworldApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(TkMybatisHelloworldApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}
}

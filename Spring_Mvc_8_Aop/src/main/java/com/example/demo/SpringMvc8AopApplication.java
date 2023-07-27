package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
@EnableAspectJAutoProxy(proxyTargetClass=true) 
@SpringBootApplication
public class SpringMvc8AopApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMvc8AopApplication.class, args);
	}

}

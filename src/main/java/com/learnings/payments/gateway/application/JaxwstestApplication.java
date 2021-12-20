package com.learnings.payments.gateway.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.learnings.payments.gateway.components"})
public class JaxwstestApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(JaxwstestApplication.class, args);
	}

}

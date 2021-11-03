package com.revature.p2BackEnd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class P2BackEndApplication {

	public static void main(String[] args) {
		SpringApplication.run(P2BackEndApplication.class, args);
		
	}

}

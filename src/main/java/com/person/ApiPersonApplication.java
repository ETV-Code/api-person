package com.person;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiPersonApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiPersonApplication.class, args);
		System.out.println("======================= Initialized =======================");
	}
}

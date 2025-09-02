package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class AddminServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AddminServiceApplication.class, args);
	}

	@Bean
	@Primary
	public RestTemplate ress() {
		return new RestTemplate() ;
	}
}

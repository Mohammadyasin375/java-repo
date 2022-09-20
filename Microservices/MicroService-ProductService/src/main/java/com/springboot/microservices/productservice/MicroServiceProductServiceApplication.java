package com.springboot.microservices.productservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MicroServiceProductServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroServiceProductServiceApplication.class, args);
	}

}

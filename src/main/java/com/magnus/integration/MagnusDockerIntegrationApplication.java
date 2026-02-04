package com.magnus.integration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MagnusDockerIntegrationApplication {

	public static void main(String[] args) {
		System.out.println("Hello Jenkins i am here");
		SpringApplication.run(MagnusDockerIntegrationApplication.class, args);
	}

}

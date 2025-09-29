package com.microservis.student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MicroservisStudentApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservisStudentApplication.class, args);
	}

}

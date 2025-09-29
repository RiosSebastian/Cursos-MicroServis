package com.microservis.course;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MicroservisCourseApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservisCourseApplication.class, args);
	}

}

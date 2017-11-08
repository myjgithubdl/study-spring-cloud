package com.myj.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringCloudSleuth2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudSleuth2Application.class, args);
	}
}

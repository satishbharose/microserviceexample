package com.mypack.hystix.dashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
@EnableEurekaClient
public class HystixDashboardApplication {
//http://localhost:9295/hystrix
	public static void main(String[] args) {
		SpringApplication.run(HystixDashboardApplication.class, args);
	}

}

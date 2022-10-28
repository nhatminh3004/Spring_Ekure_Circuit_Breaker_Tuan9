package com.gatewayservice.demo_gatewayservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoGatewayserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoGatewayserviceApplication.class, args);
	}
	@Bean
	RouteLocator gateway (RouteLocatorBuilder rlb) {
		return  rlb.routes()

				.route( routePec -> routePec.path
								("/user").filters( gatewayFilterSpec -> gatewayFilterSpec
								.setPath("/hello"))
						.uri("http://localhost:1111/")).
				route( routePec -> routePec.path
								("/department").filters( gatewayFilterSpec -> gatewayFilterSpec
								.setPath("/hello"))
						.uri("http://localhost:2222/")).build();

	}

}

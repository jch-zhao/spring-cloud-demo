package com.wsddata.general.springcloud.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringCloudEureka {
	public static void main(String[] args) {
		SpringApplication.run(SpringCloudEureka.class, args);
	}
}

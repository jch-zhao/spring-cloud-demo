package com.wsddata.general.springcloud.casclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
//@EnableDiscoveryClient  //如不想通过网关访问，注释本行
public class App{
	public static void main( String[] args ){
    	SpringApplication.run(App.class, args);
    }
}

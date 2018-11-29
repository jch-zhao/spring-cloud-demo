package com.wsddata.general.springcloud.provider1.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	/**
	 * 如通过网关进行调用，一级路径为配置文件中的spring.application.name。
	 * 如下面api通过网关调用地址为http://{gateway}/provider1/hello/xx
	 * @param name
	 * @return
	 */
	@RequestMapping("/hello/{name}")
	public String hello(@PathVariable("name") String name){
		return "hello "+name+": this is main return messge";
	}
}

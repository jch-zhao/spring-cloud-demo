package com.wsddata.general.springcloud.provider2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.wsddata.general.springcloud.provider1.service.SayHiService;

@RestController
@ComponentScan({"com.wsddata.general.springcloud"})
public class OtherController {
	@Autowired
	private SayHiService sayHiService;
	
	@RequestMapping("/getOther")
	public String getOtherService(@RequestParam("name")String name){
		return sayHiService.sayHi(name);
	}
}

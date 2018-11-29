package com.wsddata.general.springcloud.provider1.service;

import org.springframework.stereotype.Service;

@Service
public class SayHiServiceImpl implements SayHiService{

	@Override
	public String sayHi(String name) {
		return "hi, "+name;
	}

}

package com.wsddata.general.springcloud.casclient.controller;

import javax.servlet.http.HttpSession;
import org.springframework.security.core.context.SecurityContextImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.wsddata.general.springcloud.casclient.entity.UserInfo;

@RestController
public class RestrictedApi {
	/**
	 * 各方法的第一级路径映射应与配置文件中的spring.application.name相同，这样网关可以自动进行转发
	 */
	
	//需要登录验证(需对外提供的api尽量不要加验证，否则登录后会自动返回到设置的地址，造成第一次访问不能成功)
	@RequestMapping(value="/private/login",method=RequestMethod.GET,produces="text/plain;charset=utf-8")
	public String login(){
		return "login success";
	}
	
	//不需要登录验证
	@RequestMapping(value="/public/show",method=RequestMethod.GET,produces="text/plain;charset=utf-8")
	public String show(){
		return "show";
	}
	
	//获取用户详细信息
	@RequestMapping(value="/whoami",method=RequestMethod.GET,produces="application/json;charset=utf-8")
	public UserInfo showUser(HttpSession session){
		
		UserInfo u = new UserInfo(); 
		SecurityContextImpl scImpl = (SecurityContextImpl) session.getAttribute("SPRING_SECURITY_CONTEXT");
		if(scImpl!=null){
			u = (UserInfo) scImpl.getAuthentication().getPrincipal();
		}		
		return u;
	}
}

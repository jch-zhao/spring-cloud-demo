package com.wsddata.cas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
/**
 * 为cas增加自定义服务示例代码，除需要加上Controller注解外，
 * 还需要在 src\main\webapp\WEB-INF\classes\META-INF\spring.factories注册类
 * @author zhaojc
 *
 */

@RestController
public class AppInfo {
	@RequestMapping(value="/getAppInfo",method=RequestMethod.GET,produces="application/json")
	public List<Map> getAppInfo(){
		List res=new ArrayList();
		Map appInfo1 =new HashMap();
		appInfo1.put("appId","app0");
		appInfo1.put("appName","local admin system");
		Map appInfo2 =new HashMap();
		appInfo2.put("appId","app1");
		appInfo2.put("appName","图书馆自动化系统");
		res.add(appInfo1);
		res.add(appInfo2);
		return res;
	}
}

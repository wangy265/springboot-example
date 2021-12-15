package com.wang.ms.proxy.dynamic_proxy;

import java.lang.reflect.Proxy;

import com.wang.ms.proxy.static_proxy.SmsService;
import com.wang.ms.proxy.static_proxy.SmsServiceImpl;

public class JdkProxyFactory {
	
	 public static Object getProxy(Object target) {
		 return Proxy.newProxyInstance(
				 target.getClass().getClassLoader(), 
				 target.getClass().getInterfaces(), 
				 new DebugInvocationHandler(target)
				 );
	 }
	 
	 public static void main(String[] args) {
		 SmsService smsService = (SmsService) JdkProxyFactory.getProxy(new SmsServiceImpl());
		 smsService.sendMessage("test dynamic proxy");
	}

}

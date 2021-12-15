package com.wang.ms.proxy.dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DebugInvocationHandler implements InvocationHandler{
	
	
	private final Object target;
	
	public DebugInvocationHandler(Object target) {
        this.target = target;
    }

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		log.info("begin method {}",method.getName());
		Object result = method.invoke(target, args);
		log.info("end method {}",method.getName());
		return result;
	}

}

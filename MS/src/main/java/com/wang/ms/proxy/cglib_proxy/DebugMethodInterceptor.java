package com.wang.ms.proxy.cglib_proxy;

import java.lang.reflect.Method;

import lombok.extern.slf4j.Slf4j;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

@Slf4j
public class DebugMethodInterceptor implements MethodInterceptor{

	@Override
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
		log.info("before method " + method.getName());
		Object object = proxy.invokeSuper(obj, args);
		log.info("after method " + method.getName());
		return object;
	}

}

package com.wang.step2.factory.config;

public interface SingletonBeanRegistry {

	Object getSingleton(String beanName);
	
}

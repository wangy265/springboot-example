package com.wang.step2.factory.support;

import java.util.HashMap;
import java.util.Map;

import com.wang.step2.factory.config.SingletonBeanRegistry;

public class DefaultSingletonBeanRegistry implements SingletonBeanRegistry {

	private Map<String, Object> singletonObjects = new HashMap<>();

	@Override
	public Object getSingleton(String beanName) {
		return singletonObjects.get(beanName);
	}

	protected void addSingleton(String beanName, Object singletonObject) {
		singletonObjects.put(beanName, singletonObject);
	}

}

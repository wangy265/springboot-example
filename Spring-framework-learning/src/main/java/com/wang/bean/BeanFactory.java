package com.wang.bean;

import java.util.HashMap;
import java.util.Map;

public class BeanFactory {
	
	private Map<String,BeanDefinition> beanDefinitionMap  = new HashMap<>();
	
	public Object getbean(String name){
		return beanDefinitionMap.get(name).getBean();
	}
	
	public void register(String name, BeanDefinition beanDefinition) {
		beanDefinitionMap.put(name, beanDefinition);
	}

}

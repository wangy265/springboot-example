package com.wang.bean;

public class BeanDefinition {
	
	private Object bean;
	
	BeanDefinition(Object bean){
		this.bean = bean;
	}
	
	public Object getBean() {
		return bean;
	}
	
}

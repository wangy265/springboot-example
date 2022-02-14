package com.wang.step3.factory.config;

@SuppressWarnings("rawtypes")
public class BeanDefinition {
	
	private Class beanClass;
	
	BeanDefinition(Class beanClass){
		this.setBeanClass(beanClass);
	}

	public Class getBeanClass() {
		return beanClass;
	}

	public void setBeanClass(Class beanClass) {
		this.beanClass = beanClass;
	}

}

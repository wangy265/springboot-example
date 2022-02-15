package com.wang.step4.factory.config;

public class BeanReference {
	
	private String beanName;
	
	BeanReference(String beanName){
		this.setBeanName(beanName);
	}

	public String getBeanName() {
		return beanName;
	}

	public void setBeanName(String beanName) {
		this.beanName = beanName;
	}

}

package com.wang.step3.factory;


public interface BeanFactory {
	
	Object getBean(String name);
	
	Object getBean(String name, Object... args);

}

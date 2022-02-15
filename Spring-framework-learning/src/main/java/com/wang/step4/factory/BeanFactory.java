package com.wang.step4.factory;

public interface BeanFactory {
	
	Object getBean(String name);
	
	Object getBean(String name, Object... args);

}

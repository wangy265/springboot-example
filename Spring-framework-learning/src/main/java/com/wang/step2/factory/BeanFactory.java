package com.wang.step2.factory;

import com.wang.step2.BeansException;

public interface BeanFactory {
	
	Object getBean(String name) throws BeansException;

}

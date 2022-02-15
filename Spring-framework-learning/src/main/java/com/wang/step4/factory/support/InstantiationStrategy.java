package com.wang.step4.factory.support;

import java.lang.reflect.Constructor;

import com.wang.step4.factory.config.BeanDefinition;

public interface InstantiationStrategy {
	
	Object instantiate(BeanDefinition beanDefinition, String beanName,  Constructor<?> ctor, Object[] args);

}

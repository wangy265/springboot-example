package com.wang.step4.factory.support;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import com.wang.step4.BeansException;
import com.wang.step4.factory.config.BeanDefinition;

@SuppressWarnings("rawtypes")
public class SimpleInstantiationStrategy implements InstantiationStrategy{

	@SuppressWarnings("unchecked")
	@Override
	public Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor ctor, Object[] args) {
		Class clazz = beanDefinition.getBeanClass();
		try {
            if (null != ctor) {
                return clazz.getDeclaredConstructor(ctor.getParameterTypes()).newInstance(args);
            } else {
                return clazz.getDeclaredConstructor().newInstance();
            }
        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            throw new BeansException("Failed to instantiate [" + clazz.getName() + "]", e);
        }
	}

}

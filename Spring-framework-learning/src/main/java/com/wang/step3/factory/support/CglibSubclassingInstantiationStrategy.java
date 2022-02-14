package com.wang.step3.factory.support;

import java.lang.reflect.Constructor;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.NoOp;

import com.wang.step3.factory.config.BeanDefinition;

public class CglibSubclassingInstantiationStrategy implements InstantiationStrategy {

	@Override
	public Object instantiate(BeanDefinition beanDefinition, String beanName, @SuppressWarnings("rawtypes") Constructor ctor, Object[] args) {
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(beanDefinition.getBeanClass());
		enhancer.setCallback(new NoOp() {
			@Override
			public int hashCode() {
				return super.hashCode();
			}
			@Override
			public boolean equals(Object obj) {
				return super.equals(obj);
			}

		});
		if (null == ctor)
			return enhancer.create();
		return enhancer.create(ctor.getParameterTypes(), args);
	}

}

package com.wang.step4.factory.support;

import com.wang.step4.factory.config.BeanDefinition;
import com.wang.step4.factory.BeanFactory;

public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {

	@Override
	public Object getBean(String name) {
		return doGetBean(name, null);
	}

	@Override
	public Object getBean(String name, Object... args) {
		return doGetBean(name, args);
	}

	private Object doGetBean(String name, final Object[] args) {
		Object bean = getSingleton(name);
		if (bean != null) {
			return bean;
		}

		BeanDefinition beanDefinition = getBeanDefinition(name);
		return createBean(name, beanDefinition, args);
	}

	protected abstract BeanDefinition getBeanDefinition(String beanName);

	protected abstract Object createBean(String beanName, BeanDefinition beanDefinition, Object[] args);
}

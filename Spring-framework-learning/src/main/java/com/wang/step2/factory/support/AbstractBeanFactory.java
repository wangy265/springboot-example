package com.wang.step2.factory.support;

import com.wang.step2.factory.BeanFactory;
import com.wang.step2.factory.config.BeanDefinition;

public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {

	@Override
	public Object getBean(String name){
		Object bean = getSingleton(name);
		if (bean != null) {
			return bean;
		}

		BeanDefinition beanDefinition = getBeanDefinition(name);
		return createBean(name, beanDefinition);
	}

	protected abstract BeanDefinition getBeanDefinition(String beanName);

	protected abstract Object createBean(String beanName, BeanDefinition beanDefinition);

}

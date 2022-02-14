package com.wang.step2.factory.support;

import com.wang.step2.BeansException;
import com.wang.step2.factory.config.BeanDefinition;

public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory {

	@Override
	@SuppressWarnings("deprecation")
    protected Object createBean(String beanName, BeanDefinition beanDefinition){
        Object bean = null;
        try {
            bean = beanDefinition.getBeanClass().newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new BeansException("Instantiation of bean failed", e);
        }

        addSingleton(beanName, bean);
        return bean;
    }

}

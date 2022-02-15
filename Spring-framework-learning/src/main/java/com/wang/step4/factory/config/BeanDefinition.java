package com.wang.step4.factory.config;

import com.wang.step4.PropertyValues;

@SuppressWarnings("rawtypes")
public class BeanDefinition {
	
	private Class beanClass;
	private PropertyValues propertyValues;

	public BeanDefinition(Class beanClass) {
		this.beanClass = beanClass;
		this.propertyValues  = new PropertyValues();
	}
	
	BeanDefinition(Class beanClass,PropertyValues propertyValues){
		this.beanClass = beanClass;
		this.propertyValues  = propertyValues !=null?propertyValues:new PropertyValues();
	}
	

	public Class getBeanClass() {
		return beanClass;
	}

	public void setBeanClass(Class beanClass) {
		this.beanClass = beanClass;
	}

	public PropertyValues getPropertyValues() {
		return propertyValues;
	}

	public void setPropertyValues(PropertyValues propertyValues) {
		this.propertyValues = propertyValues;
	}

}

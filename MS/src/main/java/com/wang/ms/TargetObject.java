package com.wang.ms;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.springframework.util.ReflectionUtils;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TargetObject {

	private String value;

	public TargetObject() {
		value = "JavaGuide";
	}
	
	public void publicMethod(String s) {
        log.info("I love " + s);
    }

    @SuppressWarnings("unused")
	private void privateMethod() {
    	log.info("value is " + value);
    }
    
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, NoSuchFieldException {
    	Class<?> tagetClass = Class.forName("com.wang.ms.TargetObject");
    	TargetObject targetObject = (TargetObject) tagetClass.getDeclaredConstructor().newInstance();
    	
    	Method[] methods = tagetClass.getDeclaredMethods();
    	for (Method method : methods) {
			log.info("Method name = {}",method.getName());
		}
    	
    	Method method = tagetClass.getDeclaredMethod("publicMethod", String.class);
    	log.info("get method name by name and input ");
    	log.info(method.getName());
    	
    	method.invoke(targetObject, "test mothod");
    	
    	Field field = tagetClass.getDeclaredField("value");
    	ReflectionUtils.makeAccessible(field);
    	ReflectionUtils.setField(field, targetObject, "Java Guide");
        
        Method privateMethod = tagetClass.getDeclaredMethod("privateMethod");
        ReflectionUtils.makeAccessible(privateMethod);
        privateMethod.invoke(targetObject);
    	
	}

}

package com.wangy265.java.base;

import java.lang.reflect.InvocationTargetException;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SingleSecurity {
	
	private static final SingleSecurity INSTANSE = new SingleSecurity();
	
	private SingleSecurity() {
		
	}
	
	public static SingleSecurity getInstance() {
		return INSTANSE;
	}
	
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException,  InvocationTargetException, NoSuchMethodException, SecurityException {
		
		SingleSecurity one =  SingleSecurity.getInstance();
		SingleSecurity two =  SingleSecurity.getInstance();
		log.info(one.equals(two)+"");
		
    	Class<?> tagetClass = Class.forName("com.wangy265.java.base.SingleSecurity");
    	SingleSecurity targetObject = (SingleSecurity) tagetClass.getDeclaredConstructor().newInstance();
    	log.info(one.equals(targetObject)+"");
	}

}

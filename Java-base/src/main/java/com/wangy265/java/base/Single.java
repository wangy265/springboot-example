package com.wangy265.java.base;

import java.lang.reflect.InvocationTargetException;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Single {
	
	public static final Single INSTANSE = new Single();
	
	private Single() {}
	
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		
		Single one =  Single.INSTANSE;
		Single two =  Single.INSTANSE;
		log.info(one.equals(two)+"");
		
    	Class<?> tagetClass = Class.forName("com.wangy265.java.base.Single");
    	Single targetObject = (Single) tagetClass.getDeclaredConstructor().newInstance();
    	log.info(one.equals(targetObject)+"");
		
	}

}

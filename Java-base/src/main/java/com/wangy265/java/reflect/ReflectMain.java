package com.wangy265.java.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectMain {
	
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
		//获取class 对象
		Class small = SmallPineapple.class;
		Class small2  = Class.forName("com.wangy265.java.reflect.SmallPineapple");
		SmallPineapple testPineapple = new SmallPineapple();
		Class small3 =  testPineapple.getClass();

		//通过默认构造器实例化对象
		SmallPineapple smallPineapple = (SmallPineapple) small.newInstance();
		smallPineapple.getInfo();
		
		//通过指定构造器实例化对象
		Constructor constructor = small.getConstructor(String.class,int.class);
		constructor.setAccessible(true);
		SmallPineapple smallPineapple2 = (SmallPineapple) constructor.newInstance("xxx",21);
		smallPineapple2.getInfo();
		
		System.out.println();
		//获取变量信息
		Field[] fields =  small.getDeclaredFields();
		for (Field field : fields) {
			System.out.println(field.getName()+"=="+field.getType());
			
		};
		
		//获取方法
		Method[] methods = small.getDeclaredMethods();
		for (Method method : methods) {
			System.out.println(method.getName());
		}
		
		//执行方法
		Method method = small.getMethod("getInfo",String.class,String.class);
		method.invoke(smallPineapple, "xxx","yyy");
		
	}

}

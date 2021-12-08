package com.wang.singleton;

public class Singleton {

	 private volatile static Singleton uniqueSingleton;

	private Singleton() {
		// prevent init by other
	}

	
	
	public static  Singleton getUniqueInstance() {
		if (uniqueSingleton == null) {
			synchronized (Singleton.class) {
				uniqueSingleton = new Singleton();
			}
		}
		return uniqueSingleton;
	}

}

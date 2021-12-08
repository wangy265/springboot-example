package com.wang.singleton;

public class SingletonHo {

	private SingletonHo() {
		
	}
	
	private static class SingletonHolder {
		private static final SingletonHo INSTANCE = new SingletonHo();
	}

	public static SingletonHo getUniqueInstance() {
		return SingletonHolder.INSTANCE;
	}

}

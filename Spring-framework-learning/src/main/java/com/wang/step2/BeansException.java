package com.wang.step2;

public class BeansException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public BeansException(String msg) {
        super(msg);
    }

    public BeansException(String msg, Throwable cause) {
        super(msg, cause);
    }

}

package com.wangy265.java.base;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class IntToByte {
	
	public static void main(String[] args) {
		int intdata = 127;
		byte data = (byte) intdata;
		log.info("int to byte = {}",data);
	}

}

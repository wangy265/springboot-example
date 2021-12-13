package com.wangy265.java.base;


import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ByteToString {

	public static void main(String[] args) {
		byte[] b = new byte[] {100, 104, 100, 100, 106, 104};
		log.info("begin byte to string,byte data = {}",b);
		String ataString = new String(b); 
		log.info("transfor string data ={}",ataString);
	}
	
}

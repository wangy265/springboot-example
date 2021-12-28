package com.wang.ioc;

import java.util.Map;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class IOCDemo { 

	public static void main(String[] args) {
		ConfigurableApplicationContext  context = new ClassPathXmlApplicationContext("classpath:application-ioc.xml");
		IOCService iocService= context.getBean(IOCService.class);
		context.close();
		log.info(iocService.hollo());
		
		Map<String,String> data = System.getenv();
//		data.put("xxx_ffff", "aa");
//		data.put("XXX_FFFF", "bb");
		
		
		log.info(data+"");
		
	}

}

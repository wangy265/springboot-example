package com.wang.ms.proxy.static_proxy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ProxySmsService implements SmsService{
	
	SmsServiceImpl serviceImpl;
	
	public ProxySmsService (SmsServiceImpl serviceImpl){
		this.serviceImpl = serviceImpl;
	}
	
	public static void main(String[] args) {
		SmsServiceImpl serviceImpl = new SmsServiceImpl();
		ProxySmsService proxySmsService = new ProxySmsService(serviceImpl);
		proxySmsService.sendMessage("test proxy");
	}

	@Override
	public String sendMessage(String message) {
		log.info("before method send()");
		serviceImpl.sendMessage(message);
		log.info("after method send()");
		return message;
	}

}

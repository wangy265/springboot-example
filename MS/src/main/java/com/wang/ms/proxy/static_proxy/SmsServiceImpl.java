package com.wang.ms.proxy.static_proxy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SmsServiceImpl implements SmsService{

	@Override
	public String sendMessage(String message) {
		log.info("simulation send message");
		return message;
	}
}

package com.wang.ms.proxy.cglib_proxy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AliSmsService {
    public String send(String message) {
        log.info("send message:" + message);
        return message;
    }
}

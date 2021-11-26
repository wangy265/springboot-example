package com.wang.mediator;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Alarm extends Colleague {

    @Override
    public void onEvent(Mediator mediator) {
        mediator.doEvent("alarm");
    }

    public void doAlarm() {
        log.info("doAlarm()");
    }
}

package com.wang.mediator;

public class ConcreteMediator extends Mediator {

	private Alarm alarm;
	private CoffeePot coffeePot;

	public ConcreteMediator(Alarm alarm, CoffeePot coffeePot) {
		this.alarm = alarm;
		this.coffeePot = coffeePot;
	}

	@Override
	public void doEvent(String eventType) {
		switch (eventType) {
			case "alarm":
				doAlarmEvent();
				break;
			case "coffeePot":
				doCoffeePotEvent();
				break;
			case "calender":
				doCalenderEvent();
				break;
			default:
				doSprinklerEvent();
		}
	}

	public void doAlarmEvent() {
		alarm.doAlarm();
		coffeePot.doCoffeePot();
	}

	public void doCoffeePotEvent() {
		// ...
	}

	public void doCalenderEvent() {
		// ...
	}

	public void doSprinklerEvent() {
		// ...
	}
}

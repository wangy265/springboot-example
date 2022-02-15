package com.wang.step4;

public class PropertyValue {
	
	private String name;
	private Object value;
	
	PropertyValue(String name,Object value){
		this.setName(name);
		this.setValue(value);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}

}

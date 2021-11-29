package com.wang.abstract_document.domain;

import java.util.Map;

import com.wang.abstract_document.AbstractDocument;

public class Car extends AbstractDocument implements HasModel, HasPrice, HasParts{

	public Car(Map<String, Object> properties) {
		super(properties);
	}

}

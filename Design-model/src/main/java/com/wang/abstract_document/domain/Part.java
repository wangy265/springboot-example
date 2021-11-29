package com.wang.abstract_document.domain;

import java.util.Map;

import com.wang.abstract_document.AbstractDocument;

public class Part extends AbstractDocument implements HasModel, HasPrice, HasType{

	protected Part(Map<String, Object> properties) {
		super(properties);
	}

}

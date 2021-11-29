package com.wang.abstract_document.domain;

import java.util.Optional;

import com.wang.abstract_document.Document;

public interface HasModel extends Document {

	String PROPERTY = "model";

	default Optional<String> getModel() {
		return Optional.ofNullable((String) get(PROPERTY));
	}

}

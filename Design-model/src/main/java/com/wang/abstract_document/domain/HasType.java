package com.wang.abstract_document.domain;

import java.util.Optional;

import com.wang.abstract_document.Document;

public interface HasType extends Document {

	String PROPERTY = "type";

	default Optional<String> getType() {
		return Optional.ofNullable((String) get(PROPERTY));
	}

}

package com.wang.abstract_document.domain;

import java.util.Optional;

import com.wang.abstract_document.Document;

public interface HasPrice extends Document {

	String PROPERTY = "price";

	default Optional<Number> getPrice() {
		return Optional.ofNullable((Number) get(PROPERTY));
	}

}

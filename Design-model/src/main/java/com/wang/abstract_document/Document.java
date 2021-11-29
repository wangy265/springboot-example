package com.wang.abstract_document;

import java.util.stream.Stream;
import java.util.Map;
import java.util.function.Function;

public interface Document {

	Void put(String key, Object value);

	Object get(String key);

	<T> Stream<T> children(String key, Function<Map<String, Object>, T> constructor);

}

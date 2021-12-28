package com.wangy265.java.stream;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StreamLearning {

	public static void main(String[] args) {
		Stream<String> stream = Stream.of("I", "love", "you", "too");
		Map<String, Integer> map = stream.collect(Collectors.toMap(a -> a , String::length));
		map.entrySet().stream().forEach((Map.Entry<String,Integer> entry) -> log.info(entry.getKey()));
		
//		List<String> list = stream.collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
		
		
	}
	
}

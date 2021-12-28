package com.wangy265.java.collection;

import java.util.List;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ArrayList {
	
	public static void main(String[] args) {
		List<String> list = new java.util.ArrayList<>();
		list.add("xx");
		log.info("size :{}",list.size());
	}

}

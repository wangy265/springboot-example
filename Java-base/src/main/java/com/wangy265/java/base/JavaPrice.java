package com.wangy265.java.base;

import java.math.BigDecimal;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class JavaPrice {
	
	
	private BigDecimal priceBigDecimal = new BigDecimal(13344);
	private Double priceDouble = 1222.0;
	
	public static void main(String[] args) {
		JavaPrice javaPrice = new JavaPrice();
		log.info("big decimal price = {}",javaPrice.priceBigDecimal);
		log.info("double price = {}",javaPrice.priceDouble);
		
	}

}

package com.wang.memento;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Client {
	
	public static void main(String[] args) {
		
		Calculator calculator = new CalcutorImp();
		
		calculator.setFirstNumber(100);
		calculator.setSecondNumber(50);
		
		log.info("result = {}",calculator.getCalculationResult());
		
		PreviousCalculationToCareTaker memento = calculator.backupLastCalculation();
		
		calculator.setFirstNumber(20);
		calculator.setSecondNumber(30);
		
		log.info("update after result = {}",calculator.getCalculationResult());
		
		calculator.restorePreviousCalculation(memento);
		
		log.info("update before result = {}",calculator.getCalculationResult());
		
		
	}

}

package com.wang.memento;

public class CalcutorImp implements Calculator{
	
	private int firstNumber;
	private int secondNumber;

	public PreviousCalculationToCareTaker backupLastCalculation() {
		return new PreviousCalculationImp(firstNumber, secondNumber);
	}

	public void restorePreviousCalculation(PreviousCalculationToCareTaker memento) {
		this.firstNumber = ((PreviousCalculationImp)memento).getFirstNumber();
		this.secondNumber = ((PreviousCalculationImp)memento).getSecondNumber();
	}

	public int getCalculationResult() {
		return firstNumber + secondNumber;
	}

	public void setFirstNumber(int firstNumber) {
		this.firstNumber  =firstNumber;
		
	}

	public void setSecondNumber(int secondNumber) {
		this.secondNumber = secondNumber;
		
	}

}

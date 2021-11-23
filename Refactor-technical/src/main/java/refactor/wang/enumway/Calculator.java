package refactor.wang.enumway;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Calculator {
	
	public int calculate(int a, int b, Operator operator) {
	    return operator.apply(a, b);
	}
	
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		log.info("data ={}",calculator.calculate(3, 4, Operator.valueOf("ADD")));
	}


}

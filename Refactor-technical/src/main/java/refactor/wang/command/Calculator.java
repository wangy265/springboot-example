package refactor.wang.command;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Calculator {
	
	public int calculate(Command command) {
	    return command.execute();
	}
	
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		log.info("data = {}", calculator.calculate(new AddCommand(2,4)));
	}

}

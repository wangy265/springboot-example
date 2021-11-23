package refactor.wang.basic;

/**
 * @Date 20211123
 * @author Wang
 *
 */
public class Main {
	
	public int calculate(int a, int b, CalculateOperator operator) {
		int result = Integer.MIN_VALUE;
		if(CalculateOperator.ADD.equals(operator)) {
			result = a+b;
		}else if(CalculateOperator.REDUCE.equals(operator)){
			result = a-b;
		}
		return result;
	}

	
	public int calculateUsingSwitch(int a, int b, String operator) {
		int result = Integer.MIN_VALUE;
		switch (operator) {
		case "add":
			result = a + b;
			break;
		case "reduce":
			result = a - b;
			break;
		default:
			break;
		}
		return result;
	}
	
	
}

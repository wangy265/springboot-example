package refactor.wang.factory;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import lombok.extern.slf4j.Slf4j;

/**
 * 
 * @author Wang
 *
 */
@Slf4j
public class OperatorFactory {

	static Map<String, Operation> operationMap = new HashMap<>();
	static {
		operationMap.put("add", new Addition());
		operationMap.put("divide", new Division());
	}

	public static Optional<Operation> getOperation(String operator) {
		return Optional.ofNullable(operationMap.get(operator));
	}
	
	public int calculateUsingFactory(int a, int b, String operator) {
	    Operation targetOperation = OperatorFactory
	      .getOperation(operator)
	      .orElseThrow(() -> new IllegalArgumentException("Invalid Operator"));
	    return targetOperation.apply(a, b);
	}

	
	public static void main(String[] args) {
		
		OperatorFactory operatorFactory = new OperatorFactory();
		log.info("Data = {}",operatorFactory.calculateUsingFactory(1, 2, "add"));
		
	}
}

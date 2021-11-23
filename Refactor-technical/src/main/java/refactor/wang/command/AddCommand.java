/**
 * 
 */
package refactor.wang.command;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author Wang
 *
 */
@AllArgsConstructor
@Data
public class AddCommand implements Command {
	
	private int a;
	private int b;

	@Override
	public Integer execute() {
		return a+b;
	}

}

package leetcode.base;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class IsValid {
	
	private boolean isValidSolution(String data) {
		char[] charData =  data.toCharArray();
		char[] stack = new char[data.length() + 1];
		int top = 1;
		for (char c : charData) {
			if(c=='('||c=='['||c=='{') {
				stack[top++] = c;
			}else if (c==')'&& stack[--top]!='(') {
				return false;
			}else if (c==']'&& stack[--top]!='[') {
				return false;
			}else if (c=='}'&& stack[--top]!='{') {
				return false;
			}
		}
		return top == 1;
	}
	
	public static void main(String[] args) {
		IsValid isValid = new IsValid();
		String data = "{[(sss)]}{";
		boolean flag = isValid.isValidSolution(data);
		log.info("data = {} is valid {} ",data ,flag);
	}

}

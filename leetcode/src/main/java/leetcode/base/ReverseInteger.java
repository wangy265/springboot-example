package leetcode.base;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ReverseInteger {
	
	public int reverseIntegerSolution1(int x) {
		
		 long res = 0;
		 for (; x!=0 ; x/=10) {
			 res = res * 10 + x % 10;
		 }
		 res = res > Integer.MAX_VALUE || res < Integer.MIN_VALUE ? 0 : (int) res;
		 log.info("result = {}",res);
		 return (int) res;
		
	}
	
	public static void main(String[] args) {
		ReverseInteger reverseInteger = new ReverseInteger();
		reverseInteger.reverseIntegerSolution1(123);
	}

}

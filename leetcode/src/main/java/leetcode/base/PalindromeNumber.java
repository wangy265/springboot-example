package leetcode.base;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PalindromeNumber {
	
	public boolean palindromeNumberSolution(int x) {
		if(x < 0) {
			log.info("{} is not palindrome number",x);
			return false;
		}else {
			int temp = x;
			long res = 0;
			for (; x != 0; x /= 10) {
				res = res * 10 + x % 10;
			}
			res = res > Integer.MAX_VALUE || res < Integer.MIN_VALUE ? 0 : (int) res;
			log.info("{} is not palindrome number:{}",temp,temp == res);
			return temp == res;
		}
	}
	
	public static void main(String[] args) {
		PalindromeNumber palindromeNumber = new PalindromeNumber();
		palindromeNumber.palindromeNumberSolution(-12321);
	}

}

package leetcode.base;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LongestCommonPrefix {
	
	private String longestCommonPrefixSolution(String[] data) {
		String longestCommonPrefix = "";
		if(data.length!=0) {
			int minLen = getMinLen(data);
			 for (int j = 0; j < minLen; ++j) {
				 for (int i = 1; i < data.length; ++i) {
					 if (data[0].charAt(j) != data	[i].charAt(j)) {
						 longestCommonPrefix = data[0].substring(0, j);
						 log.info("data = {} has longestCommonPrefix = {}",data,longestCommonPrefix);
						 return longestCommonPrefix;
					 }
				 }
			 }
			 longestCommonPrefix = data[0].substring(0, minLen);
		}
		log.info("data = {} has longestCommonPrefix = {}",data,longestCommonPrefix);
		return longestCommonPrefix;
	}

	private int getMinLen(String[] data) {
		int minLen = 0x7fffffff;
		for (String string : data) {
			minLen = Math.min(string.length(), minLen);
		}
		log.info("minLen = {}",minLen);
		return minLen;
	}
	
	public static void main(String[] args) {
		LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
		String[] data  = {"flower","flowz","flight"}; 
		longestCommonPrefix.longestCommonPrefixSolution(data);
	}

}

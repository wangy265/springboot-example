package leetcode.base;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ImplementStrStr {
	
	private int implementStrStrSolution(String haystack ,String needle) {
		int l1 = haystack.length();
		int l2 = needle.length();
		if(l1 < l2) return -1;
		for (int i = 0; i < l1; i++) {
			if (i + l2 > l1)
				return -1;
			for (int j = 0;; j++) {
				if (j == l2) return i;
				if (haystack.charAt(i + j) != needle.charAt(j)) break;
			}
		}
		return 0;
	}
	
	public static void main(String[] args) {
		ImplementStrStr implementStrStr = new ImplementStrStr();
		String haystack ="hello";
		String needle ="ll";
		implementStrStr.implementStrStrSolution(haystack, needle);
		log.info("{} find sub string {} ",haystack,needle);
	}

}

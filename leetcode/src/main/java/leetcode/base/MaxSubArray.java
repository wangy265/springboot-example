package leetcode.base;


public class MaxSubArray {
	
	public int maxSubArraySolution(int[] data) {
		int len = data.length;
		if(len>1) {
			int dp = data[0];
			int max = dp;
			for (int i = 1; i < len; i++) {
				dp = data[i] + (dp>0?dp:0);
				if(dp>max) max = dp;
			}
			return max;
		}
		return 0;
	}

}

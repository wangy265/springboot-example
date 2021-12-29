package leetcode.base;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DivingBoard {
	
	private int[] divingBoardSolution(int shorter, int longer, int k) {
		if(k!=0) {
			if(shorter==longer) {
				int[] result = new int[] {k*shorter};  
				log.info("result={}",result);
				return result;
			}else {
				int[] result = new int[4];
				for (int i = 0; i < k; i++) {
					result[i] = (k-i)*shorter + longer*i;
				}
				log.info("result={}",result);
				return result;
			}
		}
		return new int[] {};
	}

	public static void main(String[] args) {
		DivingBoard divingBoard = new DivingBoard();
		int shorter = 2;
		int longer = 3;
		int k = 4;
		divingBoard.divingBoardSolution(shorter, longer, k);
	}
}

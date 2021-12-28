package leetcode.base;

import java.util.HashMap;
import java.util.Map;

import lombok.extern.slf4j.Slf4j;


/*
 * Given nums = [2, 7, 11, 15], target = 9,
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 */


@Slf4j
public class TwoSum {
	
	public int[] twoSumSolution1(int[] nums, int target) {
		
		for (int i = 0; i < nums.length; i++) {
			for (int j = i+1; j < nums.length; j++) {
				if(nums[i]+nums[j]==target) {
					log.info("nums[{}] + nums[{}] = {}",i,j,target);
					return new int[] {i,j};
				}
			}
		}

		return new int[] {};
	}
	
	public int[] twoSumSolution2(int[] nums, int target) {
		
		Map<Integer,Integer> data = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			Integer value = data.get(nums[i]);
			if(value!=null) {
				log.info("nums[{}] + nums[{}] = {}",value,i,target);
				return new int[] { value, i };
			}
			data.put(target-nums[i], i);
		}
		
		return new int[] {};
	}
	
	
	public static void main(String[] args) {
		TwoSum twoSum = new TwoSum();
		int[] nums = {2, 7, 11, 15};
		int target = 9;
		twoSum.twoSumSolution1(nums, target);
		twoSum.twoSumSolution2(nums, target);
	}

}

package leetcode.base;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SearchInsertPosition {

	private int searchInsert(int[] nums, int target) {

		int left = 0;
		int right = nums.length - 1;
		int mid = (right + left) >> 1;
		while (left <= right) {
			if (target <= nums[mid])
				right = mid - 1;
			else {
				left = mid + 1;
			}
			mid = (right + left) >> 1;
		}
		return left;

	}
	
	public static void main(String[] args) {
		SearchInsertPosition searchInsertPosition = new SearchInsertPosition();
		int[] nums = {1,3,5,6};
		int target = 7;
		int result = searchInsertPosition.searchInsert(nums, target);
		log.info("result = {}",result);
	}

}

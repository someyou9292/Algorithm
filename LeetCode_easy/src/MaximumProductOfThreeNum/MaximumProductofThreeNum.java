package MaximumProductOfThreeNum;

import java.util.Arrays;

class Solution {
	public int maximumProduct(int[] nums) {
		
		Arrays.sort(nums);
		
		return Math.max(nums[0] * nums[1] * nums[nums.length-1], nums[nums.length-1] * nums[nums.length-2] * nums[nums.length-3]);
	}
}


public class MaximumProductofThreeNum {
	public static void main(String[] args) {
		Solution st = new Solution();
		int[] nums = { -4, -3, -2, -1, 1, 2, 5, 10, -20 };
		st.maximumProduct(nums);
	}
}

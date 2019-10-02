package ContainsDuplicate;

import java.util.HashMap;

/*
 배열에 중복되는 것이 있냐?
 
 * */

class Solution {
	public boolean containsDuplicate(int[] nums) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < nums.length; i++) {
			if (!map.containsKey(nums[i])) {
				map.put(nums[i], nums[i]);
			} else {
				return true;
			}
		}

		return false;
	}
}

public class ContainsDuplicate {
	public static void main(String[] args) {
		Solution st = new Solution();
		int[] nums = { 1, 2, 3 };
		System.out.println(st.containsDuplicate(nums));
	}
}

//class Solution {
//	public boolean containsDuplicate(int[] nums) {
//		Arrays.sort(nums);
//		for (int i = 0; i < nums.length - 1; ++i) {
//			if (nums[i] == nums[i + 1])
//				return true;
//		}
//		return false;
//	}
//}

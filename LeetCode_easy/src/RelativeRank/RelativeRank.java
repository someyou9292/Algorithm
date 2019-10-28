package RelativeRank;

import java.util.Arrays;
import java.util.HashMap;

/*
 배열이 주어지면 배열의 해당 요소 중 상위 3개의 요소를 찾아 Gold Medal, Silver Medal, Bronze Medal 을 
 주고 나머지 요소들은 각 등수를 반환하시오.
 
 Input: [5, 4, 3, 2, 1]
Output: ["Gold Medal", "Silver Medal", "Bronze Medal", "4", "5"]
 * */

class Solution {
	public String[] findRelativeRanks(int[] nums) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		String[] answer = new String[nums.length];
		int[] sorted = new int[nums.length];

		for (int i = 0; i < nums.length; i++) {
			sorted[i] = nums[i];
		}
		Arrays.sort(sorted);

		int rank = 4;
		for (int i = sorted.length - 1; i >= 0; i--) {
			if (i == sorted.length - 1) {
				map.put(sorted[i], "Gold Medal");
			} else if (i == sorted.length - 2) {
				map.put(sorted[i], "Silver Medal");
			} else if (i == sorted.length - 3) {
				map.put(sorted[i], "Bronze Medal");
			} else {
				map.put(sorted[i], String.valueOf(rank));
				rank++;
			}
		}
		
		for(int i=0; i<nums.length;i++) {
			answer[i] = map.get(nums[i]);
		}
		
		
		return answer;
	}
}

public class RelativeRank {
	public static void main(String[] args) {
		Solution st = new Solution();
		int[] nums = { 5, 4, 3, 2, 1 };
		st.findRelativeRanks(nums);
	}
}

// 효윯 84.60%
//class Solution {
//	public String[] findRelativeRanks(int[] nums) {
//		String[] answer = new String[nums.length];
//		int[] sortedArr = new int[nums.length];
//		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
//
//		if (nums.length == 1) {
//			answer[0] = "Gold Medal";
//			return answer;
//		}
//		for (int i = 0; i < nums.length; i++) {
//			sortedArr[i] = nums[i];
//		}
//
//		Arrays.sort(sortedArr);
//
//		int G = sortedArr[sortedArr.length - 1];
//		int S = sortedArr[sortedArr.length - 2];
//		int B = sortedArr[sortedArr.length - 3];
//
//		int rank = 4;
//		for (int i = sortedArr.length - 4; i >= 0; i--) {
//			map.put(sortedArr[i], rank);
//			rank++;
//		}
//
//		for (int i = 0; i < nums.length; i++) {
//			if (nums[i] == G) {
//				answer[i] = "Gold Medal";
//			} else if (nums[i] == S) {
//				answer[i] = "Silver Medal";
//			} else if (nums[i] == B) {
//				answer[i] = "Bronze Medal";
//			} else {
//				answer[i] = String.valueOf(map.get(nums[i]));
//			}
//		}
//
//		return answer;
//	}
//}

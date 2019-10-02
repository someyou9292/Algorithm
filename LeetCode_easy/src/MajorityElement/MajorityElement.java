package MajorityElement;

import java.util.HashSet;
import java.util.Iterator;

/*
 n크기의 배열이 주어지면 주된 수를 구하시오
 
 주된 수란 n/2 이상 반복되는 수입니다.
 
 Example 1:
Input: [3,2,3]
Output: 3

Example 2:
Input: [2,2,1,1,1,2,2]
Output: 2

 * */

class Solution {
	public int majorityElement(int[] nums) {
		int std = nums.length / 2;

		for (int i = 0; i < nums.length; i++) {
			int count = 0;
			for (int j = i; j < nums.length; j++) {
				if (nums[i] == nums[j]) {
					count++;
				}
				if (count > std) {
					return nums[i];
				}
			}
		}
		return -1;
	}
}

public class MajorityElement {
	public static void main(String[] args) {
		Solution st = new Solution();
		int[] nums = { 2,1,1,1,2 };

		System.out.println(st.majorityElement(nums));
	}
}

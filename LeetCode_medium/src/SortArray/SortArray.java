package SortArray;

import java.util.Arrays;

//Given an array of integers nums, sort the array in ascending order.
/*
 Example 1:
Input: [5,2,3,1]
Output: [1,2,3,5]

Example 2:
Input: [5,1,1,2,0,0]
Output: [0,0,1,1,2,5]
 * */

class Solution {
    public int[] sortArray(int[] nums) {
        Arrays.sort(nums);

        return nums;
    }
}

public class SortArray {
	public static void main(String[] args) {
		Solution st = new Solution();
		int[] nums = {5,2,3,1};
		
		System.out.print("resut >> ");
		for(int i=0; i<nums.length;i++) {
			System.out.print(st.sortArray(nums));
		}
	}
}

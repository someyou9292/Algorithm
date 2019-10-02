package RotateArray;

import java.util.Stack;

/*
 주어진 배열을 주어진 수 k 만큼 회전해라
 
 
 Input: [1,2,3,4,5,6,7] and k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
 * */

class Solution {
	public void rotate(int[] nums, int k) {

//		for(int i=0; i<k; i++) {
//			int end = nums[nums.length-1];
//			for(int j = nums.length-1; j > 0; j--) {
//				nums[j] = nums[j-1];
//			}
//			nums[0] = end;
//		}

		if(nums.length == 0) return;
		
		int n = nums.length;
		k = k % n;
		
		reverse(nums, 0, n-1);
		reverse(nums, 0, k-1);
		reverse(nums, k, n-1);
	}
	
	private void reverse(int[] nums, int i, int j ) {
		while(i < j) {
			swap(nums, i++, j--);
		}
	}
	private void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
}

public class RotateArray {
	public static void main(String[] args) {
		Solution st = new Solution();
		int[] nums = { 1,2 };
		int k = 3;
		st.rotate(nums, k);
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
	}
}

//class Solution {
//    public void rotate(int[] nums, int k) {
//        if (nums == null || nums.length == 0) {
//            return;
//        }
//        int n = nums.length;
//        k = k % nums.length;
//        reverse(nums, 0, n - 1);
//        reverse(nums, 0, k - 1);
//        reverse(nums, k, n - 1);
//    }
//    
//    private void reverse(int[] nums, int i, int j) {
//        while (i < j) {
//            swap(nums, i++, j--);
//        }
//    }
//    
//    private void swap(int[] nums, int i, int j) {
//        int temp = nums[i];
//        nums[i] = nums[j];
//        nums[j] = temp;
//    }
//}

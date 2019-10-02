package MergeSortedArray;

import java.util.Arrays;

/*
 두 배열이 주어집니다. arr1, arr2
 arr2 를 arr1에 병합하고 정렬하시면됩니다.
  * arr1 은 arr2 를 합칠정도의 충분한 크기로 주어집니다.
  
  Input:
nums1 = [1,2,3,0,0,0], m = 3
nums2 = [2,5,6],       n = 3

Output: [1,2,2,3,5,6]
 * */

class Solution {
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		for (int i = 0; i < nums2.length; i++) {
			nums1[nums1.length - 1 - i] = nums2[i];
		}
		
		Arrays.sort(nums1);
	}
}

public class MergeSortedArray {
	public static void main(String[] args) {
		Solution st = new Solution();
		int[] nums1 = { 1, 2, 3, 0, 0, 0};
		int[] nums2 = { 2, 5, 6 };
		int m = 3;
		int n = 3;
		st.merge(nums1, m, nums2, n);
		
	}
}

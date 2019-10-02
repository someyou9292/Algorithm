package FindDisappearedNumber;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/*
 1 <= a[i] <= n 의 배열이 주어지면
 배열에 포함되지 않은 수를 찾으십쇼
 
 Example:
Input:
[4,3,2,7,8,2,3,1]
Output:
[5,6]
 * */

class Solution {
	public List<Integer> findDisappearedNumbers(int[] nums) {
		List<Integer> list = new ArrayList<>();
		List<Integer> compareList = new ArrayList<>();

		for (int i = 0; i < nums.length; i++) {
			compareList.add(nums[i]);
		}

		for (int i = 0; i < compareList.size(); i++) {
			if(!compareList.contains(i) && i != 0) {
				list.add(i);
			}
		}

		return list;
	}

//	public int search(int[] nums, int target) {
//		int left = 0;
//		int right = nums.length - 1;
//		int middle;
//		int count = 0;
//
//		while (right >= left) {
//			middle = (left + right) / 2;
//			if (target == nums[middle]) {
//				return 0;
//			} else {
//				if (target < nums[middle]) {
//					right = middle - 1;
//				} else {
//					left = middle + 1;
//				}
//			}
//		}
//
//		return target;
//	}

}

public class FindDisappearedNumber {
	public static void main(String[] args) {
		Solution st = new Solution();
		int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 };

		System.out.println(st.findDisappearedNumbers(nums));
	}
}

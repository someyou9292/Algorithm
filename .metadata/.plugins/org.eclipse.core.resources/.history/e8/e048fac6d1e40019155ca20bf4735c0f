package binarySearch;

/*
 정령된 (오름차순) 정수 배열에서 목표값이 있다면 index를 리턴, 없으면 -1을 리턴
 * */

class Solution {
	public int search(int[] nums, int target) {

		int left = 0;
		int right = nums.length - 1;
		int middle;
		int count = 0;
		
		while (right >= left) {
			middle = (left + right) / 2;
			if (target == nums[middle]) {
				return middle;
			} else {
				if (target < nums[middle]) {
					right = middle - 1;
				} else {
					left = middle + 1;
				}
			}
		}

		return -1;
	}
}

public class binarySearch {
	public static void main(String[] args) {
		Solution st = new Solution();
		int[] nums = { -1, 0, 3, 5, 9, 12 };
		int target = 12;
		System.out.println(st.search(nums, target));
	}

}

package binarySearch;

/*
 ���ɵ� (��������) ���� �迭���� ��ǥ���� �ִٸ� index�� ����, ������ -1�� ����
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

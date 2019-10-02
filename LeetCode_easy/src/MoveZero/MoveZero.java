package MoveZero;

import java.util.ArrayList;
import java.util.List;

/*
 �迭�� �־����� 0�� �ƴ� ������ ������ �����ϸ鼭 0�� ������ �о��
 * �ٸ� �迭�� ����� �����ϸ� �ȵ�
 
 
 Example:
Input: [0,1,0,3,12]
Output: [1,3,12,0,0]
 * */

//class Solution {
//	public void moveZeroes(int[] nums) {
//		List<Integer> list = new ArrayList<Integer>();
//		int count = 0;
//		for (int i = 0; i < nums.length; i++) {
//			if (nums[i] != 0) {
//				count++;
//				list.add(nums[i]);
//			}
//		}
//		for (int i = 0; i < nums.length; i++) {
//			if (i < count) {
//				nums[i] = list.get(i);
//			} else {
//				nums[i] = 0;
//			}
//		}
//	}
//}

class Solution {
	public void moveZeroes(int[] nums) {
		int nonZeroPos = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				nums[nonZeroPos] = nums[i];
				if (nonZeroPos++ < i) {
					nums[i] = 0;
				}
			}
		}
	}
}

public class MoveZero {
	public static void main(String[] args) {
		Solution st = new Solution();
		int[] nums = { 0, 1, 0, 3, 12 };
		st.moveZeroes(nums);
	}
}

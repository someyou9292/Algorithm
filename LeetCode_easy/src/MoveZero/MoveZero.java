package MoveZero;

import java.util.ArrayList;
import java.util.List;

/*
 배열이 주어지면 0이 아닌 숫자의 순서를 유지하면서 0을 끝으로 밀어라
 * 다른 배열을 만들어 저장하면 안됨
 
 
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

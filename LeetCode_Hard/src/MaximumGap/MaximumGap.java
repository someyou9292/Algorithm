package MaximumGap;

import java.util.Arrays;

/*
 정렬되지 않은 배열이 주어지면
 배열의 연속된 요소간의 차이가 가장 큰 값을 리턴하세요.
 
Input: [3,6,9,1]
Output: 3
Explanation: The sorted form of the array is [1,3,6,9], either
             (3,6) or (6,9) has the maximum difference 3.
 * */

class Solution {
	public int maximumGap(int[] nums) {

		if (nums.length < 2) {
			return 0;
		}

		Arrays.sort(nums);

//		int index = 0;
//		for(int n : nums) {	
//			System.out.println(index + " 번째 >> " + n);
//			index++;
//		}

		int max = nums[1] - nums[0];
		for (int i = 2; i < nums.length; i++) {
			if (nums[i] - nums[i - 1] > max) {
				max = nums[i] - nums[i - 1];
			}
		}

		System.out.println(max);
		return max;
	}
}

public class MaximumGap {
	public static void main(String[] args) {
		Solution st = new Solution();
		int[] nums = { 15252, 16764, 27963, 7817, 26155, 20757, 3478, 22602, 20404, 6739, 16790, 10588, 16521, 6644,
				20880, 15632, 27078, 25463, 20124, 15728, 30042, 16604, 17223, 4388, 23646, 32683, 23688, 12439, 30630,
				3895, 7926, 22101, 32406, 21540, 31799, 3768, 26679, 21799, 23740 };
		st.maximumGap(nums);
	}
}

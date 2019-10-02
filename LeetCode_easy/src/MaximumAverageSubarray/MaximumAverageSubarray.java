package MaximumAverageSubarray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
 �־��� �迭���� �־��� ũ�⸸ŭ�� �κ� �迭 �� ����� ���� ū ���� �����ض�
 
 Input: [1,12,-5,-6,50,3], k = 4
Output: 12.75
Explanation: Maximum average is (12-5-6+50)/4 = 51/4 = 12.75
 */

// ȿ�� 97���� ��Ÿġ
class Solution {
	public double findMaxAverage(int[] nums, int k) {
		int sum = 0;
		for (int i = 0; i < k; i++) {
			sum += nums[i];
		}

		int max = sum;

		for (int i = 1; i <= nums.length - k; i++) {
			sum = sum - nums[i - 1] + nums[k + i - 1];
			if (max <= sum) {
				max = sum;
			}
		}

		return (double) max / k;
	}
}

public class MaximumAverageSubarray {
	public static void main(String[] args) {
		Solution st = new Solution();
		int[] nums = { 1, 0, 1, 4, 2 };
		int k = 4;
		System.out.println(st.findMaxAverage(nums, k));
	}
}
//ȿ�� 10%
//class Solution {
//	public double findMaxAverage(int[] nums, int k) {
//
//		double max = -10000;
//
//		for (int i = 0; i <= nums.length - k; i++) {
//			int sum = 0;
//			for (int j = 0; j < k; j++) {
//				sum = sum + nums[j + i];
//			}
//			if (max <= (double)sum / k) {
//				max = (double)sum / k;
//			}
//		}
//		
//		return max;
//	}
//}

// ȿ�� 5%
//class Solution {
//	public double findMaxAverage(int[] nums, int k) {
//		List list = new ArrayList();
//
//		for (int i = 0; i <= nums.length - k; i++) {
//			double sum = 0;
//			for (int j = 0; j < k; j++) {
//				sum += nums[i + j];
//			}
//			list.add(sum);
//		}
//		return (double)Collections.max(list) / k;
//	}
//}

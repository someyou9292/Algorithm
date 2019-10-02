package MaximumAverageSubarray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
 주어진 배열에서 주어진 크기만큼의 부분 배열 중 평균이 가장 큰 수를 리턴해라
 
 Input: [1,12,-5,-6,50,3], k = 4
Output: 12.75
Explanation: Maximum average is (12-5-6+50)/4 = 51/4 = 12.75
 */

// 효율 97프로 상타치
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
//효율 10%
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

// 효율 5%
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

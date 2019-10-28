package ThirdMaximumNumber;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/*
 �־��� �迭���� 3��°�� ū ���� ��ȯ�Ͻÿ�
 ���̰� 3���� ������� ���� ū ���� ��ȯ�Ͻÿ�
 
 * */

// Solution
class Solution {
	public int thirdMax(int[] nums) {

		int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE;

		boolean min = false;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == Integer.MIN_VALUE)
				min = true;
			if (nums[i] > max3) {

				if (nums[i] > max2) {
					if (nums[i] > max1) {
						max3 = max2;
						max2 = max1;
						max1 = nums[i];
					} else if (nums[i] < max1) {
						max3 = max2;
						max2 = nums[i];
					}
				} else if (nums[i] < max2) {
					max3 = nums[i];
				}
			}
		}

		if (max3 == Integer.MIN_VALUE && (!min || max2 == max3))
			return max1;

		// System.out.println(max1+":"+max2+":"+max3);
		return max3;

	}
}

public class ThirdMaximumNumber {
	public static void main(String[] args) {
		Solution st = new Solution();
		int[] nums = { -1, -2, -3, -1, 0 };
		System.out.println(st.thirdMax(nums));
	}
}
/*
 * set ���� Ư�� ��ġ �� �̱�
 * https://jethihmm.tistory.com/entry/%EC%9E%90%EB%B0%94-HashSet-%EC%97%90%EC%84
 * %9C-%ED%8A%B9%EC%A0%95-%EC%9E%90%EB%A6%AC%EC%9D%98-%EC%88%AB%EC%9E%90-%EC%B6%
 * 94%EC%B6%9C
 */

//	 ȿ�� 53.33.. �׷�����..
//class Solution {
//	public int thirdMax(int[] nums) {
//		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
//		Set set = new HashSet();
//
//		int first = Integer.MIN_VALUE;
//		int second = Integer.MIN_VALUE;
//		int third = Integer.MIN_VALUE;
//
//		for (int i = 0; i < nums.length; i++) {
//			set.add(nums[i]);
//			if (first <= nums[i]) {
//				first = nums[i];
//			}
//		}
//		map.put(1, first);
//
//		for (int i = 0; i < nums.length; i++) {
//			if (nums[i] < first && second <= nums[i]) {
//				second = nums[i];
//			}
//		}
//		map.put(2, second);
//
//		for (int i = 0; i < nums.length; i++) {
//			if (nums[i] < second && third <= nums[i]) {
//				third = nums[i];
//			}
//		}
//		map.put(3, third);
//
//		System.out.println("set Size >> " + set.size());
//
//		System.out.println("-------map�� ��----------");
//		for (int i = 0; i < map.size(); i++) {
//			System.out.println(map.get(i + 1));
//		}
//		System.out.println("---------------------");
//
//		System.out.println("first >> " + first);
//		System.out.println("second >> " + second);
//		System.out.println("third >> " + third);
//
//		if (set.size() < 3) {
//			return map.get(1);
//		}
//
//		return map.get(3);
//	}
//}

package LargestNumber;

import java.util.Arrays;
import java.util.Comparator;

/* 
Example 1:
Input: [10,2]
Output: "210"

Example 2:
Input: [3,30,34,5,9]
Output: "9534330"
 * */

class Solution {
	private class numberComparator implements Comparator<String> {
		@Override
		public int compare(String a, String b) {
			String str1 = a + b;
			String str2 = b + a;
			return str2.compareTo(str1);
		}
	}

	public String largestNumber(int[] nums) {
		StringBuilder answer = new StringBuilder();
		String[] strNumber = new String[nums.length];
		for (int i = 0; i < nums.length; i++) {
			// ������ ���ڷ� �ٲ�
//			strNumber[i] = String.valueOf(nums[i]);
			strNumber[i] = nums[i] + "";
		}

		// Override�� numberComparator �� �̿��Ͽ� ����
		Arrays.sort(strNumber, new numberComparator());

		for (String s : strNumber) {
			System.out.println(s);
		}

		// ���ĵ� �迭�� ������ 0 �̶�� -> 0���θ� �̷���� �迭
		if (strNumber[0].equals("0")) {
			return "0";
		}

		// �� ���ڿ��� �迭�� ��Ҹ� �ϳ��� ����
		for (String s : strNumber) {
			answer.append(s);
		}

		System.out.println(answer);

		return answer.toString();
	}
}

public class LargestNumber {
	public static void main(String[] args) {
		Solution st = new Solution();
		int[] nums = { 3, 30, 34, 5, 9 };

		st.largestNumber(nums);
	}
}

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
			// 정수를 문자로 바꿈
//			strNumber[i] = String.valueOf(nums[i]);
			strNumber[i] = nums[i] + "";
		}

		// Override한 numberComparator 를 이용하여 정렬
		Arrays.sort(strNumber, new numberComparator());

		for (String s : strNumber) {
			System.out.println(s);
		}

		// 정렬된 배열의 시작이 0 이라면 -> 0으로만 이루어진 배열
		if (strNumber[0].equals("0")) {
			return "0";
		}

		// 빈 문자열에 배열의 요소를 하나씩 붙임
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

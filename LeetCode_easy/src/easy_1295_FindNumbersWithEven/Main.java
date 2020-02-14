package easy_1295_FindNumbersWithEven;

/*
 LeetCode 1295번 문제
 배열이 주어지면 각 요소 중에서 짝수개의 자릿수를 가지는 요소의 수를 반환하시오.
 * */
class Solution {
	public int findNumbers(int[] nums) {
		int count = 0;

		for (int i = 0; i < nums.length; i++) {
			int num = nums[i];
			int cnt = 0;
			while (num != 0) {
				cnt++;
				num /= 10;
			}
			if(cnt % 2==0) {
				count++;
			}
		}

		System.out.println(count);
		return count;
	}
}

public class Main {
	public static void main(String[] args) {
		Solution st = new Solution();
		int[] nums = { 12, 345, 2, 6, 7896 };

		st.findNumbers(nums);
	}
}

//	효율 36.42%
//class Solution {
//	public int findNumbers(int[] nums) {
//		int count = 0;
//		
//		for(int i=0; i<nums.length;i++) {
//			if(String.valueOf(nums[i]).length() % 2 == 0) {
//				count++;
//			}
//		}
//		
//		System.out.println(count);
//		return count;
//	}
//}

// 효율 9.27%  String.valueOf 가 "" + int 형보다 훨씬 효율적임.
//class Solution {
//	public int findNumbers(int[] nums) {
//		int count = 0;
//
//		for (int i = 0; i < nums.length; i++) {
//			String str = "" + nums[i];
//			if (str.length() % 2 == 0) {
//				count++;
//			}
//		}
//
//		System.out.println(count);
//		return count;
//	}
//}

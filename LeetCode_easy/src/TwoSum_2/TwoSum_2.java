package TwoSum_2;

class Solution {
	public int[] twoSum(int[] numbers, int target) {
		int[] answer = new int[2];
		int l = 0;
		int r = numbers.length - 1;

		while (numbers[l] + numbers[r] != target) {
			if (numbers[l] + numbers[r] > target) {
				r--;
			} else {
				l++;
			}
		}
		answer[0] = l + 1;
		answer[1] = r + 1;

		return answer;
	}
}

public class TwoSum_2 {
	public static void main(String[] args) {
		Solution st = new Solution();
		int[] numbers = { 2, 7, 11, 15 };
		int target = 26;

		st.twoSum(numbers, target);
	}
}

// È¿À² 9.07%
//class Solution {
//	public int[] twoSum(int[] numbers, int target) {
//		int[] answer = new int[2];
//
//		int index = 0;
//		while (index < numbers.length) {
//			int t = target - numbers[index];
//			for (int i = index + 1; i < numbers.length; i++) {
//				if (t == numbers[i]) {
//					answer[0] = index + 1;
//					answer[1] = i + 1;
//				}
//			}
//			index++;
//		}
//		
//		for(int n : answer) {
//			System.out.println(n);
//		}
//
//		return answer;
//	}
//}

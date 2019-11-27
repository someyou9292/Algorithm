package PlusOne;

class Solution {
	public int[] plusOne(int[] digits) {
		int[] answer = new int[digits.length];

		for (int i = 0; i < digits.length; i++) {
			answer[i] = digits[i];
		}

		int length = digits.length;

		int carry;
		int index = 1;
		if (answer[length - 1] < 9) {
			answer[length - 1]++;
		} else {
			answer[length - 1] = 0;
			carry = 1;
			while (length - 1 - index >= 0) {
				if (answer[length - 1 - index] + carry <= 9) {
					answer[length - 1 - index] = answer[length - 1 - index] + carry;
					carry = 0;
				} else {
					answer[length - 1 - index] = 0;
					carry = 1;
				}
				index++;
			}
			if (answer[0] == 0) {
				int[] newAnswer = new int[answer.length + 1];
				for (int i = answer.length - 1; i >= 0; i--) {
					newAnswer[i] = answer[i];
				}
				newAnswer[0] = 1;
				for(int n : newAnswer) {
					System.out.println(n);
				}
				return newAnswer;
			}
		}

		for (int n : answer) {
			System.out.print(n);
		}

		return answer;
	}
}

public class PlusOne {
	public static void main(String[] args) {
		Solution st = new Solution();
		int[] digits = { 9, 9, 9 };
//		int[] digits = {9,9,9};

		st.plusOne(digits);

	}
}

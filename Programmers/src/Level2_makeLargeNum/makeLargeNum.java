package Level2_makeLargeNum;

import java.util.Stack;

class Solution {
	public String solution(String number, int k) {
		String answer = "";
		Stack<Character> stack = new Stack<Character>();
		int count = 0;
		int size = number.length() - k;

		for (int i = 0; i < number.length(); i++) {
			char c = number.charAt(i);

			while (!stack.isEmpty() && count != k) {
				if (stack.peek() < c) {
					stack.pop();
					count++;
				} else {
					break;
				}
			}
			stack.push(c);
		}

		if (stack.size() != size) {
			while (stack.size() != size) {
				stack.pop();
			}
		}

		while (!stack.isEmpty()) {
			answer = stack.pop() + answer;
		}

		System.out.println(answer);

		return answer;
	}
}

public class makeLargeNum {
	public static void main(String[] args) {
		Solution st = new Solution();
		String number = "1924";
		int k = 2;

		st.solution(number, k);
	}
}

package Level2_makeLargeNumber;

import java.util.Stack;

class Solution {
	public String solution(String number, int k) {
		String answer = "";
		Stack<Character> stack = new Stack<Character>();

		for (int i = 0; i < number.length(); i++) {
			char c = number.charAt(i);

			// stack이 비어있으면 문자(c)를 저장
			if (stack.isEmpty() || k == 0) {
				stack.add(c);
				continue;
			}

			if (stack.peek() < c) {
				// stack이 비어있지 않고, stack의 top이 c 보다 작고, k 가 0 보다 클 경우
				while (!stack.isEmpty() && stack.peek() < c && k > 0) {
					stack.pop();
					k--;
				}
				// c의 값을 stack에 저장
				stack.add(c);
			} else {
				// c가 stack의 top보다 작거나 같은 경우 stack에 저장
				stack.add(c);
			}
		}

		while (!stack.isEmpty()) {
			answer = stack.pop() + answer;
		}
		
		// 문자열이 모두 같은 숫자인 경우 -> 11111 
		if (k != 0) {
			answer = answer.substring(0, answer.length()-k);
		}

		System.out.println(answer);

		return answer;
	}
}

public class Main {
	public static void main(String[] args) {
		String number = "4177252841";
		int k = 4;

		Solution st = new Solution();
		st.solution(number, k);
	}
}

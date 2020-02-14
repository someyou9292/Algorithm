package Level2_makeLargeNumber;

import java.util.Stack;

class Solution {
	public String solution(String number, int k) {
		String answer = "";
		Stack<Character> stack = new Stack<Character>();

		for (int i = 0; i < number.length(); i++) {
			char c = number.charAt(i);

			// stack�� ��������� ����(c)�� ����
			if (stack.isEmpty() || k == 0) {
				stack.add(c);
				continue;
			}

			if (stack.peek() < c) {
				// stack�� ������� �ʰ�, stack�� top�� c ���� �۰�, k �� 0 ���� Ŭ ���
				while (!stack.isEmpty() && stack.peek() < c && k > 0) {
					stack.pop();
					k--;
				}
				// c�� ���� stack�� ����
				stack.add(c);
			} else {
				// c�� stack�� top���� �۰ų� ���� ��� stack�� ����
				stack.add(c);
			}
		}

		while (!stack.isEmpty()) {
			answer = stack.pop() + answer;
		}
		
		// ���ڿ��� ��� ���� ������ ��� -> 11111 
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

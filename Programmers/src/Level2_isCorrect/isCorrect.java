package Level2_isCorrect;

import java.util.Stack;

class Solution {
	boolean solution(String s) {
		boolean answer = true;
		Stack<Character> stack = new Stack<Character>();

		for (int i = s.length() - 1; i >= 0; i--) {
			stack.add(s.charAt(i));
		}
		int count = 0;
		while(!stack.isEmpty()) {
			char pop = stack.pop();
			if(pop == '(') {
				count++;
			}else {
				count--;
			}
			if(count < 0) {
				System.out.println(false);
				return false;
			}
		}
		
		if(count != 0) {
			System.out.println(false);
			return false;
		}

		System.out.println(answer);
		return answer;
	}
}

public class isCorrect {
	public static void main(String[] args) {
		Solution st = new Solution();
		String s = "";

		st.solution(s);
	}
}

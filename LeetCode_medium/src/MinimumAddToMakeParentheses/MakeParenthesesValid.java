package MinimumAddToMakeParentheses;

import java.util.Stack;

class Solution {
	public int minAddToMakeValid(String S) {
		int answer = 0;
		int count = 0;
		
		for(int i=0; i<S.length();i++) {
			if(S.charAt(i) == '(') {
				count++;
			}else if(S.charAt(i) == ')') {
				if(count == 0) {
					answer++;
				}else {
					count--;
				}
			}
		}
		
		answer += count;
		
		return answer;
	}
}

public class MakeParenthesesValid {
	public static void main(String[] args) {
		Solution st = new Solution();
		String S = "()))((";

		st.minAddToMakeValid(S);
	}
}


// È¿À²37.61%
//class Solution {
//	public int minAddToMakeValid(String S) {
//		if (S.length() == 0) {
//			return 0;
//		}
//		Stack<Character> stack = new Stack<Character>();
//
//		for (int i = S.length() - 1; i >= 0; i--) {
//			stack.push(S.charAt(i));
//		}
//		int answer = 0;
//		int count = 0;
//		while (!stack.isEmpty()) {
//			char pop = stack.pop();
//			switch (pop) {
//			case '(':
//				count++;
//				break;
//			case ')':
//				if (count == 0) {
//					answer++;
//				} else {
//					count--;
//				}
//				break;
//			}
//		}
//
//		answer += count;
//
//		System.out.println(answer);
//		return answer;
//	}
//}
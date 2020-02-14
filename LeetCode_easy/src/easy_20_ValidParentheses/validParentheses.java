package easy_20_ValidParentheses;

import java.util.Stack;

// 효율 98.85%
class Solution {
	public boolean isValid(String s) {
		Stack<Character> stack = new Stack<Character>();

		if (s.length() == 0)
			return true;

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);

			if (stack.isEmpty() || c == '(' || c == '{' || c == '[') {
				stack.push(c);
			} else {
				char top = stack.peek();

				if (top == '(') {
					if (c == ')') {
						stack.pop();
					} else {
						return false;
					}
				} else if (top == '{') {
					if (c == '}') {
						stack.pop();
					} else {
						return false;
					}
				} else {
					if (c == ']') {
						stack.pop();
					}else {
						return false;
					}
				}
			}
		}

		if(stack.isEmpty()) return true;
		
		return false;
	}
}

public class validParentheses {
	public static void main(String[] args) {
		Solution st = new Solution();
		String s = "";

		st.isValid(s);
	}
}

//	효율 58%
//class Solution {
//	public boolean isValid(String s) {
//		Stack<Character> stack = new Stack<Character>();
//
//		if (s.length() == 0)
//			return true;
//
//		if (s.charAt(0) == ')' || s.charAt(0) == '}' || s.charAt(0) == ']')
//			return false;
//
//		if (s.length() % 2 == 1)
//			return false;
//		
//		int count = 0;
//		for (int i = 0; i < s.length(); i++) {
//			if (stack.isEmpty() || s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
//				stack.push(s.charAt(i));
//				count++;
//			}else {
//				if(stack.peek() == '(') {
//					if(s.charAt(i) == ')') {
//						stack.pop();
//						count--;
//					}else {
//						return false;
//					}
//				}else if(stack.peek() == '{') {
//					if(s.charAt(i) == '}') {
//						stack.pop();
//						count--;
//					}else {
//						return false;
//					}
//				}else {
//					if(s.charAt(i) == ']') {
//						stack.pop();
//						count--;
//					}else {
//						return false;
//					}
//				}
//			}
//		}
//		
//		if(count != 0) {
//			return false;
//		}
//		
//		return true;
//	}
//}

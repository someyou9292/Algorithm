package Level2_37;

import java.util.Stack;

class Solution {
	public int solution(String s) {
		int answer = 0;
		if (s.length() % 2 == 1) {
			return answer;
		}
		Stack<Character> stack = new Stack<Character>();
		char[] Char = new char[s.length()];
		
		for(int i=0; i<Char.length;i++) {
			Char[i] = s.charAt(i);
		}
		
		for(int i=0; i<Char.length;i++) {
			if(!stack.isEmpty() && Char[i] == stack.peek()) {
				stack.pop();
			}else {
				stack.push(Char[i]);
			}
		}
		if(stack.isEmpty()) {
			return 1;
		}
		
		return answer;
	}
}

public class Level2_37 {
	public static void main(String[] args) {
		Solution st = new Solution();
		String s = "";
		st.solution(s);
	}
}


// 테스트 케이스 6,8번 통과하지 못함..ㅠ
//class Solution {
//	public int solution(String s) {
//		int answer = 0;
//		if (s.length() % 2 == 1) {
//			return answer;
//		}
//		List<Character> list = new ArrayList<Character>();
//		Stack<Character> stack = new Stack<Character>();
//
//		for (int i = 0; i < s.length(); i++) {
//			stack.push(s.charAt(i));
//		}
//
//		while (!stack.isEmpty()) {
//			char stack_pop = stack.pop();
//			int max_index = list.size();
//			if (list.size() == 0) {
//				list.add(stack_pop);
//			} else {
//				if (stack_pop == list.get(max_index - 1)) {
//					list.remove(max_index - 1);
//					answer = 1;
//				} else {
//					list.add(stack_pop);
//					answer = 0;
//					continue;
//				}
//			}
//		}
//		System.out.println(answer);
//		return answer;
//	}
//}
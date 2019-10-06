package Cut;

import java.util.Stack;

class Solution {
	public int solution(String arrangement) {
		int answer = 0;
		int bar = 0;

		for (int i = 0; i < arrangement.length(); i++) {
			if (i < arrangement.length() - 1) {
				if (i > 0) {
					if (arrangement.charAt(i) == ')' && arrangement.charAt(i - 1) == ')') {
						answer++;
						bar--;
					}
				}
				if (arrangement.charAt(i) == '(' && arrangement.charAt(i + 1) == ')') {
					answer += bar;
				} else if (arrangement.charAt(i) == '(' && arrangement.charAt(i + 1) == '(') {
					bar++;
				}
			} else {
				answer += 1;
			}
		}
		System.out.println(answer);
		return answer;
	}
}

public class cut {
	public static void main(String[] args) {
		Solution st = new Solution();
		String arrangement = "()(((()())(())()))(())";

		st.solution(arrangement);
	}
}

// 스택 풀이.. 공부하자!
//class Solution {
//    public static int solution(String arrangement) {
//        int answer = 0;
//        Stack<Integer> st = new Stack<>();
//        for (int i = 0; i < arrangement.length(); i++) {
//            if (arrangement.charAt(i) == '(') {
//                st.push(i);
//            } else if (arrangement.charAt(i) == ')') {
//                if (st.peek() + 1 == i) {
//                    st.pop();
//                    answer += st.size();
//                } else {
//                    st.pop();
//                    answer += 1;
//                }
//            }
//        }
//        return answer;
//    }
//}


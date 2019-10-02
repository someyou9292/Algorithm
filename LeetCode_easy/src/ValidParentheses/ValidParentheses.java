package ValidParentheses;

import java.util.*;
/*
19.09.17
Description

* 규칙
열린 괄호는 동일한 유형의 괄호로 닫아야함
열린 괄호 순서로 동일한 유형의 괄호로 닫아야함
빈 문자열도 유효한 것으로 간주

Example 1:				Example 2:
Input: "()"				Input: "()[]{}"
Output: true			Output: true

Example 3:				Example 4:
Input: "(]"				Input: "([)]"
Output: false			Output: false

Example 5:
Input: "{[]}"
Output: true
 * */

class Solution {
	private HashMap<Character, Character> mappings;
	
	// 초기화 작업
	public Solution() {
		this.mappings = new HashMap<Character, Character>();
		this.mappings.put('(', ')');
		this.mappings.put('{', '}');
		this.mappings.put('[', ']');
	}
	public boolean isValid(String s) {
		Stack<Character> stack = new Stack<Character>();
		
		// 입력한 순서대로 꺼내기 위해서 거꾸로 스택에 넣기 위함
		for(int i = s.length()-1; i >= 0; i--) {
			// 해쉬맵에 포함되어있는지 비교하기위한 char형 변수.
			char c = s.charAt(i);
			
			// 해쉬맵 mappins에 키값 c가( (,{,[ ) 포함되있다면
			if(this.mappings.containsKey(c)) {
				// top 이 비어있으면 '#' 으로 세팅, 아니면 stack에서 꺼낸 것으로 세팅
				char top = stack.empty() ? '#' : stack.pop();
				
				// top의 값과 mappins에서 꺼낸 c가 같지 않다면 false
				if(top != this.mappings.get(c)) {
					return false;
				}
			}
			// 해쉬맵 mappings에 c 가 포함되어있다면
			else {
				// stack에 넣음
				stack.push(c);
			}
		}
		
		// 만약 스택에 값이 남아있다면 false
		return stack.isEmpty();
	}
}
public class ValidParentheses {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		Solution st = new Solution();
		System.out.println(st.isValid(s));

	}
}

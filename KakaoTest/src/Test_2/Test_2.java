package Test_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Solution {
	List<String> list = new ArrayList<String>();
	public boolean isCorrect(String s) {
		Stack<Character> stack = new Stack<Character>();
		if (s.length() == 0) {
			return true;
		}
		if (s.charAt(0) == '(') {
			for (int i = s.length() - 1; i >= 0; i--) {
				stack.push(s.charAt(i));
			}
			int count = 0;
			while (!stack.isEmpty()) {
				char c = stack.pop();
				if (c == '(') {
					count++;
				} else {
					count--;
				}
				if(count < 0) {
					return false;
				}
			}
			if (count == 0) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
	
//	public void StringSplit(String s) {
//		Stack<Character> stack = new Stack<Character>();
//
//		for (int i = s.length() - 1; i >= 0; i--) {
//			stack.push(s.charAt(i));
//		}
//
//		int count = 0;
//		int s_index = 0;
//		while (!stack.isEmpty()) {
//			char c = stack.pop();
//			if (c == '(') {
//				count++;
//			} else {
//				count--;
//			}
//			s_index++;
//			if (count == 0) {
//				break;
//			}
//		}
//
//		String u = s.substring(0, s_index);
//		String v = s.substring(s_index);
//		
//		System.out.println("u >> "+u);
//		System.out.println("v >> "+v);
//		
//		if(isCorrect(u) == true && isCorrect(v) == true) {
//			list.add(u);
//			list.add(v);
//		}else if(isCorrect(u) == true && isCorrect(v) == false) {
//			list.add(u);
//			StringSplit(v);
//		}else if(isCorrect(u) == false && isCorrect(v) == true){
//			String newStr = "(";
//			newStr += v;
//			newStr += ")";
//			String newU = "";
//			for(int i=1;i<u.length()-1;i++) {
//				if(u.charAt(i) == '(') {
//					newU += ")";
//				}else {
//					newU += "(";
//				}
//			}
//			newStr += newU;
//			u = newStr;
//			StringSplit(u);
//		}
//		else {
////			StringSplit(u);
////			StringSplit(v);
//			String newStr = "(";
//			StringSplit(v);
//			newStr += v;
//			newStr += ")";
//			String newU = "";
//			for(int i=1;i<u.length()-1;i++) {
//				if(u.charAt(i) == '(') {
//					newU += ")";
//				}else {
//					newU += "(";
//				}
//			}
//			newStr += newU;
//			u = newStr;
//			StringSplit(u);
//		}
//	}

	public String StringSplit(String s) {
		String str = "";
		Stack<Character> stack = new Stack<Character>();

		for (int i = s.length() - 1; i >= 0; i--) {
			stack.push(s.charAt(i));
		}

		int count = 0;
		int s_index = 0;
		while (!stack.isEmpty()) {
			char c = stack.pop();
			if (c == '(') {
				count++;
			} else {
				count--;
			}
			s_index++;
			if (count == 0) {
				break;
			}
		}

		String u = s.substring(0, s_index);
		String v = s.substring(s_index);
		
		System.out.println("u >> "+u);
		System.out.println("v >> "+v);
		
		if(isCorrect(u) == true && isCorrect(v) == true) {
			str += u + v;
		}else if(isCorrect(u) == true && isCorrect(v) == false) {
			str += u;
			str += StringSplit(v);
		}else if(isCorrect(u) == false && isCorrect(v) == true){
			String newStr = "(";
			newStr += v;
			newStr += ")";
			String newU = "";
			for(int i=1;i<u.length()-1;i++) {
				if(u.charAt(i) == '(') {
					newU += ")";
				}else {
					newU += "(";
				}
			}
			newStr += newU;
			u = newStr;
			System.out.println(u);
			str += u;
		}
		else {
			String newStr = "(";
			newStr += StringSplit(v);
			newStr += ")";
			String newU = "";
			for(int i=1;i<u.length()-1;i++) {
				if(u.charAt(i) == '(') {
					newU += ")";
				}else {
					newU += "(";
				}
			}
			newStr += newU;
			str += newStr;
		}
		return str;
	}

	
	public String solution(String p) {
		String answer = "";
		answer = StringSplit(p);
		
//		for(String s : list) {
//			System.out.println(s);
//		}
//		
//		for(int i=0; i<list.size();i++) {
//			answer += list.get(i);
//		}
		
		System.out.println(answer);
		return answer;
	}
}

public class Test_2 {
	public static void main(String[] args) {
		Solution st = new Solution();
//		String p = 	"(()())()";		// 올바른 문자열
//		String p = 	")(";			
//		String p = 	"()))((()";		
//		String p = "))((())(";		// (()())()
		String p = "))()((";		//	()()()
		

		st.solution(p);
	}
}

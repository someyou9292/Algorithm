package Test_2018_wordCompression;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

class Solution {
	public int[] solution(String msg) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		List<Integer> list = new ArrayList<Integer>();
		Stack<Character> stack = new Stack<Character>();

		for (int i = msg.length() - 1; i >= 0; i--) {
			stack.push(msg.charAt(i));
		}
		
		// map 에 A~Z 까지 넣음
		char init = 'A';
		for (int i = 0; i < 26; i++) {
			map.put("" + init, i + 1);
			init++;
		}

		String cur = "";
		char next = 0;
		String concat = cur + next;
		int mapValue = 27;			// 새로운 문자열은 27번부터 들어감
		while (!stack.isEmpty()) {
			char pop = stack.pop();
			cur = cur + pop;
			if (stack.isEmpty()) {	// 스택이 비었으면 다음 문자는 없으므로 0
				next = 0;
			} else {
				next = stack.peek();
			}
			concat = cur + next;

			if (!map.containsKey(concat)) {		// 합성어가 map에 없다면 저장/  list에 현재문자 인덱스를 저장.
				map.put(concat, mapValue);
				mapValue++;
				list.add(map.get(cur));
				cur = "";					// cur 과  next, concat 을 초기화
				next = 0;
				concat = "";
			} else {					// 합성어가 map에 있다면
				while (!stack.isEmpty() && map.containsKey(concat)) {	// map에 없는 합성어가 나올때까지 cur 에 pop한 것을 더해줌
					pop = stack.pop();
					cur = cur + pop;
					if (stack.isEmpty()) {
						next = 0;
					} else {
						next = stack.peek();
					}
					concat = cur + next;
				}
				
				map.put(concat, mapValue);
				mapValue++;
				list.add(map.get(cur));
				cur = "";
				next = 0;
				concat = "";
			}
		}

		int[] answer = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}

		return answer;
	}
}

public class wordCompression {
	public static void main(String[] args) {
		Solution st = new Solution();
		String msg = "TOBEORNOTTOBEORTOBEORNOT";

		st.solution(msg);
	}
}

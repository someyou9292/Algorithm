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
		
		// map �� A~Z ���� ����
		char init = 'A';
		for (int i = 0; i < 26; i++) {
			map.put("" + init, i + 1);
			init++;
		}

		String cur = "";
		char next = 0;
		String concat = cur + next;
		int mapValue = 27;			// ���ο� ���ڿ��� 27������ ��
		while (!stack.isEmpty()) {
			char pop = stack.pop();
			cur = cur + pop;
			if (stack.isEmpty()) {	// ������ ������� ���� ���ڴ� �����Ƿ� 0
				next = 0;
			} else {
				next = stack.peek();
			}
			concat = cur + next;

			if (!map.containsKey(concat)) {		// �ռ�� map�� ���ٸ� ����/  list�� ���繮�� �ε����� ����.
				map.put(concat, mapValue);
				mapValue++;
				list.add(map.get(cur));
				cur = "";					// cur ��  next, concat �� �ʱ�ȭ
				next = 0;
				concat = "";
			} else {					// �ռ�� map�� �ִٸ�
				while (!stack.isEmpty() && map.containsKey(concat)) {	// map�� ���� �ռ�� ���ö����� cur �� pop�� ���� ������
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

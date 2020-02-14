package Level1_StringDescendingOrder;

import java.util.Arrays;

class Solution {
	public String solution(String s) {
		String answer = "";
		char[] sorted = new char[s.length()];

		for (int i = 0; i < s.length(); i++) {
			sorted[i] = s.charAt(i);
		}
		
		// �빮�� A~Z �ҹ���a~z ������ ����
		Arrays.sort(sorted);

		for (int i = sorted.length - 1; i >= 0; i--) {
			answer += sorted[i];
		}
		
		System.out.println(answer);
		
		return answer;
	}
}

public class Main {
	public static void main(String[] args) {
		String s = "Zbcdefg";
		Solution st = new Solution();
		st.solution(s);
	}
}

package Level2_JadenCase;

class Solution {
	public String solution(String s) {
		String answer = "";
		s = s.toLowerCase();
		String[] arr = s.split("");

		for (int i = 0; i < arr.length; i++) {
			// ù ���ڰ� �ҹ��� ���ĺ��̸�
			if (arr[0].charAt(0) >= 'a' && arr[0].charAt(0) <= 'z') {
				char c = (char) (arr[0].charAt(0) - 32);
				arr[0] = "" + c;
			}
			
			// ���� ���� ������ ù ���ڰ� �ҹ��ڶ��
			if (i > 0 && arr[i - 1].equals(" ")) {
				if (arr[i].charAt(0) >= 'a' && arr[i].charAt(0) <= 'z') {
					char c = (char) (arr[i].charAt(0) - 32);
					arr[i] = "" + c;
				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			answer += arr[i];
		}

		return answer;
	}
}

public class JadenCase {
	public static void main(String[] args) {
		Solution st = new Solution();
		String s = "3people unFollowed me";
		st.solution(s);
	}
}

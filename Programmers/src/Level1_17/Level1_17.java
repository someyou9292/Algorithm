package Level1_17;

// "1" = 48
// "9" = 57
class Solution {
	public int solution(String s) {
		int answer = 0;
		boolean sign = false;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '-') {
				sign = true;
			} else if (s.charAt(i) == '+') {
				continue;
			} else {
				answer = answer * 10 + (s.charAt(i) - 48);
			}
		}

		if (sign == true) {
			answer = answer * (-1);
		}

		System.out.println(answer);
		return answer;
	}

}

public class Level1_17 {
	public static void main(String[] args) {
		Solution st = new Solution();
		String s = "+10000";
		st.solution(s);
	}
}

// 함수 쓰는 방법 이외에 다른 방법도 생각해보자
//class Solution {
//	public int solution(String s) {
//		
//		return Integer.parseInt(s);
//	}
//}

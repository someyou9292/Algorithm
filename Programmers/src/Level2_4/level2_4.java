package Level2_4;

class Solution {
	public String solution(int n) {
		String answer = "";

		int remain;

		while (n != 0) {
			remain = n % 3;
			n /= 3;

			if (remain == 0) {
				n -= 1;		
				remain = 4;
			}
			answer = remain + answer;
		}

		System.out.println(answer);
		return answer;
	}
}

public class level2_4 {
	public static void main(String[] args) {
		int n = 10;
		Solution st = new Solution();
		st.solution(n);
	}
}

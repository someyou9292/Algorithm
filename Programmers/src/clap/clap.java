package clap;

class Solution {
	public String solution(int n) {
		String answer = "";

		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				answer += "¼ö";
			} else {
				answer += "¹Ú";

			}
		}
		
		System.out.println(answer);
		return answer;
	}
}

public class clap {
	public static void main(String[] args) {
		Solution st = new Solution();
		int n = 2;
		st.solution(n);
	}
}

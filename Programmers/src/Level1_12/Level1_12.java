package Level1_12;

import java.util.Arrays;

class Solution {
	public String solution(String s) {
		String answer = "";

		char[] arr = new char[s.length()];

		for (int i = 0; i < s.length(); i++) {
			arr[i] = s.charAt(i);
		}
		Arrays.sort(arr);

		for (int i = arr.length - 1; i >= 0; i--) {
			answer += arr[i];
		}

		System.out.println(answer);

		return answer;
	}
}

public class Level1_12 {
	public static void main(String[] args) {
		String s = "Zbcdefg";
		Solution st = new Solution();
		st.solution(s);
	}
}

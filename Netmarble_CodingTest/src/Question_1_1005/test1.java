package Question_1_1005;

class Solution {
	public int solution(String S, String pattern) {
		if(S.length() == 0 || pattern.length() == 0) {
			return 0;
		}
		int answer = 0;
		String[] compare = new String[S.length() - pattern.length() + 1];

		for (int i = 0; i < compare.length; i++) {
			if (i == compare.length - 1) {
				compare[i] = S.substring(i);
			} else {
				compare[i] = S.substring(i, i + pattern.length());
			}
		}

		int[] arr = new int[26];
		int count = 0;
		for (int i = 0; i < compare.length; i++) {
			for (int j = 0; j < compare[i].length(); j++) {
				arr[compare[i].charAt(j) - 'a']++;
				arr[pattern.charAt(j) - 'a']--;
			}
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] == 0) {
					count++;
				} else {
					break;
				}
			}
			if (count == 26) {
				answer++;
			}
			count = 0;
			for (int j = 0; j < arr.length; j++) {
				arr[j] = 0;
			}
		}

		return answer;
	}
}


public class test1 {
	public static void main(String[] args) {
		Solution st = new Solution();
		String S = "ababaaqwazxca";
		String pattern = "aabba";
		System.out.println(st.solution(S, pattern));
	}
}

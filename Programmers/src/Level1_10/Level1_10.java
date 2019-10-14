package Level1_10;

import java.util.Arrays;
import java.util.Comparator;

// A = 65
// a = 97
class Solution {
	public String[] solution(String[] strings, int n) {
		String[] answer = new String[strings.length];

		Arrays.sort(strings);

		Comparator<String> comp = new Comparator<String>() {
			public int compare(String s1, String s2) {
				char str1 = s1.charAt(n);
				char str2 = s2.charAt(n);

				if (str1 > str2)
					return 1;
				else if (str1 < str2)
					return -1;
				else
					return 0;
			}
		};

		Arrays.sort(strings, comp);

		for (int i = 0; i < strings.length; i++) {
			answer[i] = strings[i];
		}

		for (int i = 0; i < strings.length; i++) {
			System.out.println(answer[i]);
		}
		return answer;
	}
}

public class Level1_10 {
	public static void main(String[] args) {
//		String[] strings = { "aaa", "aaaa", "aaa" };
		String[] strings = { "abce", "abcd", "cdx" };
		int n = 1;
		Solution st = new Solution();

		st.solution(strings, n);
	}
}

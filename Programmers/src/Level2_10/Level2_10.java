package Level2_10;

import java.util.Arrays;
import java.util.Comparator;

class Solution {
	public class numberComparator implements Comparator<String> {

		public int compare(String s1, String s2) {
			String str1 = s1 + s2;
			String str2 = s2 + s1;
			return str2.compareTo(str1);
		}
	}

	public String solution(int[] numbers) {
		StringBuilder answer = new StringBuilder();
		String[] strNumber = new String[numbers.length];
		for (int i = 0; i < numbers.length; i++) {
			strNumber[i] = String.valueOf(numbers[i]);
		}

		Arrays.sort(strNumber, new numberComparator());
		
		if(strNumber[0].equals("0")) {
			return "0";
		}
		
		for (String s : strNumber) {
			answer.append(s);
		}

		return answer.toString();
	}
}

public class Level2_10 {
	public static void main(String[] args) {
		Solution st = new Solution();
		int[] numbers = { 6, 10, 2 };

		st.solution(numbers);
	}
}

package Test2_20191109;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Solution {
	public int[] solution(String s) {
		List<Integer> list = new ArrayList<Integer>();
		// 끝의 {} 를 제거한 새로운 s를 만듦
		String newS = s.substring(1, s.length() - 1);

		// } 를 기준으로 자른 문자열 배열을 만듦
		String[] strArr = newS.split("}");

		// 동일한 패턴을 만들어주기 위함
		strArr[0] = "," + strArr[0];

		// 맨 앞의 , 와 {를 제거
		for (int i = 0; i < strArr.length; i++) {
			strArr[i] = strArr[i].substring(2);
		}

		// 단어 배열의 크기순으로 정렬
		Arrays.sort(strArr, new Comparator<String>() {
			public int compare(String s1, String s2) {
				return Integer.compare(s1.length(), s2.length());
			}
		});
		
		
		for (int i = 0; i < strArr.length; i++) {
			String[] subArr = strArr[i].split(",");
			for (int j = 0; j < subArr.length; j++) {
				if(!list.contains(Integer.parseInt(subArr[j]))) {
					list.add(Integer.parseInt(subArr[j]));
				}
			}
		}
		
		
		int[] answer = new int[list.size()];

		for (int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
		}

		return answer;
	}
}

public class Test2 {
	public static void main(String[] args) {
		Solution st = new Solution();
		String s = "{{20,111},{111}}";

		st.solution(s);
	}
}

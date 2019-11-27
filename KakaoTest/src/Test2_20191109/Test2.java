package Test2_20191109;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Solution {
	public int[] solution(String s) {
		List<Integer> list = new ArrayList<Integer>();
		// ���� {} �� ������ ���ο� s�� ����
		String newS = s.substring(1, s.length() - 1);

		// } �� �������� �ڸ� ���ڿ� �迭�� ����
		String[] strArr = newS.split("}");

		// ������ ������ ������ֱ� ����
		strArr[0] = "," + strArr[0];

		// �� ���� , �� {�� ����
		for (int i = 0; i < strArr.length; i++) {
			strArr[i] = strArr[i].substring(2);
		}

		// �ܾ� �迭�� ũ������� ����
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

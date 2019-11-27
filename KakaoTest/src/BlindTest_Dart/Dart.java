package BlindTest_Dart;

import java.util.ArrayList;
import java.util.List;

//������ 0 ~ 10 ���� ����
//���ʽ��� SDT �� �ϳ�
//�ɼ��� * # �� �ϳ��̸� ���� ���� �ִ�.
//* : ���� ������ ���� ���� ������ 2����
//# : ���� ���� ������ -1 �� ����

class Solution {
	public int changeScore(List<Character> list) {
		int result = 0;
		int score;

		if (list.get(0) == '1' && list.get(1) == '0') {
			score = 10;
		}else {
			score = list.get(0) - '0';			
		}

		if (list.contains('S')) {
			result += score;
		} else if (list.contains('D')) {
			result += score * score;
		} else if (list.contains('T')) {
			result += score * score * score;
		}

		if (list.contains('#')) {
			result = result * (-1);
		}

		return result;
	}

	public int solution(String dartResult) {
		int answer = 0;
		List<Character> f = new ArrayList<Character>();
		List<Character> s = new ArrayList<Character>();
		List<Character> t = new ArrayList<Character>();

		for (int i = 0; i < dartResult.length(); i++) {
			if (!f.contains('S') && !f.contains('D') && !f.contains('T')) {
				f.add(dartResult.charAt(i));
				continue;
			} else if (!s.contains('S') && !s.contains('D') && !s.contains('T')) {
				if (i <= 3) {
					if (dartResult.charAt(i) == '*' || dartResult.charAt(i) == '#') {
						f.add(dartResult.charAt(i));
						continue;
					}
				}
				s.add(dartResult.charAt(i));
				continue;
			} else {
				if (i >= 4 && i < dartResult.length() - 1) {
					if (dartResult.charAt(i) == '*' || dartResult.charAt(i) == '#') {
						s.add(dartResult.charAt(i));
						continue;
					}
				}
				t.add(dartResult.charAt(i));
				continue;
			}
		}

		int f_s = changeScore(f);
		int s_s = changeScore(s);
		int t_s = changeScore(t);

		if (f.contains('*')) {
			f_s *= 2;
		}

		if (s.contains('*')) {
			s_s *= 2;
			f_s *= 2;
		}

		if (t.contains('*')) {
			t_s *= 2;
			s_s *= 2;
		}
		answer = f_s + s_s + t_s;
		
		return answer;
	}
}

public class Dart {
	public static void main(String[] args) {
		Solution st = new Solution();
		String dartResult = "1D2S#10S";

		st.solution(dartResult);
	}
}

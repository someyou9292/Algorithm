package Level2_NthGame;

import java.util.ArrayList;
import java.util.List;

class Solution { // n : 진법 t : 미리 구할 숫자의 갯수 m : 게임에 참가하는 인원 p : 튜브의 순서

	public String notation(int n, int t, int m) {
		String result = "";
		int count = 0;
		int num = 0;
		List<String> list = new ArrayList<String>();
		while (count < t * m) {
			if (num == 0) {
				result = "" + 0;
				list.add(result);
				result = "";
			}
			num++;
			int div = num;
			while (div != 0) {
				int r = div % n;
				if (r >= 10) {
					switch (r) {
					case 10:
						result = "A" + result;
						break;
					case 11:
						result = "B" + result;
						break;
					case 12:
						result = "C" + result;
						break;
					case 13:
						result = "D" + result;
						break;
					case 14:
						result = "E" + result;
						break;
					case 15:
						result = "F" + result;
						break;
					default:
						break;
					}
				} else {
					result = r + result;
				}
				div /= n;
			}

			list.add(result);
			result = "";
			count++;
		}

		for (int i = 0; i < list.size(); i++) {
			result += list.get(i);
		}

		return result;
	}

	public String solution(int n, int t, int m, int p) {
		String answer = "";
		String str = notation(n, t, m);
		int count = 0;
		int index = p - 1;
		while (count < t) {
			answer += str.charAt(index);
			index += m;
			count++;
		}
		System.out.println(answer);

		return answer;
	}
}

public class Main {
	public static void main(String[] args) {
		int n = 16;
		int t = 16;
		int m = 2;
		int p = 2;
		Solution st = new Solution();

		st.solution(n, t, m, p);
	}
}

package Test_Photo;

import java.util.ArrayList;
import java.util.List;


class Solution {

	public List<String> perm(String prefix, String str, List<String> list) {
		int n = str.length();
		if (n == 0) {
			list.add(prefix);
			return list;
//			System.out.println(prefix);
		} else {
			for (int i = 0; i < n; i++) {
				perm(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1), list);
			}
		}
		return list;
	}
	// 1 2 3 4 5
	// 조건 제시자 ~ 상대방 >,=,< 0~6 (간격)
	//String[] data = { "M~C<2", "C~M>1" };
	public boolean condition(String input, String command) {
		if (command.charAt(3) == '=') {
			if (Math.abs(input.indexOf(command.charAt(0))
					- input.indexOf(command.charAt(2))) == (Integer.parseInt(command.substring(4))) + 1) {
				return true;
			}
		}
		if (command.charAt(3) == '<') {
			if (Math.abs(input.indexOf(command.charAt(0)) - input.indexOf(command.charAt(2))) < (Integer
					.parseInt(command.substring(4))) + 1) {
				return true;
			}
		}

		if (command.charAt(3) == '>') {
			if (Math.abs(input.indexOf(command.charAt(0))
					- input.indexOf(command.charAt(2))) > (Integer.parseInt(command.substring(4))) + 1) {
				return true;
			}
		}

		return false;
	}

	public int solution(int n, String[] data) {
		String Friends = "ACFJMNRT";
//		String Friends = "NFRT";
		List<String> list = new ArrayList<String>();

		perm("", Friends, list);

		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < data.length; j++) {
				if (condition(list.get(i), data[j]) == false) {
					list.set(i, "-");
					break;
				}
			}
		}

		int answer = 8 * 7 * 6 * 5 * 4 * 3 * 2 * 1;

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).equals("-")) {
				answer--;
			}
		}

		System.out.println(answer);
		return answer;
	}
}

public class Photo {
	public static void main(String[] args) {
		Solution st = new Solution();

		int n = 2;
		// 1 2 3 4 5
		// 조건 제시자 ~ 상대방 >,=,< 0~6 (간격)
//		String[] data = { "M~C<2", "C~M>1" };
		String[] data = { "N~F=0", "R~T>2" };
		st.solution(n, data);
	}
}

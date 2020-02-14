package easy_682_BaseballGame;

import java.util.ArrayList;
import java.util.List;

/*
 Leetcode 682번 문제
 
정수 (한 라운드의 점수) :이 라운드에서 얻는 점수를 직접 나타냅니다.
"+"(한 라운드의 점수) :이 라운드에서 얻은 포인트가 마지막 두 개의 유효한 라운드 포인트의 합임을 나타냅니다.
"D"(한 라운드의 점수) :이 라운드에서 얻는 포인트가 마지막 유효 라운드 포인트의 두 배 데이터임을 나타냅니다.
"C"(라운드 점수가 아닌 작업) : 유효하지 않은 마지막 유효 라운드 포인트를 나타내며 제거해야합니다.
 * */
class Solution {
	public int calPoints(String[] ops) {
		int answer = 0;
		List<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < ops.length; i++) {
			int size = list.size();
			if (ops[i].equals("C")) {
				answer -= list.get(size-1);
				list.remove(size - 1);
			} else if (ops[i].equals("D")) {

				list.add(list.get(size - 1) * 2);
				answer += list.get(size - 1) * 2;
			} else if (ops[i].equals("+")) {
				int n = list.get(size - 1) + list.get(size - 2);
				answer += n;
				list.add(n);
			} else {
				int n = Integer.parseInt(ops[i]);
				answer += n;
				list.add(n);
			}
		}

		System.out.println(answer);
		return answer;
	}
}

public class Main {
	public static void main(String[] args) {
		Solution st = new Solution();
		String[] ops = { "4", "D", "D", "C", "D" };
		st.calPoints(ops);
	}
}

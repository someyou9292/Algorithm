package easy_682_BaseballGame;

import java.util.ArrayList;
import java.util.List;

/*
 Leetcode 682�� ����
 
���� (�� ������ ����) :�� ���忡�� ��� ������ ���� ��Ÿ���ϴ�.
"+"(�� ������ ����) :�� ���忡�� ���� ����Ʈ�� ������ �� ���� ��ȿ�� ���� ����Ʈ�� ������ ��Ÿ���ϴ�.
"D"(�� ������ ����) :�� ���忡�� ��� ����Ʈ�� ������ ��ȿ ���� ����Ʈ�� �� �� ���������� ��Ÿ���ϴ�.
"C"(���� ������ �ƴ� �۾�) : ��ȿ���� ���� ������ ��ȿ ���� ����Ʈ�� ��Ÿ���� �����ؾ��մϴ�.
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

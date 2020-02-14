package Level2_Tournament;

import java.util.LinkedList;
import java.util.Queue;

class Solution {
	public int solution(int n, int a, int b) {
		int answer = 1;
		int power = 0;
		int loop = n;
		Queue<Integer> q = new LinkedList<Integer>();

		for (int i = 1; i <= n; i++) {
			if (i == a) {
				q.add(-1); // a = -1
			} else if (i == b) {
				q.add(-2); // b = -2
			} else {
				q.add(i);
			}
		}

		while (loop > 1) {
			loop /= 2;
			power++;
		}

		if (n / 2 >= a && n / 2 < b) { // �� ���� �׻� �������� ����
			answer = power;
		} else {
			while (!q.isEmpty()) {
				int pop = q.poll();
				// pop �� a �̰� ť�� top�� b ��� ����. pop �� b �̰� ť�� top�� a ��� ����.
				if ((pop == -1 && q.peek() == -2) || (pop == -2 && q.peek() == -1)) {
					return answer;
				} else if ((pop == -1 && q.peek() != -2) || (pop == -2 && q.peek() != -1)) {
					// pop �� a �̰� ť�� top�� b�� �ƴ϶�� �ȸ���. pop �� b �̰� ť�� top�� a�� �ƴ϶�� �ȸ���.
					q.poll();
					q.add(pop);
				} else if ((pop != -1 && q.peek() == -2) || (pop != -2 && q.peek() == -1)) {
					// pop �� a �� �ƴϰ� ť�� top�� b��� �ȸ���. pop �� b�� �ƴϰ� ť�� top�� a��� �ȸ���.
					pop = q.poll();
					q.add(pop);
				} else {
					// a �� b �Ѵ� �ƴϸ� �н�
					q.poll();
					q.add(pop);
				}
				if (q.size() == n / 2) { // ť�� ũ�Ⱑ n�� 2�� ���� �Ͱ� ������ 1ȸ���� ������. answer����
					answer++;
					n /= 2;
				}
			}
		}

		return answer;
	}
}

public class Tournament {
	public static void main(String[] args) {
		Solution st = new Solution();
		int n = 32;
		int a = 1;
		int b = 31;
		st.solution(n, a, b);
	}
}

//  ��... �ȶ��� ��� ����..
//class Solution
//{
//    public int solution(int n, int a, int b)
//    {
//        int round = 0;
//        while(a != b)
//        {
//            a = a/2 + a%2;
//            b = b/2 + b%2;
//            round++;
//        }
//        return round;
//    }
//}

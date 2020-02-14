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

		if (n / 2 >= a && n / 2 < b) { // 이 경우는 항상 마지막에 만남
			answer = power;
		} else {
			while (!q.isEmpty()) {
				int pop = q.poll();
				// pop 이 a 이고 큐의 top이 b 라면 만남. pop 이 b 이고 큐의 top이 a 라면 만남.
				if ((pop == -1 && q.peek() == -2) || (pop == -2 && q.peek() == -1)) {
					return answer;
				} else if ((pop == -1 && q.peek() != -2) || (pop == -2 && q.peek() != -1)) {
					// pop 이 a 이고 큐의 top이 b가 아니라면 안만남. pop 이 b 이고 큐의 top이 a가 아니라면 안만남.
					q.poll();
					q.add(pop);
				} else if ((pop != -1 && q.peek() == -2) || (pop != -2 && q.peek() == -1)) {
					// pop 이 a 가 아니고 큐의 top이 b라면 안만남. pop 이 b가 아니고 큐의 top이 a라면 안만남.
					pop = q.poll();
					q.add(pop);
				} else {
					// a 와 b 둘다 아니면 패스
					q.poll();
					q.add(pop);
				}
				if (q.size() == n / 2) { // 큐의 크기가 n을 2로 나눈 것과 같으면 1회차는 끝난것. answer증가
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

//  와... 똑똑한 사람 많네..
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

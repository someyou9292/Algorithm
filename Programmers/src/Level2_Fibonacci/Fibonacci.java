package Level2_Fibonacci;

import java.util.HashMap;

class Solution {
	public int solution(int n) {
		int answer = 0;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(0, 0);
		map.put(1, 1);
		map.put(2, 1);
		map.put(3, 2);

		for (int i = 4; i <= n; i++) {
			int n1 = map.get(i - 1) % 1234567;
			int n2 = map.get(i - 2) % 1234567;
			map.put(i, n1 + n2);
		}

		return map.get(n);
	}
}

public class Fibonacci {
	public static void main(String[] args) {
		Solution st = new Solution();
		int n = 50;

		st.solution(n);
	}
}

//	 시간 초과..
//class Solution {
//	public int Fib(int n) {
//
//		if (n == 1 || n == 2) {
//			return 1;
//		}
//
//		return Fib(n - 1) + Fib(n - 2);
//	}
//
//	public int solution(int n) {
//		int answer = 0;
//				
//		return Fib(n) % 1234567;
//	}
//}

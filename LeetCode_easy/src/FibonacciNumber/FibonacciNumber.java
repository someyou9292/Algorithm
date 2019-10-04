package FibonacciNumber;

import java.util.HashMap;

/*
 * �Ǻ���ġ ������ ���Ͻÿ�.

Example 1:
Input: 2
Output: 1
Explanation: F(2) = F(1) + F(0) = 1 + 0 = 1.

Example 2:
Input: 3
Output: 2
Explanation: F(3) = F(2) + F(1) = 1 + 1 = 2.

Example 3:
Input: 4
Output: 3
Explanation: F(4) = F(3) + F(2) = 2 + 1 = 3.
 * 
 * */

// ȿ�� 100%    ��
class Solution {
	public int fib(int N) {
		int result = 0;

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(0, 0);
		map.put(1, 1);

		if (N > 1) {
			for(int i=2; i<=N; i++) {
				map.put(i,map.get(i-1) + map.get(i-2));
			}
		}
		
		return map.get(N);
	}
}

public class FibonacciNumber {
	public static void main(String[] args) {
		Solution st = new Solution();
		int N = 6;
		System.out.println(st.fib(N));
	}
}

// ȿ�� 26.11%   �� �ø���
//class Solution {
//	public int fib(int N) {
//		if (N == 0) {
//			return 0;
//		}
//		if (N == 1) {
//			return 1;
//		}
//		int result = 0;
//		if (N > 1) {
//			result = fib(N - 1) + fib(N - 2);
//		}
//
//		return result;
//	}
//}
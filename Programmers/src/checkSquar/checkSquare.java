package checkSquar;

import java.util.HashMap;

/*
임의의 양의 정수 n에 대해, n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하려 합니다.
n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요.
 * */
class Solution {
	public long solution(long n) {

		if (n > Long.MAX_VALUE) {
			return -1;
		}

		for (int i = 1; i <= n; i++) {
			if (Math.pow(i, 2) == n) {
				return (long) Math.pow(i + 1, 2);
			}
		}

		return -1;
	}
}

public class checkSquare {
	public static void main(String[] args) {
		Solution st = new Solution();
		long n = 1000000000;
		System.out.println(st.solution(n));
	}
}

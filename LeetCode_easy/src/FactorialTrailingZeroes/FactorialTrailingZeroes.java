package FactorialTrailingZeroes;

class Solution {
	public int trailingZeroes(int n) {

		int answer = 0;

		if (n < 5) {
			return 0;
		}

		while (n >= 5) {
			answer = answer + n / 5;
			n /= 5;
		}

		return answer;
	}
}

public class FactorialTrailingZeroes {
	public static void main(String[] args) {
		Solution st = new Solution();
		int n = 13;
		st.trailingZeroes(n);

	}
}

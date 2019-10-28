package PowerOfTwo;

class Solution {
	public boolean isPowerOfTwo(int n) {
		int answer = 1;

		if (n == 1) {
			return true;
		} else if (n % 2 == 1) {
			return false;
		}

		while (answer <= n) {
			if (n > 1024) {
				n /= 1024;
			}
			if (answer == n) {
				return true;
			}
			answer *= 2;
		}

		return false;
	}
}

public class PowerOfTwo {
	public static void main(String[] args) {
		Solution st = new Solution();
		int n = 6;
		System.out.println(st.isPowerOfTwo(n));
	}
}

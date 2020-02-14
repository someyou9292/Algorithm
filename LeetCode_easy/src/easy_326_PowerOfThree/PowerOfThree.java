package easy_326_PowerOfThree;

import java.util.HashMap;

class Solution {
	public boolean isPowerOfThree(int n) {
		
		while(n > 0) {
			if(n == 1) {
				return true;
			}
			if(n%3 != 0) {
				return false;
			}
			n /= 3;
		}
		
		return false;
	}
}

public class PowerOfThree {
	public static void main(String[] args) {
		Solution st = new Solution();
		int n = 59050;

		st.isPowerOfThree(n);
	}
}

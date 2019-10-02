package HappyNumber;

import java.util.HashMap;

/*
 행복한 수인지 판단해라.

 ex)
 1. 주어진 수를 각 자리수의 제곱형태로 바꿉니다.
 2. 바꾼 수들의 합을 구합니다.
 3. 위의 과정을 반복합니다.
 4. 결과가 1이면 행복한 수입니다. 
 
Input: 19
Output: true
Explanation: 
1^2 + 9^2 = 82
8^2 + 2^2 = 68
6^2 + 8^2 = 100
1^2 + 0^2 + 0^2 = 1
 * */

class Solution {
	public boolean isHappy(int n) {

		HashMap<Integer, Integer> map = new HashMap();
		int re = n;
		int weightNumber = n;
		while (re != 1) {
			int sum = 0;
			while (weightNumber != 0) {
				sum = sum + ((weightNumber % 10) * (weightNumber % 10));
				weightNumber = weightNumber / 10;
			}
			re = sum;
			weightNumber = sum;
			if(!map.containsKey(re)) {
				map.put(re,re);
			}else {
				return false;
			}
		}

		return true;
	}
}

public class HappyNumber {
	public static void main(String[] args) {
		Solution st = new Solution();
		int n = 83;
		System.out.println(st.isHappy(n));
	}
}

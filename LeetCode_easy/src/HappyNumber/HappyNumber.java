package HappyNumber;

import java.util.HashMap;

/*
 �ູ�� ������ �Ǵ��ض�.

 ex)
 1. �־��� ���� �� �ڸ����� �������·� �ٲߴϴ�.
 2. �ٲ� ������ ���� ���մϴ�.
 3. ���� ������ �ݺ��մϴ�.
 4. ����� 1�̸� �ູ�� ���Դϴ�. 
 
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

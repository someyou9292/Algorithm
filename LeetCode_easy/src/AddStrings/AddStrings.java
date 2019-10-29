package AddStrings;

import java.util.HashMap;

/*
 주어진 문자열 두 개를 더한 값을 반환해라
 
 1. num1, num2 의 길이는 모두 5100 보다 작다
 2. num1, num2 는 0-9 로 이루어져있다.
 3. num1, num2 는 0으로 시작하지 않는다.
 4. BigInteger 라이브러리 혹은 Integer.parseInt 를 사용하면 안된다.
 * */
class Solution {
	public String reverseStr(String s) {
		return (new StringBuffer(s)).reverse().toString();
	}

	public String addStrings(String num1, String num2) {
		String answer = "";

		int l1 = num1.length();
		int l2 = num2.length();
		StringBuilder sumStr = new StringBuilder();
		int sum = 0;
		int carry = 0;

		while (l1 > 0 || l2 > 0) {
			if (l1 > 0 && l2 > 0) {
				sum = num1.charAt(l1-1) - '0' + num2.charAt(l2-1) - '0' + carry;
			} else if (l1 > 0 && l2 <= 0) {
				sum = num1.charAt(l1-1) - '0' + carry;
			} else {
				sum = num2.charAt(l2-1) - '0' + carry;
			}
			carry = 0;
			if (sum > 9) {
				carry = 1;
				sum = sum % 10;
			}
			sumStr.append(sum);
			l1--;
			l2--;
		}
		if (carry > 0) {
			sumStr.append(carry);
		}
		
		return sumStr.reverse().toString();
	}
}

public class AddStrings {
	public static void main(String[] args) {
		Solution st = new Solution();
		String num1 = "1234";
		String num2 = "1234";
		st.addStrings(num1, num2);
	}
}

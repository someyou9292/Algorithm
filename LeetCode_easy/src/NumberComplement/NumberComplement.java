package NumberComplement;

import java.util.Stack;

/*
 * �־��� ���� ������ ���ض�( �ܼ� ��Ʈ��ȯ)
 * 
Input: 5
Output: 2
Explanation: The binary representation of 5 is 101 (no leading zero bits), and its complement is 010. So you need to output 2.

Input: 1
Output: 0
Explanation: The binary representation of 1 is 1 (no leading zero bits), and its complement is 0. So you need to output 0.

 * */

// ȿ�� 100%    ���ߴٸ�
class Solution {
	public int findComplement(int num) {
		int result = 0;
		int add = 1;

		while (num != 0) {
			if (num % 2 == 0) {
				result += add;
			}
			add *= 2;
			num = num / 2;
		}

		return result;
	}
}

public class NumberComplement {
	public static void main(String[] args) {
		Solution st = new Solution();
		int num = 10;

		st.findComplement(num);
	}
}

// ȿ�� 25.08%..  ��..
//class Solution {
//	public int findComplement(int num) {
//		String binary = "";
//
//		while (num != 0) {
//			binary += (num % 2) + "";
//			num = num / 2;
//		}
//
//		int result = 0;
//		int add = 1;
//
//		for (int i = 0; i < binary.length(); i++) {
//			if(binary.charAt(i) == '0') {
//				result += add;
//			}
//			add *= 2;
//		}
//
//		System.out.println(result);
//		return result;
//	}
//}

// ȿ�� 25.08%  �Ȱ���..?
//class Solution {
//	public int findComplement(int num) {
//		String binary = "";
//		String complement = "";
//
//		while (num != 0) {
//			binary += (num % 2) + "";
//			num = num / 2;
//		}
//
//		for (int i = binary.length()-1; i >= 0; i--) {
//			if (binary.charAt(i) == '1') {
//				complement += '0';
//			} else {
//				complement += '1';
//			}
//		}
//
//		int result = 0;
//		int add = 1;
//		for (int i = complement.length() - 1; i >= 0; i--) {
//			if (complement.charAt(i) == '1') {
//				result += add;
//			}
//			add *= 2;
//		}
//
//		return result;
//	}
//}

//	ȿ�� 25.08%    ���� �÷�����
//class Solution {
//	public int findComplement(int num) {
//		String binary = Integer.toBinaryString(num);
//		String complement = "";
//		for (int i = 0; i < binary.length(); i++) {
//			if (binary.charAt(i) == '1') {
//				complement += '0';
//			} else {
//				complement += '1';
//			}
//		}
//
//		int result = 0;
//		int add = 1;
//		for (int i = complement.length() - 1; i >= 0; i--) {
//			if (complement.charAt(i) == '1') {
//				result += add;
//			}
//			add *= 2;
//		}
//
//		return result;
//	}
//}

//	 ȿ�� 6.86%   �й�����
//class Solution {
//	public int findComplement(int num) {
//		String binaryNumber = "";
//		String result = "";
//		Stack stack = new Stack();
//		
//		while (num != 0) {
//			stack.push(num%2);
//			num = num / 2;
//		}
//		while(!stack.isEmpty()) {
//			binaryNumber += stack.pop();
//		}
////		System.out.println("binaryNumber >> " + binaryNumber);
//		
//		for (int i = 0; i < binaryNumber.length(); i++) {
//			if (binaryNumber.charAt(i) == '0') {
//				result += 1 + "";
//			} else {
//				result += 0 + "";
//			}
//		}
//
////		System.out.println("result >> " + result);
//		int r = 0;
//		int add = 1;
//
//		for (int i = result.length() - 1; i >= 0; i--) {
//			if(result.charAt(i) == '1') {
//				r += add;
//			}
//			add *= 2;
//		}
//
////		System.out.println(r);
//
//		return r;
//	}
//}

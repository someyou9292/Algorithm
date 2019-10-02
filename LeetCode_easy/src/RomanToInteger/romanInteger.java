package RomanToInteger;

import java.util.Scanner;

/*
  19.09.17  
    로마문자
  Description
  I -> 1			*  규칙
  V -> 5			1. 로마자는 큰수 -> 작은수 로 쓴다
  X -> 10			2. 작은수가 큰수의 앞에 오면 뺄셈 역할
  L -> 50			   ex) IV -> 4 ,   IX -> 9
  C -> 100			   ex) XL -> 40,   XC -> 90
  D -> 500			   ex) CD -> 400,  CM -> 900
  M -> 1000
					3. 로마자가 주어지면 정수로 변환
					       입력은 1 ~ 3999 사이로 주어진다.
ex1) 
Input: "III"
Output: 3

ex2) 
Input: "IV"
Output: 4

ex3)
Input: "LVIII"
Output: 58
Explanation: L = 50, V= 5, III = 3.

ex4)
Input: "MCMXCIV"
Output: 1994
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
 */

class Solution {
	public int romanToInt(String s) {
		int result = 0;
		int maxIndex = s.length() - 1;

		for (int i = maxIndex; i >= 0; i--) {
			switch (s.charAt(i)) {
			case 'I':
				if (i == maxIndex) {
					result += 1;
				} else {
					if (s.charAt(i + 1) == 'I') {
						result += 1;
					} else
						result -= 1;
				}
				break;
			case 'V':
				if(i == maxIndex) {
					result += 5;
				}else {
					if(s.charAt(i+1) == 'V' || s.charAt(i+1) =='I') {
						result += 5;
					}else
						result -= 5;
				}
				break;
			case 'X':
				if(i == maxIndex) {
					result += 10;
				}else if(i != maxIndex){
					if((s.charAt(i+1) == 'X') || (s.charAt(i+1) == 'V') || (s.charAt(i+1) =='I')) {
						result += 10;
					}else {
						result -= 10;
					}
				}
				break;
			case 'L':
				if(i == maxIndex) {
					result += 50;
				}else {
					if(s.charAt(i+1) == 'L' ||s.charAt(i+1) == 'X' ||
							s.charAt(i+1) == 'V' || s.charAt(i+1) =='I') {
						result += 50;
					}else
						result -= 50;
				}
				break;
			case 'C':
				if(i == maxIndex) {
					result += 100;
				}else {
					if(s.charAt(i+1) == 'C' || s.charAt(i+1) == 'L' ||s.charAt(i+1) == 'X' ||
							s.charAt(i+1) == 'V' || s.charAt(i+1) =='I') {
						result += 100;
					}else
						result -= 100;
				}
				break;
			case 'D':
				if(i == maxIndex) {
					result += 500;
				}else {
					if(s.charAt(i+1) == 'D' ||s.charAt(i+1) == 'C' || s.charAt(i+1) == 'L' 
							||s.charAt(i+1) == 'X' || s.charAt(i+1) == 'V' || s.charAt(i+1) =='I') {
						result += 500;
					}else
						result -= 500;
				}
				break;
			case 'M':
				if(i == maxIndex) {
					result += 1000;
				}else {
					if(s.charAt(i+1) == 'M'||s.charAt(i+1) == 'D' ||s.charAt(i+1) == 'C' || s.charAt(i+1) == 'L' 
							||s.charAt(i+1) == 'X' || s.charAt(i+1) == 'V' || s.charAt(i+1) =='I') {
						result += 1000;
					}else
						result -= 1000;
				}
				break;
			default:
				break;
			}
		}
		return result;
	}
}

public class romanInteger {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();

		Solution st = new Solution();
		System.out.println(st.romanToInt(s));
	}
}

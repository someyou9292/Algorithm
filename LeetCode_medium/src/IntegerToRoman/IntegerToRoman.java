package IntegerToRoman;

/*
 주어지는 수를 로마 수로 바꾸시오.
 (* 1~ 3999 의 수만 주어집니다.)
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
 ex 1)
 3 -> III
 4 -> IV
 5 -> V
 9 -> IX
 58 -> LVIII
 1994 -> MCMXCIV
 * */

class Solution {
	public String intToRoman(int num) {
		String answer = "";

		int[] integer = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
		String[] Roman = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

		int index = 0;
		while (num > 0) {
			if (num - integer[index] >= 0) {
				num -= integer[index];
				answer = answer + Roman[index];
				index = 0;
				continue;
			}
			index++;
		}

		return answer;
	}
}

public class IntegerToRoman {
	public static void main(String[] args) {
		Solution st = new Solution();
		int num = 1994;
		st.intToRoman(num);
	}
}

//효율 68.22%  알고리즘적으로 생각해보자..
//class Solution {
//	public String intToRoman(int num) {
//		String answer = "";
//		int[] weight = new int[4];
//		int index = 0;
//
//		while (num != 0) {
//			weight[index] = num % 10;
//			num /= 10;
//			index++;
//		}
//		index = 0;
//		while (index != 4) {
//			if (index == 0) {
//				if (weight[index] == 1) {
//					answer = "I" + answer;
//				} else if (weight[index] == 2) {
//					answer = "II"  + answer;
//				} else if (weight[index] == 3) {
//					answer = "III"  + answer;
//				} else if (weight[index] == 4) {
//					answer = "IV"  + answer;
//				} else if (weight[index] == 5) {
//					answer = "V" + answer;
//				} else if (weight[index] == 6) {
//					answer = "VI" + answer;
//				} else if (weight[index] == 7) {
//					answer = "VII" + answer;
//				} else if (weight[index] == 8) {
//					answer = "VIII" + answer;
//				} else if (weight[index] == 9) {
//					answer = "IX" + answer;
//				}
//			} else if (index == 1) {
//				if (weight[index] == 1) {
//					answer = "X" + answer;
//				} else if (weight[index] == 2) {
//					answer = "XX" + answer;
//				} else if (weight[index] == 3) {
//					answer = "XXX" + answer;
//				} else if (weight[index] == 4) {
//					answer = "XL" + answer;
//				} else if (weight[index] == 5) {
//					answer = "L" + answer;
//				} else if (weight[index] == 6) {
//					answer = "LX" + answer;
//				} else if (weight[index] == 7) {
//					answer = "LXX" + answer;
//				} else if (weight[index] == 8) {
//					answer = "LXXX" + answer;
//				} else if (weight[index] == 9) {
//					answer = "XC" + answer;
//				}
//			} else if (index == 2) {
//				if (weight[index] == 1) {
//					answer = "C" + answer;
//				} else if (weight[index] == 2) {
//					answer = "CC" + answer;
//				} else if (weight[index] == 3) {
//					answer = "CCC" + answer;
//				} else if (weight[index] == 4) {
//					answer = "CD" + answer;
//				} else if (weight[index] == 5) {
//					answer = "D" + answer;
//				} else if (weight[index] == 6) {
//					answer = "DC" + answer;
//				} else if (weight[index] == 7) {
//					answer = "DCC" + answer;
//				} else if (weight[index] == 8) {
//					answer = "DCCC" + answer;
//				} else if (weight[index] == 9) {
//					answer = "CM" + answer;
//				}
//			} else if (index == 3) {
//				if (weight[index] == 1) {
//					answer = "M" + answer;
//				} else if (weight[index] == 2) {
//					answer = "MM" + answer;
//				} else if (weight[index] == 3) {
//					answer = "MMM" + answer;
//				}
//			}
//
//			index++;
//		}
//		
//		return answer;
//	}
//}

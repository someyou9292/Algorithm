package StringToInteger;

// 효율 25.64%
class Solution {
	public int myAtoi(String str) {
		String strNum = "";
		int answer = 0;
		boolean sign = false;
		int start = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '+' || str.charAt(i) == '-') {
				start = i;
				sign = true;
				break;
			} else if (str.charAt(i) >= 48 && str.charAt(i) <= 57) {
				start = i;
				sign = false;
				break;
			} else if (str.charAt(i) == ' ') {
				continue;
			} else {
				return 0;
			}
		}

		if (sign == true) {
			strNum += str.charAt(start);
			for (int i = start + 1; i < str.length(); i++) {
				if (str.charAt(i) >= 48 && str.charAt(i) <= 57) {
					strNum += str.charAt(i);
				} else {
					break;
				}
			}
		} else {
			for (int i = start; i < str.length(); i++) {
				if (str.charAt(i) >= 48 && str.charAt(i) <= 57) {
					strNum += str.charAt(i);
				} else {
					break;
				}
			}
		}

		if (strNum.length() == 0) {
			return 0;
		} else if (strNum.length() == 1) {
			if (strNum.equals("+") || strNum.equals("-")) {
				return 0;
			}
		}
		try {
			answer = Integer.parseInt(strNum);
		} catch (NumberFormatException e) {
			if (strNum.charAt(0) == '-') {
				answer = Integer.MIN_VALUE;
			} else {
				answer = Integer.MAX_VALUE;
			}
		}
		System.out.println(answer);

		return (int) answer;
	}
}

public class StringToInteger {
	public static void main(String[] args) {
		Solution st = new Solution();
		String str = "-5-";
		st.myAtoi(str);
	}
}

//  효율 25.64%.. 
//class Solution {
//	public int myAtoi(String str) {
//		String strNum = "";
//		int answer = 0;
//		int start = 0;
//
//		for (int i = 0; i < str.length(); i++) {
//			if (str.charAt(i) == '+' || str.charAt(i) == '-' || (str.charAt(i) >= 48 && str.charAt(i) <= 57)) {
//				start = i;
//				break;
//			} else if (str.charAt(i) == ' ') {
//				continue;
//			} else {
//				return 0;
//			}
//		}
//
//		for (int i = start; i < str.length(); i++) {
//			if (str.charAt(i) == '+' || str.charAt(i) == '-' || (str.charAt(i) >= 48 && str.charAt(i) <= 57)) {
//				if(i > start) {
//					if(str.charAt(i) == '+' || str.charAt(i) == '-') {
//						break;
//					}
//				}
//				strNum += str.charAt(i);
//			} else {
//				break;
//			}
//		}
//		
//
//		System.out.println(strNum);
//
//		if (strNum.length() == 1) {
//			if (strNum.charAt(0) == '+' || strNum.charAt(0) == '-') {
//				return 0;
//			}
//		} else if (strNum.length() == 0) {
//			return 0;
//		}
//
//		if (strNum.charAt(0) == '+' || strNum.charAt(0) == '-') {
//			for (int i = 1; i < strNum.length(); i++) {
//				if (strNum.charAt(i) >= 48 && strNum.charAt(i) <= 57) {
//					continue;
//				} else {
//					return 0;
//				}
//			}
//		}else {
//			for(int i=0; i<strNum.length();i++) {
//				if(strNum.charAt(i) >= 48 && strNum.charAt(i) <= 57) {
//					continue;
//				}else {
//					return 0;
//				}
//			}
//		}
//
//		try {
//			answer = Integer.parseInt(strNum);
//		} catch (NumberFormatException e) {
//			if (strNum.charAt(0) == '-') {
//				answer = Integer.MIN_VALUE;
//			} else {
//				answer = Integer.MAX_VALUE;
//			}
//		}
//		System.out.println(answer);
//
//		return (int) answer;
//	}
//}

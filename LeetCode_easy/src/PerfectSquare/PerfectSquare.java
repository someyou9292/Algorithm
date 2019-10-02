package PerfectSquare;

import java.util.HashMap;

/*
 내장된 sqrt 함수를 사용하지 않고 입력값이 어떤 수의 제곱수가 맞는지 판단해라
 
  ex 16 -> true, 14 -> false
 * */

class Solution {
	public boolean isPerfectSquare(int num) {
		int mid = num / 2;
		if (num == 1 || num == 4) {
			return true;
		} else {
			for (int i = mid; i > 0; i--) {
				int result = i * i;
				if (result == num) {
					return true;
				}
			}
		}

		return false;
	}
}

public class PerfectSquare {
	public static void main(String[] args) {
		Solution st = new Solution();
		int num = 720394722;
		System.out.println(st.isPerfectSquare(num));

	}
}

//class Solution {
//	public boolean isPerfectSquare(int num) {
//		
//		if(num == 1|| num == 4) {
//			return true;
//		}
//		int s = 1, e = num/2;
//		
//		while(s<=e) {
//			long mid = s + (e-s) /2;
//			long result = mid * mid;
//			if(result == num) {
//				return true;
//			}else if( result < num) {
//				s = (int) mid + 1;
//			}else {
//				e = (int) mid - 1;
//			}
//		}
//
//		return false;
//	}
//}

package SumOfTwoInteger;

/*
   두 수를 더하지만 + - 연산자를 사용할 수 없습니다.
   
   a = 1, b = 2   output = 3
 * */

// Solution
class Solution {
    public int getSum(int x, int y) {
        while (y != 0)  
        { 
            // carry now contains common 
            // set bits of x and y 
            int carry = x & y; 
  
            // Sum of bits of x and  
            // y where at least one  
            // of the bits is not set 
            x = x ^ y; 
  
            // Carry is shifted by  
            // one so that adding it  
            // to x gives the required sum 
            y = carry << 1; 
        } 
        return x; 
    }
}

public class SumOfTwoInteger {
	public static void main(String[] args) {
		Solution st = new Solution();
		int a = 7, b = 3;

		System.out.println(st.getSum(a, b));
	}
}

// 효율 6.35   꾸떼기
//class Solution {
//	public int getSum(int a, int b) {
//		int result = a;
//
//		if(b == 0) {
//			return a;
//		}
//		if (b > 0) {
//			for (int i = 0; i < b; i++) {
//				result++;
//			}
//		}else {
//			for (int i = 0; i > b; i--) {
//				result--;
//			}
//		}
//		return result;
//	}
//}

package ReverseInteger;

/*
 Given a 32-bit signed integer, reverse digits of an integer.
 ex1)
 Input: 123
 Output: 321
 
 ex2)
 Input: -123
 Output: -321
 
 ex3)
 Input: 120
 Output: 21
 */
import java.util.*;

class Solution {
	public int reverse(int x) {

		int result = 0;
		while (x != 0) {
			int pop = x % 10;
			x = x / 10;

			// int 형의 최대값 보다 크거나 최소값 보다 작다면 0을 리턴
			if (result > Integer.MAX_VALUE / 10)
				return 0;
			if (result < Integer.MIN_VALUE / 10)
				return 0;

			result = result * 10 + pop;
		}
		return result;
	}
}

public class ReverseInteger {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		Solution st = new Solution();

		System.out.println(st.reverse(input));
	}
}

package FibonacciNumber;

/*
 * 피보나치 수열을 구하시오.

Example 1:
Input: 2
Output: 1
Explanation: F(2) = F(1) + F(0) = 1 + 0 = 1.

Example 2:
Input: 3
Output: 2
Explanation: F(3) = F(2) + F(1) = 1 + 1 = 2.

Example 3:
Input: 4
Output: 3
Explanation: F(4) = F(3) + F(2) = 2 + 1 = 3.
 * 
 * */

class Solution {
    public int fib(int N) {
    	if(N == 0) {
    		return 0;
    	}
    	if(N == 1) {
    		return 1;
    	}
    	int result = 0;    	
    	if(N > 1) {
    		result = fib(N-1) + fib(N-2);
    	}
    	
    	return result;
    }
}

public class FibonacciNumber {
	public static void main(String[] args) {
		Solution st = new Solution();
		int N = 6;
		System.out.println(st.fib(N));
	}
}

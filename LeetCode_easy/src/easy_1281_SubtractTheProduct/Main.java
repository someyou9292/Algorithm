package easy_1281_SubtractTheProduct;

/*
 leetcode 1281 번 문제
 정수가 주어지면 각 자리수의 곱 과 각 자리수의 합의 차이를 구하시오.
 * */
class Solution {
    public int subtractProductAndSum(int n) {
        int mul = 1;
        int sum = 0;
        
        while(n != 0) {
        	int r = n % 10;
        	mul *= r;
        	sum += r;
        	
        	n /= 10;
        }
        
        return mul - sum;
    }
}

public class Main {
	public static void main(String[] args) {
		Solution st = new Solution();
		int n = 234;
		
		st.subtractProductAndSum(n);
	}
}

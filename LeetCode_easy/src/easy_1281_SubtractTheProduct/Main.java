package easy_1281_SubtractTheProduct;

/*
 leetcode 1281 �� ����
 ������ �־����� �� �ڸ����� �� �� �� �ڸ����� ���� ���̸� ���Ͻÿ�.
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

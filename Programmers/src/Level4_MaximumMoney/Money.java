package Level4_MaximumMoney;

class Solution {
	public int solution(int[] money) {
		int[] sum1 = new int[money.length-1];
		int[] sum2 = new int[money.length];
		
		sum1[0] = money[0];
		sum1[1] = money[0];
		sum2[0] = 0;
		sum2[1] = money[1];
		
		for(int i = 2 ; i<money.length-1;i++) {
			sum1[i] = Math.max(sum1[i-2] + money[i], sum1[i-1]);
		}
		
		for(int i = 2 ; i<money.length;i++) {
			sum2[i] = Math.max(sum2[i-2] + money[i], sum2[i-1]);
		}
		
		return Math.max(sum1[money.length-2], sum2[money.length-1]);
	}
}

public class Money {
	public static void main(String[] args) {
		Solution st = new Solution();
		int[] money = { 3, 2, 1, 50, 60};

		System.out.println(st.solution(money));
	}
}


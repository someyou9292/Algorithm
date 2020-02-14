package Level2_SeqNumber;

class Solution {
	public int solution(int n) {
		int count = 0;

		for (int i = 1; i <= n; i++) {
			int sum = 0;
			for (int j = i; sum < n; j++) {
				sum += j;
			}
			if(sum == n) {
				count++;
			}
		}
				
		return count;
	}
}

public class Number {
	public static void main(String[] args) {
		Solution st = new Solution();
		int n = 15;

		st.solution(n);
	}
}

package Level1_35;

import java.util.Arrays;

class Solution {
	public int solution(int[] d, int budget) {
		int answer = 0;

		Arrays.sort(d);

		for (int i = 0; i < d.length; i++) {
			if(budget >= d[i]) {
				budget -= d[i];
				answer++;
			}else {
				break;
			}
		}
		
		return answer;
	}
}
public class level1_35 {
	public static void main(String[] args) {
		Solution st = new Solution();
		int[] d = { 2,3,2,1,3 };
		int budget = 10;
		st.solution(d, budget);
	}
}

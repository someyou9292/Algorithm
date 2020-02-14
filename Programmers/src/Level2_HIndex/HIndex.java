package Level2_HIndex;

import java.util.Arrays;

class Solution {
	public int solution(int[] citations) {
		int H_index = 0;
		Arrays.sort(citations);
		int loop = 0;
		int max = citations.length;
		
		// loop가 0부터 1씩 증가하면서 H_index를 구함.
		while (loop <= max) {		// H_index 의 최대값은 논문을 발표한 수가 Max이므로.
			int count = 0;
			for (int i = 0; i < citations.length; i++) {
				if (loop <= citations[i]) {		
					count++;
				}
			}
			if(H_index <= count && loop <= count) {		// 더 큰 H_index가 나오면 갱신함.
				H_index = loop;
			}
			loop++;
		}
		
		System.out.println(H_index);
		
		return H_index;
	}
}

public class HIndex {
	public static void main(String[] args) {
		Solution st = new Solution();
		int[] citations = { 3, 0, 6, 1, 5 };

		st.solution(citations);
	}
}

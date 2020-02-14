package Level2_makeMin;

import java.util.Arrays;

class Solution {
	public int solution(int[] A, int[] B) {
		int answer = 0;

		Arrays.sort(A);
		Arrays.sort(B);

		for (int i = 0, j = A.length - 1; i < A.length; i++, j--) {
			answer += A[i] * B[j];
		}

		System.out.println(answer);
		
		return answer;
	}
}

public class makeMin {
	public static void main(String[] args) {
		Solution st = new Solution();
		int[] A = { 1,2 };
		int[] B = { 3,4 };

		st.solution(A, B);
	}
}

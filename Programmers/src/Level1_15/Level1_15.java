package Level1_15;

import java.util.Arrays;

class Solution {
	public int solution(int n) {
		int answer = 0;
		int count = 0;
		int[] arr = new int[n + 1];

		Arrays.fill(arr, 1);

		for (int i = 2; i <= n; i++) {
			for (int j = 2; i * j <= n; j++) {
				arr[i * j] = -1;
			}
		}
		for (int i = 2; i < arr.length; i++) {
			if(arr[i] == 1) {
				answer++;
			}
		}
		
		for(int i=0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println(answer);
		return answer;
	}
}

public class Level1_15 {
	public static void main(String[] args) {
		Solution st = new Solution();
		int n = 5;
		st.solution(n);
	}
}

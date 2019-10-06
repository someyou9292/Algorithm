package Level1_4;

import java.util.Arrays;

class Solution {
	public int Answer(int[] arr, int n, int m, int k) {
		int[] result = new int[m - n + 1];
		int index = 0;
		for (int i = n - 1; i < m ; i++) {
			result[index] = arr[i];
			index++;
		}
		Arrays.sort(result);

		return result[k - 1];
	}

	public int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];

		for (int i = 0; i < commands.length; i++) {
			answer[i] = Answer(array, commands[i][0], commands[i][1], commands[i][2]);
		}

		return answer;
	}
}

public class Level1_4 {
	public static void main(String[] args) {
		Solution st = new Solution();
		int[] array = { 1, 5, 2, 6, 3, 7, 4 };
		int[][] commands = { { 2, 5, 3 }, { 4, 4, 1 }, { 1, 7, 3 } };
		st.solution(array, commands);
	}
}

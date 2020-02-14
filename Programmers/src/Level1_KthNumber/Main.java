package Level1_KthNumber;

import java.util.Arrays;

class Solution {
	public int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];

		for (int i = 0; i < commands.length; i++) {
			answer[i] = Answer(array, commands[i][0], commands[i][1], commands[i][2]);
		}

		return answer;
	}

	public int Answer(int[] arr, int i, int j, int k) {
		int[] sortedArr = new int[j - i + 1];
		int index = 0;
		for (int a = i - 1; a < j; a++) {
			sortedArr[index] = arr[a];
			index++;
		}
		Arrays.sort(sortedArr);
		return sortedArr[k - 1];
	}
}

public class Main {
	public static void main(String[] args) {
		Solution st = new Solution();
		int[] array = { 1, 5, 2, 6, 3, 7, 4 };
		int[][] commands = { { 2, 5, 3 }, { 4, 4, 1 }, { 1, 7, 3 } };

		st.solution(array, commands);
	}
}

package Level2_MulMatrics;

class Solution {
	public int[][] solution(int[][] arr1, int[][] arr2) {
		int[][] answer = new int[arr1.length][arr2[0].length];
		System.out.println("arr1 의 행 >" + arr1.length);
		System.out.println("arr1 의 열 >" + arr1[0].length);
		System.out.println("arr2 의 행 >" + arr2.length);
		System.out.println("arr2 의 열 >" + arr2[0].length);
		System.out.println("answer의 행 > " + answer.length);
		System.out.println("answer의 열 > " + answer[0].length);

		int ans_i = 0;		// answer의 i 인덱스
		int ans_j = 0;		// answer의 j 인덱스
		for (int i = 0; i < arr1.length; i++) {
			int j_index = 0;	// 열의 인덱스
			int i_index = 0;	// arr2의 열 인덱스
			for (int j = 0; j < arr1[0].length * arr2[0].length; j++) {
				answer[ans_i][ans_j] += arr1[i][j_index] * arr2[j_index][i_index];
				j_index++;
				if (j_index == arr2.length) {
					j_index = 0;
					i_index++;	
					ans_j++;	// 열 증가
				}
			}
			ans_i++;		// 한 행 증가
			ans_j = 0;		// 열을 다시 0으로 초기화
		}

		for (int i = 0; i < answer.length; i++) {
			for (int j = 0; j < answer[i].length; j++) {
				System.out.print(answer[i][j] + " ");
			}
			System.out.println();
		}

		return answer;
	}
}

public class MulMatrics {
	public static void main(String[] args) {
		Solution st = new Solution();
		int[][] arr1 = { { 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1 } };
		int[][] arr2 = { { 1, 1 }, { 1, 1 }, { 1, 1 }, { 1, 1 }, { 1, 1 } };
//		int[][] arr1 = { { 1 }, { 1 }, { 1 } };
//		int[][] arr2 = { { 1, 1, 1 } };

		st.solution(arr1, arr2);
	}
}

package Level2_MulMatrics;

class Solution {
	public int[][] solution(int[][] arr1, int[][] arr2) {
		int[][] answer = new int[arr1.length][arr2[0].length];
		System.out.println("arr1 �� �� >" + arr1.length);
		System.out.println("arr1 �� �� >" + arr1[0].length);
		System.out.println("arr2 �� �� >" + arr2.length);
		System.out.println("arr2 �� �� >" + arr2[0].length);
		System.out.println("answer�� �� > " + answer.length);
		System.out.println("answer�� �� > " + answer[0].length);

		int ans_i = 0;		// answer�� i �ε���
		int ans_j = 0;		// answer�� j �ε���
		for (int i = 0; i < arr1.length; i++) {
			int j_index = 0;	// ���� �ε���
			int i_index = 0;	// arr2�� �� �ε���
			for (int j = 0; j < arr1[0].length * arr2[0].length; j++) {
				answer[ans_i][ans_j] += arr1[i][j_index] * arr2[j_index][i_index];
				j_index++;
				if (j_index == arr2.length) {
					j_index = 0;
					i_index++;	
					ans_j++;	// �� ����
				}
			}
			ans_i++;		// �� �� ����
			ans_j = 0;		// ���� �ٽ� 0���� �ʱ�ȭ
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

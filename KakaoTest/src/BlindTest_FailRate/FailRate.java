package BlindTest_FailRate;

import java.util.Arrays;
import java.util.HashMap;

// ������ : ���������� ���������� ���� Ŭ���� ���� �÷��̾� �� / ���������� ������ �÷��̾� ��.

class Solution {
	public int[] solution(int N, int[] stages) {
		int[] answer = new int[N];
		int totalPlayer = stages.length;
		HashMap<Integer, Integer> currentStage = new HashMap<Integer, Integer>();
		HashMap<Integer, Double> fail_Rate = new HashMap<Integer, Double>();
		double[] fail = new double[N];

		// ���������� ����
		Arrays.sort(stages);
		// �������� �� ���� ���� �� ���� ����� �ֳ��� HashMap�� ����
		for (int i = 0; i < stages.length; i++) {
			if (!currentStage.containsKey(stages[i])) {
				currentStage.put(stages[i], 1);
			} else {
				currentStage.put(stages[i], currentStage.get(stages[i]) + 1);
			}
		}

		
		// �ش� ���������� �������� HashMap�� ����.
		for (int i = 0; i < N; i++) {
			if (currentStage.containsKey(i + 1)) {
				fail[i] = (double) currentStage.get(i + 1) / (double) totalPlayer;
				totalPlayer = totalPlayer - currentStage.get(i + 1);
				fail_Rate.put(i + 1, fail[i]);
			} else {
				fail[i] = 0;
				fail_Rate.put(i + 1, fail[i]);
			}
		}
		
//		for(int i=1; i<=N; i++) {
//			System.out.println(i + " ��° ������ : " + fail_Rate.get(i));
//		}
//		
//		System.out.println();
		
		for (int i = 0; i < N; i++) {
			answer[i] = i + 1;
		}

		
		// �������� ���� ����
		int temp;
		for (int i = answer.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (fail_Rate.get(answer[j]) < fail_Rate.get(answer[j+1])) {
					temp = answer[j];
					answer[j] = answer[j + 1];
					answer[j + 1] = temp;
				}
			}
		}

//		for (int n : answer) {
//			System.out.println(n);
//		}

		return answer;
	}
}

public class FailRate {
	public static void main(String[] args) {
		Solution st = new Solution();
		int N = 5;
		int[] stages = { 2, 1, 2, 6, 2, 4, 3, 3 };

		st.solution(N, stages);
	}
}

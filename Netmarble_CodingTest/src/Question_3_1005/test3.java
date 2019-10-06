package Question_3_1005;

/*
 * 양궁문제.
 * 이차원 배열 : 화살을 맞춘 좌표
 * 최종 몇점을 얻었는지?
 * */

class Solution {
	public int solution(int[] target, int[][] positions) {
		int answer = 0;

		int[] r = new int[5];
		int[] t = { 10, 8, 6, 4, 2 };
		double[] score = new double[5];
		double pi = 3.14;
		int p = 0;
		for (int i = 0; i < target.length; i++) {
			p = p + target[i];
			score[i] = p * p * pi;
		}

		int total = 0;

		for (int i = 0; i < 10; i++) {
			double area = ((positions[i][0] * positions[i][0]) + (positions[i][1] * positions[i][1])) * pi;
			for (int j = 0; j < score.length; j++) {
				if (score[j] >= area) {
					total = total + t[j];
					break;
				}
			}
		}

		System.out.println(total);

		return answer;
	}
}

public class test3 {
	public static void main(String[] args) {
		Solution st = new Solution();
		int[] target = { 2,3,4,3,2 };
		int[][] positions = { { 0, 0 }, { 0, 1 }, { 1, 1 }, { -3, 5 }, { 7, 5 }, { 10, 0 }, { -15, 22 }, { -6, -5 },
				{ 3, 3 }, { 5, -5 } };
		st.solution(target, positions);
	}
}

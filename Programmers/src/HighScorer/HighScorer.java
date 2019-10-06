package HighScorer;

/*
 * 
1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...
 * 
 * */

class Solution {
	public int checkAnswer(int[] myAnswer, int[] answers) {

		int count = 0;
		for (int i = 0; i < answers.length; i++) {
			if (answers[i] == myAnswer[i]) {
				count++;
			}
		}
		return count;
	}

	public int[] solution(int[] answers) {
		int[] One = new int[answers.length];
		int[] Two = new int[answers.length];
		int[] Three = new int[answers.length];
		int[] answer = {};
		for (int i = 0; i < One.length; i++) {
			One[i] = (i % 5) + 1;
		}

		for (int i = 0; i < Two.length; i++) {
			if (i % 8 == 7) {
				Two[i] = 5;
			} else if (i % 8 == 5) {
				Two[i] = 4;
			} else if (i % 8 == 3) {
				Two[i] = 3;
			} else if (i % 8 == 1) {
				Two[i] = 1;
			} else {
				Two[i] = 2;
			}
		}

		for (int i = 0; i < Two.length; i++) {
			if (i % 10 == 9 || i % 10 == 8) {
				Two[i] = 5;
			} else if (i % 10 == 7 || i % 10 == 6) {
				Two[i] = 4;
			} else if (i % 10 == 5 || i % 10 == 4) {
				Two[i] = 3;
			} else if (i % 10 == 3 || i % 10 == 2) {
				Two[i] = 2;
			} else if (i % 10 == 1 || i % 10 == 0) {
				Two[i] = 1;
			}
		}

		int countOne = checkAnswer(One, answers);
		int countTwo = checkAnswer(Two, answers);
		int countThree = checkAnswer(Three, answers);
		
		
		return answer;
	}
}

public class HighScorer {
	public static void main(String[] args) {
		int[] answers = { 1, 2, 3, 4, 5 };
		Solution st = new Solution();
		System.out.println(st.solution(answers));
	}
}

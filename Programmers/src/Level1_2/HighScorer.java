package Level1_2;

/*
 * 
1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...
 * 
 * */

class Solution {
	public int checkAnswer(int[] student, int[] answers) {
		int count = 0;
		for (int i = 0; i < answers.length; i++) {
			if (student[i] == answers[i]) {
				count++;
			}
		}
		return count;
	}

	public int[] solution(int[] answers) {
		int[] one = new int[answers.length];
		int[] two = new int[answers.length];
		int[] three = new int[answers.length];

		// 1번 학생 답
		int one_answer = 1;
		for (int i = 0; i < one.length; i++) {
			one[i] = one_answer;
			one_answer++;
			if (one_answer > 5) {
				one_answer = 1;
			}
		}

		// 2번 학생 답
		for (int i = 0; i < two.length; i++) {
			if (i % 8 == 7) {
				two[i] = 5;
			} else if (i % 8 == 5) {
				two[i] = 4;
			} else if (i % 8 == 3) {
				two[i] = 3;
			} else if (i % 8 == 1) {
				two[i] = 1;
			} else if (i % 2 == 0) {
				two[i] = 2;
			}
		}

		// 3번 학생 답
		for (int i = 0; i < three.length; i++) {
			if (i % 10 == 0 || i % 10 == 1) {
				three[i] = 3;
			} else if (i % 10 == 2 || i % 10 == 3) {
				three[i] = 1;
			} else if (i % 10 == 4 || i % 10 == 5) {
				three[i] = 2;
			} else if (i % 10 == 6 || i % 10 == 7) {
				three[i] = 4;
			} else if (i % 10 == 8 || i % 10 == 9) {
				three[i] = 5;
			}
		}

		int[] student = new int[3];
		student[0] = checkAnswer(one, answers);
		student[1] = checkAnswer(two, answers);
		student[2] = checkAnswer(three, answers);
		int max = student[0];
		int count = 0;
		for (int i = 0; i < student.length; i++) {
			if (max <= student[i]) {
				max = student[i];
			}
		}
		System.out.println(max);
		for (int i = 0; i < student.length; i++) {
			if (max == student[i]) {
				count++;
			}
		}
		System.out.println(count);
		int[] answer = new int[count];
		count = 0;
		System.out.println(answer.length);
		System.out.println(student.length);
		for (int i = 0; i < student.length; i++) {
			if (max == student[i]) {
				answer[count] = i + 1;
				count++;
			}
		}
		for (int num : answer) {
			System.out.println(num);
		}

		return answer;
	}
}

public class HighScorer {
	public static void main(String[] args) {
		int[] answers = { 1, 1, 1, 1, 1 };
		Solution st = new Solution();
		System.out.println(st.solution(answers));
	}
}

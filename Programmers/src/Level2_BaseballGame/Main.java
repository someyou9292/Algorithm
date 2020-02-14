package Level2_BaseballGame;

import java.util.Stack;

/*
 ���α׷��ӽ� Lv2. ���� �߱�
 ���ڴ� ������, ��ġ�� Ʋ���� B
 ���ڿ� ��ġ�� ��� ���� �� S
 ���ڿ� ��ġ�� ��� Ʋ���� O
 �־��� 2���� �迭  : �Է°� , ��Ʈ����ũ, �� 
 �־��� 2���� �迭�� �̾� �� �� �ִ� ���� ������ ����.
 [123, 1, 1], [356, 1, 0], [327, 2, 0], [489, 0, 1]   -> 324, 328 �� ������ ����.
 * */

class Solution {
	public int solution(int[][] baseball) {
		int answer = 0;
		Stack<String> numbers = new Stack<String>();

		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				for (int k = 1; k < 10; k++) {
					if (i != j && j != k && i != k) {
						numbers.add("" + (i * 100 + j * 10 + k));
					}
				}
			}
		}

		Stack<String> result = new Stack<String>();
		boolean flag = true;

		while (!numbers.isEmpty()) {
			String pop = numbers.pop();
			for (int i = 0; i < baseball.length && flag == true; i++) {
				int S = strike(pop, "" + (baseball[i][0]));
				int B = ball(pop, "" + (baseball[i][0])) - S;

				if (S != baseball[i][1] || B != baseball[i][2]) {
					flag = false;
				}
			}
			if (flag == true) {
				result.add(pop);
			}
			flag = true;
		}

		answer = result.size();

		System.out.println(answer);
		return answer;
	}

	public int strike(String pop, String number) {
		int count = 0;

		for (int i = 0; i < number.length(); i++) {
			if(pop.charAt(i) == number.charAt(i)) {
				count++;
			}
		}

		return count;
	}

	public int ball(String pop, String number) {
		int count = 0;

		for (int i = 0; i < number.length(); i++) {
			if(number.contains("" + pop.charAt(i))) {
				count++;
			}
		}
		return count;
	}
}

public class Main {
	public static void main(String[] args) {
		Solution st = new Solution();
		int[][] baseball = { { 123, 1, 1 }, { 356, 1, 0 }, { 327, 2, 0 }, { 489, 0, 1 } };

		st.solution(baseball);
	}
}

//class Solution {
//	public int solution(int[][] baseball) {
//		int answer = 0;
//		Stack<String> numbers = new Stack<String>();
//		
//		// ��� ����� ���� ����. 123 ~ 987
//		for (int i = 1; i < 10; i++) {
//			for (int j = 1; j < 10; j++) {
//				for (int k = 1; k < 10; k++) {
//					if (i != j && j != k && i != k) {
//						numbers.add(String.valueOf(i * 100 + j * 10 + k));
//					}
//				}
//			}
//		}
//
//		
//		// ����� ������ result ����
//		Stack<String> result = new Stack<String>();
//		// �ݺ� ��� �� flag
//		boolean flag = true;
//		
//		// numbers�� �� ������ �ݺ�
//		while(!numbers.isEmpty()) {
//			// pop �� ���� ������ num
//			String num = numbers.pop();
//			
//			// pop�� ���� �־��� 2���� �迭�� ��� ���ǿ� �ش� �Ǵ��� �˻�. �ϳ��� false �� �н�, ��� �ش�Ǹ� result ���ÿ� ����
//			for(int i=0; i<baseball.length && flag == true; i++) {
//				// ��Ʈ����ũ �� �˻�
//				int S = strike(num, String.valueOf(baseball[i][0]));
//				// ���� �� �˻�. �̶� ��Ʈ����ũ�� ���� ���� why? 123�� ���� ��� 142�� 1��Ʈ����ũ 1���� ǥ��/  1��Ʈ����ũ 2���δ� ǥ���� ���ϱ� ����.
//				int B = ball(num, String.valueOf(baseball[i][0])) - S;
//				
//				// ���� ��Ʈ����ũ�� ���� ���� �־��� 2���� �迭�� ��Ʈ����ũ, ���� ���� ���� �ʴٸ� flag�� false�� �ٲٰ� �ݺ����� ������
//				if(S != baseball[i][1] || B != baseball[i][2]) {
//					flag = false;
//				}
//			}
//			// true��� (��� ���ǿ� �´ٸ�) result�� ����
//			if(flag == true) {
//				result.add(num);
//			}
//			// ���ο� pop ������ �˻縦 ���� flag�� true�� ����.
//			flag = true;
//		}
//		
//		System.out.println(result.size());
//		return result.size();
//	}
//	public int strike(String num, String target) {
//		int count = 0;
//		for(int i=0; i<target.length();i++) {
//			count = num.charAt(i) == target.charAt(i) ? count + 1 : count;
//		}
//		return count;
//	}
//	
//	public int ball(String num, String target) {
//		int count = 0;
//		for(int i=0; i<target.length();i++) {
//			count = num.contains(String.valueOf(target.charAt(i))) ? count + 1 : count;
//		}
//		return count;
//	}
//}
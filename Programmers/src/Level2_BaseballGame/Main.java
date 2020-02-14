package Level2_BaseballGame;

import java.util.Stack;

/*
 프로그래머스 Lv2. 숫자 야구
 숫자는 맞지만, 위치가 틀리면 B
 숫자와 위치가 모두 맞을 때 S
 숫자와 위치가 모두 틀리면 O
 주어진 2차원 배열  : 입력값 , 스트라이크, 볼 
 주어진 2차원 배열로 뽑아 낼 수 있는 답의 갯수를 리턴.
 [123, 1, 1], [356, 1, 0], [327, 2, 0], [489, 0, 1]   -> 324, 328 두 가지가 나옴.
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
//		// 모든 경우의 수를 저장. 123 ~ 987
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
//		// 결과를 저장할 result 스택
//		Stack<String> result = new Stack<String>();
//		// 반복 제어를 할 flag
//		boolean flag = true;
//		
//		// numbers가 빌 때까지 반복
//		while(!numbers.isEmpty()) {
//			// pop 한 수를 저장할 num
//			String num = numbers.pop();
//			
//			// pop한 수를 주어진 2차원 배열의 모든 조건에 해당 되는지 검사. 하나라도 false 면 패스, 모두 해당되면 result 스택에 저장
//			for(int i=0; i<baseball.length && flag == true; i++) {
//				// 스트라이크 수 검사
//				int S = strike(num, String.valueOf(baseball[i][0]));
//				// 볼의 수 검사. 이때 스트라이크의 수를 빼줌 why? 123이 답인 경우 142는 1스트라이크 1볼로 표현/  1스트라이크 2볼로는 표현을 안하기 때문.
//				int B = ball(num, String.valueOf(baseball[i][0])) - S;
//				
//				// 구한 스트라이크와 볼의 수가 주어진 2차원 배열의 스트라이크, 볼의 수와 같지 않다면 flag를 false로 바꾸고 반복문을 제어함
//				if(S != baseball[i][1] || B != baseball[i][2]) {
//					flag = false;
//				}
//			}
//			// true라면 (모든 조건에 맞다면) result에 저장
//			if(flag == true) {
//				result.add(num);
//			}
//			// 새로운 pop 변수의 검사를 위해 flag를 true로 변경.
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
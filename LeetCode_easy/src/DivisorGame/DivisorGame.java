package DivisorGame;

import java.util.ArrayList;
import java.util.List;

/*
 Alice 와 Bob 이 차례대로 게임을 시작합니다.
 다음과 같은 규칙을 따르며 진행합니다.
 1. 최초 N이 주어진다.
 2. 0 < x < N && N % x == 0 인 x를 선택합니다.
 3. N -> N-x 로 바꿉니다.
 4. 위 의 과정을 반복합니다.
 
 * */

class Solution {
	public boolean divisorGame(int N) {
		
		// Bob의 턴에서 홀수가 나올 수 있으면 무조건 Alice가 이기게된다.
		// 반대로 Alice의 턴에 홀수가 나오면 지게 된다.
		
		return N % 2 == 0;
	}
}

public class DivisorGame {
	public static void main(String[] args) {
		Solution st = new Solution();
		int N = 12;
		System.out.println(st.divisorGame(N));
	}
}

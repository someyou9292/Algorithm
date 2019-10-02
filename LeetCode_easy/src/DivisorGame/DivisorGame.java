package DivisorGame;

import java.util.ArrayList;
import java.util.List;

/*
 Alice �� Bob �� ���ʴ�� ������ �����մϴ�.
 ������ ���� ��Ģ�� ������ �����մϴ�.
 1. ���� N�� �־�����.
 2. 0 < x < N && N % x == 0 �� x�� �����մϴ�.
 3. N -> N-x �� �ٲߴϴ�.
 4. �� �� ������ �ݺ��մϴ�.
 
 * */

class Solution {
	public boolean divisorGame(int N) {
		
		// Bob�� �Ͽ��� Ȧ���� ���� �� ������ ������ Alice�� �̱�Եȴ�.
		// �ݴ�� Alice�� �Ͽ� Ȧ���� ������ ���� �ȴ�.
		
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

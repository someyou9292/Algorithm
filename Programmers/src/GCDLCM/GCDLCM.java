package GCDLCM;

class Solution {
	public int[] solution(int n, int m) {
		int[] answer = new int[2];
		int r = 1;

		int temp1 = n;
		int temp2 = m;
		if (n < m) {
			n = temp2;
			m = temp1;
		}
		while (r > 0) {
			r = n % m;
			n = m;
			m = r;
		}

		int LCM = temp1 * temp2 / n;
		
		answer[0] = n;
		answer[1] = LCM;
		
		System.out.println(answer[0]);
		System.out.println(answer[1]);
		
		return answer;
	}
}

public class GCDLCM {
	public static void main(String[] args) {
		Solution st = new Solution();
		int n = 3;
		int m = 12;
		
		st.solution(n, m);
	}
}

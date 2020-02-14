package Level2_Jump;

// ���� : n ��ŭ �̵� �� ��ŭ ���͸� n �Ҹ�
// �����̵� : �Ҹ� x / �� �Ÿ��� 2�踸ŭ �̵�
// ��Ģ : 2������ �ٲپ����� 1�� ���ڸ� �����.
// 1 - 1
// 2 - 1
// 3 - 2
// 4 - 1
// 5 - 2 ... 15 - 4
class Solution {
	public int solution(int n) {
		int ans = 0;
		
		while(n != 0) {
			int r = n % 2;
			n /= 2;
			if(r == 1) {
				ans++;
			}
		}
				
		return ans;
	}
}

public class Jump {
	public static void main(String[] args) {
		Solution st = new Solution();
		int n = 3;
		st.solution(n);
	}
}

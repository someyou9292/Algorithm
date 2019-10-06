package checkSquar;

import java.util.HashMap;

/*
������ ���� ���� n�� ����, n�� � ���� ���� x�� �������� �ƴ��� �Ǵ��Ϸ� �մϴ�.
n�� ���� ���� x�� �����̶�� x+1�� ������ �����ϰ�, n�� ���� ���� x�� ������ �ƴ϶�� -1�� �����ϴ� �Լ��� �ϼ��ϼ���.
 * */
class Solution {
	public long solution(long n) {

		if (n > Long.MAX_VALUE) {
			return -1;
		}

		for (int i = 1; i <= n; i++) {
			if (Math.pow(i, 2) == n) {
				return (long) Math.pow(i + 1, 2);
			}
		}

		return -1;
	}
}

public class checkSquare {
	public static void main(String[] args) {
		Solution st = new Solution();
		long n = 1000000000;
		System.out.println(st.solution(n));
	}
}

package Level1_30;
/*
 ���� ���� x�� �ϻ��� ���̷��� x�� �ڸ����� ������ x�� ���������� �մϴ�. 
 ���� ��� 18�� �ڸ��� ���� 1+8=9�̰�, 18�� 9�� ������ �������Ƿ� 18�� �ϻ��� ���Դϴ�. 
 �ڿ��� x�� �Է¹޾� x�� �ϻ��� ������ �ƴ��� �˻��ϴ� �Լ�, solution�� �ϼ����ּ���.
 * */

class Solution {
	public boolean solution(int x) {
		boolean answer = true;

		int num = x;
		int sum = 0;
		while (num != 0) {
			sum = sum + (num % 10);
			num = num / 10;
		}
		
		if(x % sum == 0) {
			answer = true;
		}else {
			answer = false;
		}
		
		return answer;
	}
}

public class Level1_30 {
	public static void main(String[] args) {
		Solution st = new Solution();
		int x = 11;
		st.solution(x);
	}
}

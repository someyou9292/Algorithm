package Level1_18;

/*
 
� ������ �� ���ĺ��� ������ �Ÿ���ŭ �о �ٸ� ���ĺ����� �ٲٴ� ��ȣȭ ����� ���� ��ȣ��� �մϴ�. 
���� ��� AB�� 1��ŭ �и� BC�� �ǰ�, 3��ŭ �и� DE�� �˴ϴ�. 
z�� 1��ŭ �и� a�� �˴ϴ�. 
���ڿ� s�� �Ÿ� n�� �Է¹޾� s�� n��ŭ �� ��ȣ���� ����� �Լ�, solution�� �ϼ��� ������.
 
���� ����
������ �ƹ��� �о �����Դϴ�.
s�� ���ĺ� �ҹ���, �빮��, �������θ� �̷���� �ֽ��ϴ�.
s�� ���̴� 8000�����Դϴ�.
n�� 1 �̻�, 25������ �ڿ����Դϴ�.
 * */
class Solution {
	public String solution(String s, int n) {
		String answer = "";

		char[] arr = s.toCharArray();

		for (int i = 0; i < arr.length; i++) {
			// ������ ��
			if(arr[i] == ' ') {
				answer += arr[i];
				continue;
			}
			// �ҹ����� ���
			if (arr[i] >= 97 && arr[i] <= 122) {
				if(arr[i] + n > 122) {
					arr[i] = (char) (arr[i] + n - 26);
				}else {
					arr[i] += n;
				}
			}
			// �빮���� ���
			else if(arr[i] >= 65 && arr[i] <= 90) {
				if(arr[i] + n > 90) {
					arr[i] = (char) (arr[i] + n - 26);
				}else {
					arr[i] += n;
				}
			}

			answer += arr[i];
		}


		return answer;
	}
}

public class Level1_18 {
	public static void main(String[] args) {
		Solution st = new Solution();
		String s = "ZzZzabcd";
		int n = 10;
		st.solution(s, n);
	}
}

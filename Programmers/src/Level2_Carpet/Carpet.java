package Level2_Carpet;

class Solution {
	public int[] solution(int brown, int red) {
		int[] answer = new int[2];
		int b = (brown - 4) / 2; // �� ������ 4���� �簢���� ������ ������ �� ����

		int h = 1; // red �� ����
		int w = b - 1; // red �� �غ�

		for (int i = 0; i < b; i++) {
			if (h * w == red) {		// red�� ���̿� ���� ���
				answer[0] = w + 2; // ��ü �簢���� �غ�
				answer[1] = h + 2; // ��ü �簢���� ����
				break;
			} else {
				h++;
				w--;
			}
		}

		System.out.println(answer[0]);
		System.out.println(answer[1]);

		return answer;
	}
}

public class Carpet {
	public static void main(String[] args) {
		Solution st = new Solution();

		int brown = 24;
		int red = 24;

		st.solution(brown, red);
	}
}

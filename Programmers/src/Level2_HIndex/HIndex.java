package Level2_HIndex;

import java.util.Arrays;

class Solution {
	public int solution(int[] citations) {
		int H_index = 0;
		Arrays.sort(citations);
		int loop = 0;
		int max = citations.length;
		
		// loop�� 0���� 1�� �����ϸ鼭 H_index�� ����.
		while (loop <= max) {		// H_index �� �ִ밪�� ���� ��ǥ�� ���� Max�̹Ƿ�.
			int count = 0;
			for (int i = 0; i < citations.length; i++) {
				if (loop <= citations[i]) {		
					count++;
				}
			}
			if(H_index <= count && loop <= count) {		// �� ū H_index�� ������ ������.
				H_index = loop;
			}
			loop++;
		}
		
		System.out.println(H_index);
		
		return H_index;
	}
}

public class HIndex {
	public static void main(String[] args) {
		Solution st = new Solution();
		int[] citations = { 3, 0, 6, 1, 5 };

		st.solution(citations);
	}
}

package Level1_Ending;

import java.util.HashSet;

class Solution {
	public int[] solution(int n, String[] words) {
		int[] answer = new int[2];
		HashSet<String> set = new HashSet<String>();

		set.add(words[0]); // ù �ܾ� ����
		char end = words[0].charAt(words[0].length() - 1); // ù �ܾ��� �� ���� ����
		int count = 0; // �迭 ������ 0�����̹Ƿ�

		for (int i = 1; i < words.length; i++) {
			count++;
			char start = words[i].charAt(0); // �ܾ��� ���� ���� ����
			
			// ���� �ܾ��� �� ���ڿ� ���� �ܾ��� ���� ���ڰ� �ٸ� ���   OR   �ߺ� �ܾ�  -> ����
			if (end != start || set.contains(words[i])) {
				answer[0] = (count % n) + 1;
				answer[1] = (count / n) + 1;
				break;

			}

			set.add(words[i]);
			end = words[i].charAt(words[i].length() - 1);
		}

		System.out.println(answer[0] + ", " + answer[1]);

		return answer;
	}
}

public class Main {
	public static void main(String[] args) {
		int n = 3;
		String[] words = { "tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank" };

		Solution st = new Solution();

		st.solution(n, words);
	}
}

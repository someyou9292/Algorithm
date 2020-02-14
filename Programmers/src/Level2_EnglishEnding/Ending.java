package Level2_EnglishEnding;

import java.util.ArrayList;
import java.util.List;

class Solution {
	public int[] solution(int n, String[] words) {
		int[] answer = new int[2];
		List<String> isRedundant = new ArrayList<String>();

		isRedundant.add(words[0]);

		char pre_end = words[0].charAt(words[0].length() - 1);
		for (int i = 1; i < words.length; i++) {
			char start = words[i].charAt(0);
			if (pre_end == start && !isRedundant.contains(words[i])) {
				// pre_end�� �ش� ����� ������ ���ڷ� ����
				pre_end = words[i].charAt(words[i].length() - 1);
				isRedundant.add(words[i]);
				continue;
			} else {
				answer[0] = (i % n) + 1; // �� ��° ����� ����������.
				answer[1] = (i / n) + 1; // �� ��° ���忡�� ����������.

				System.out.println(answer[0]);
				System.out.println(answer[1]);
				return answer;
			}

		}

		answer[0] = 0;
		answer[1] = 0;
		System.out.println(answer[0]);
		System.out.println(answer[1]);

		return answer;
	}
}

public class Ending {
	public static void main(String[] args) {
		Solution st = new Solution();

		int n = 2;
//		String[] words = { "tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank" };
//		String[] words = { "hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive "};
		String[] words = { "hello", "one", "even", "never", "now", "world", "draw" };

		st.solution(n, words);
	}
}

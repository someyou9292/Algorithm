package Level1_Ending;

import java.util.HashSet;

class Solution {
	public int[] solution(int n, String[] words) {
		int[] answer = new int[2];
		HashSet<String> set = new HashSet<String>();

		set.add(words[0]); // 첫 단어 저장
		char end = words[0].charAt(words[0].length() - 1); // 첫 단어의 끝 글자 저장
		int count = 0; // 배열 시작은 0부터이므로

		for (int i = 1; i < words.length; i++) {
			count++;
			char start = words[i].charAt(0); // 단어의 시작 글자 저장
			
			// 이전 단어의 끝 글자와 현재 단어의 시작 글자가 다른 경우   OR   중복 단어  -> 종료
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

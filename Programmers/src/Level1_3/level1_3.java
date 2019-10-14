package Level1_3;

import java.util.HashMap;

class Solution {
	public int solution(int n, int[] lost, int[] reserve) {
		int answer = n - lost.length;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < reserve.length; i++) {
			map.put(reserve[i], reserve[i]);
		}

		for (int i = 0; i < lost.length; i++) {
			if (map.containsKey(lost[i])) {
				answer++;
				map.remove(lost[i]);
				lost[i] = -1;
			}
		}

		for (int i = 0; i < lost.length; i++) {
			if (map.containsKey(lost[i] - 1)) {
				answer++;
				map.remove(lost[i] - 1);
			} else if (map.containsKey(lost[i] + 1)) {
				answer++;
				map.remove(lost[i] + 1);
			}
		}

		System.out.println(answer);

		return answer;
	}
}

public class level1_3 {
	public static void main(String[] args) {
		int n = 3;
		int[] lost = { 1, 2 };
		int[] reserve = { 2, 3 };

		Solution st = new Solution();

		st.solution(n, lost, reserve);
	}
}

//	테스트에서 하나가 걸림.. 모든 경우 다 해봤는데 뭐지...?
//class Solution {
//	public int solution(int n, int[] lost, int[] reserve) {
//		int answer = n - lost.length;
//		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
//
//		for (int i = 0; i < reserve.length; i++) {
//			map.put(reserve[i], reserve[i]);
//		}
//
//		for (int i = 0; i < lost.length; i++) {
//			if (map.containsKey(lost[i])) {
//				answer++;
//				map.remove(lost[i]);
//			} else if (map.containsKey(lost[i] - 1)) {
//				answer++;
//				map.remove(lost[i] - 1);
//			} else if (map.containsKey(lost[i] + 1)) {
//				answer++;
//				map.remove(lost[i] + 1);
//			}
//		}
//
//		System.out.println(answer);
//
//		return answer;
//	}
//}
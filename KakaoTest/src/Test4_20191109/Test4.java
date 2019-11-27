package Test4_20191109;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
 * 효율성에서 시간 초과...
 * */
class Solution {
	public long[] solution(long k, long[] room_number) {
		long[] answer = new long[room_number.length];
		List<Long> list = new ArrayList<Long>();
		HashMap<Long, Long> map = new HashMap<Long, Long>();

		for (int i = 0; i < room_number.length; i++) {
			if (!map.containsKey(room_number[i])) {
				map.put(room_number[i], room_number[i]);
				answer[i] = room_number[i];
			} else {
				for(long j = room_number[i] + 1; j < room_number[i] + 210; j++) {
					if (!map.containsKey(j)) {
						map.put(j, j);
						answer[i] = j;
						break;
					}
				}
			}
		}

		for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}

		return answer;
	}
}

public class Test4 {
	public static void main(String[] args) {
		Solution st = new Solution();
		long k = 10;
		long[] room_number = { 1, 3, 4, 1, 3, 1 };

		st.solution(k, room_number);
	}
}

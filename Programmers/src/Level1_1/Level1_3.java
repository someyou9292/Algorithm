package Level1_1;

import java.util.HashMap;

class Solution {
	public String solution(String[] participant, String[] completion) {
		String answer = "";
		HashMap<String, Integer> map = new HashMap<>();

		for (String P : participant) {
			if (map.get(P) == null) {
				map.put(P, 1);
			} else {
				int count = map.get(P) + 1;
				map.put(P, count);
			}
		}

		for (String C : completion) {
			int count = map.get(C) - 1;
			map.put(C, count);
		}

		for (String key : map.keySet()) {
			if (map.get(key) == 1) {
				answer = key;
			}
		}

		System.out.println(answer);
		return answer;
	}
}

public class Level1_3 {
	public static void main(String[] args) {
		Solution st = new Solution();
//		String[] participant = { "marina", "josipa", "nikola", "vinko", "filipa" };
//		String[] completion = { "marina", "josipa", "nikola", "filipa" };
		String[] participant = { "mislav", "stanko", "mislav", "ana" };
		String[] completion = { "mislav", "stanko", "ana" };

		st.solution(participant, completion);
	}
}

//	효율성에서 자꾸 실패함... 
//class Solution {
//	public Object getKey(HashMap<Integer, String> map, Object value) {
//		for(Object o : map.keySet()) {
//			if(map.get(o).equals(value)) {
//				return o;
//			}
//		}
//		return null;
//	}
//	public String solution(String[] participant, String[] completion) {
//		String answer = "";
//
//		HashMap<Integer, String> map = new HashMap();
//
//		for (int i = 0; i < participant.length; i++) {
//			map.put(i, participant[i]);
//		}
//		
//		int size = map.size();
//		
//		System.out.println("======================================");
//		for(int i=0; i<map.size();i++) {
//			System.out.println(map.get(i));
//		}
//		System.out.println("======================================");		
//		
//		for (int i = 0; i < completion.length; i++) {
//			int key = (int)getKey(map,completion[i]);
//			map.remove(key);
//		}
//		
//		for(int i=0; i<size;i++) {
//			if(map.get(i) != null) {
//				answer = map.get(i);
//			}
//		}
//		
//		System.out.println(answer);
//		return answer;
//	}
//}

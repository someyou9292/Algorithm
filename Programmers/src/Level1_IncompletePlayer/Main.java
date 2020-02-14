package Level1_IncompletePlayer;

import java.util.HashMap;

/*
프로그래머스 완주하지 못한 선수
조건 
 1. 마라톤 경기에 참여한 선수의 수는 1명 이상 100000명 이하
 2. completion의 길이는 participant의 길이보다 1 작다.
 3. 참가자의 이름은 1개 이상 20개 이하의 알파벳 소문자로 이루어짐
 4. 참가자 중에는 동명이인이 있을 수 있다.
 * */

class Solution {
	public String solution(String[] participant, String[] completion) {
		String answer = "";
		HashMap<String, Integer> map = new HashMap<String, Integer>();

		for(int i=0; i<participant.length;i++) {
									// 찾는 키가 존재한다면 키의 값을 반환하고, 없다면 기본값을 반환한다.
			map.put(participant[i], map.getOrDefault(participant[i], 0) + 1);
		}
		
		for(int i=0; i<completion.length;i++) {
			map.put(completion[i], map.get(completion[i]) - 1);
		}
		

		for(String key : map.keySet()) {
			int value = map.get(key);
//			System.out.println(key + "  >> " + value);
			if(value !=0) {
				System.out.println(key);
				return key;
			}
		}



		return answer;
	}
}

public class Main {
	public static void main(String[] args) {
		Solution st = new Solution();
		String[] participant = { "eden", "kiki", "eden", "edan", "make", "edan" };
		String[] completion = { "eden", "kiki", "edan", "edan", "make" };

		st.solution(participant, completion);
	}
}

package Level1_IncompletePlayer;

import java.util.HashMap;

/*
���α׷��ӽ� �������� ���� ����
���� 
 1. ������ ��⿡ ������ ������ ���� 1�� �̻� 100000�� ����
 2. completion�� ���̴� participant�� ���̺��� 1 �۴�.
 3. �������� �̸��� 1�� �̻� 20�� ������ ���ĺ� �ҹ��ڷ� �̷����
 4. ������ �߿��� ���������� ���� �� �ִ�.
 * */

class Solution {
	public String solution(String[] participant, String[] completion) {
		String answer = "";
		HashMap<String, Integer> map = new HashMap<String, Integer>();

		for(int i=0; i<participant.length;i++) {
									// ã�� Ű�� �����Ѵٸ� Ű�� ���� ��ȯ�ϰ�, ���ٸ� �⺻���� ��ȯ�Ѵ�.
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

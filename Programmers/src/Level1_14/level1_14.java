package Level1_14;

class Solution {
	public String solution(String[] seoul) {
		
		
		int location = 0;

		for (int i = 0; i < seoul.length; i++) {
			if (seoul[i].equals("Kim")) {
				location = i;
			}
		}
		System.out.println("�輭���� " + location + "�� �ִ�");
		
		return "�輭���� " + location + "�� �ִ�";
	}
}

public class level1_14 {
	public static void main(String[] args) {
		String[] seoul = {"Jane", "Kim"};
		Solution st = new Solution();
		st.solution(seoul);
	}
}

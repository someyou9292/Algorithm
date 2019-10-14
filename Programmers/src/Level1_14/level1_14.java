package Level1_14;

class Solution {
	public String solution(String[] seoul) {
		
		
		int location = 0;

		for (int i = 0; i < seoul.length; i++) {
			if (seoul[i].equals("Kim")) {
				location = i;
			}
		}
		System.out.println("김서방은 " + location + "에 있다");
		
		return "김서방은 " + location + "에 있다";
	}
}

public class level1_14 {
	public static void main(String[] args) {
		String[] seoul = {"Jane", "Kim"};
		Solution st = new Solution();
		st.solution(seoul);
	}
}

package Level1_5;

class Solution {
	public String solution(int a, int b) {
		String answer = "";
		String[] dayOfWeek = { "FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU" };

		int[] days = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		int dayOfSum = 0;

		for (int i = 0; i < a - 1; i++) {
			dayOfSum = dayOfSum + days[i];
		}

		dayOfSum += b -1;

		answer = dayOfWeek[dayOfSum % 7];
		
		System.out.println(answer);
		return answer;
	}
}

public class Level1_5 {
	public static void main(String[] args) {
		Solution st = new Solution();
		int a = 5;
		int b = 24;
		st.solution(a, b);
	}
}

package Level1_20;

class Solution {
	public String solution(String s) {
		String answer = "";
		char[] arr = new char[s.length()];

		for (int i = 0; i < s.length(); i++) {
			arr[i] = s.toUpperCase().charAt(i);
		}
		
		int count =0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == ' ') {
				count = 0;
				answer += arr[i];
				continue;
			}
			if(count % 2 == 1) {
				arr[i] += 32;
			}
			answer += arr[i];
			count++;
		}	
		
//		System.out.println(answer);

		return answer;
	}
}

public class Level1_20 {
	public static void main(String[] args) {
		Solution st = new Solution();
		String s = "Hello World My name is Lee";
		st.solution(s);
	}
}

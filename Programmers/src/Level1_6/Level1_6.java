package Level1_6;

class Solution {
	public String solution(String s) {
		String answer = "";
		int mid = s.length() / 2;
		
		if (s.length() % 2 == 0) {
			answer = s.substring(mid-1, mid+1);
			return answer;
		}else {
			answer = s.substring(mid,mid+1);
		}

		
		return answer;
	}
}

public class Level1_6 {
	public static void main(String[] args) {
		String s = "abde";
		Solution st = new Solution();
		st.solution(s);
	}
}

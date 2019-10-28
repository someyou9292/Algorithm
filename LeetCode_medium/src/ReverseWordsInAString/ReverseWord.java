package ReverseWordsInAString;

class Solution {
	public String reverseWords(String s) {
		StringBuilder answer = new StringBuilder();
		String[] str = s.split(" ");

		for (int i = str.length - 1; i >= 0; i--) {
			if (str[i].equals("")) {
				continue;
			}
			answer.append(str[i]);
			answer.append(" ");
		}
		
		// .trim() -> 전후 공백을 없애주는 메서드
		return answer.toString().trim();
	}
}

public class ReverseWord {
	public static void main(String[] args) {
		Solution st = new Solution();
		String s = "    ";
		st.reverseWords(s);
	}
}

//	효율 21.71% ㅠㅠ
//class Solution {
//	public String reverseWords(String s) {
//        String answer = "";
//		String[] str = s.split(" ");
//
//		for (int i = str.length - 1; i >= 0; i--) {
//			if(str[i].length() == 0) {
//				continue;
//			}
//			answer += str[i] + " ";
//		}
//	
//		return answer.trim();
//	}
//}

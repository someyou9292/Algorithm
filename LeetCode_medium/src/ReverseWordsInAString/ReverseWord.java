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

//	È¿À² 21.71% ¤Ð¤Ð
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

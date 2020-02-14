package easy_520_DetectCapital;

// 대문자 65 ~ 90  소문자 97 ~ 122
class Solution {
	public boolean detectCapitalUse(String word) {

		boolean isCapital = false;
		char start = word.charAt(0);
		int count = 0;

		if (start >= 'A' && start <= 'Z') { // 첫 글자가 대문자인 경우
			for (int i = 1; i < word.length(); i++) {
				char c = word.charAt(i);

				if (c >= 'A' && c <= 'Z') { 
					isCapital = true;
					count++;
				} else {
					isCapital = false;
					count--;
				}
				
				if(count >= 0) {		// 첫 글자 이외에 대문자가 있다면
					if(isCapital == false || count <= 0) {	// 중간에 하나라도 소문자가 있으면 false.
						System.out.println("false1");
						return false;
					}
				}else {				// 첫 글자 이외에 대문자가 없다면
					if(isCapital == true || count > 0) {	// 중간에 하나라도 대문자가 있으면 false.
						System.out.println("false2");
						return false;
					}
				}
				
			}
		} else if (start >= 'a' && start <= 'z') { // 첫 글자가 소문자인 경우
			for (int i = 1; i < word.length(); i++) {
				char c = word.charAt(i);
				if (c >= 'A' && c <= 'Z') { // 대문자가 있다면 false
					isCapital = true;
					System.out.println("false3");
					return false;
				}
			}

		} else {
			System.out.println("false4");
			return false;
		}

		System.out.println("true");
		return true;
	}
}

public class DetectCapital {
	public static void main(String[] args) {
		Solution st = new Solution();
//		String word = "USA";
//		String word = "leetcode";
//		String word = "Google";
		String word = "";
		

		st.detectCapitalUse(word);
	}
}

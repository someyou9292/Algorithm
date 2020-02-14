package easy_520_DetectCapital;

// �빮�� 65 ~ 90  �ҹ��� 97 ~ 122
class Solution {
	public boolean detectCapitalUse(String word) {

		boolean isCapital = false;
		char start = word.charAt(0);
		int count = 0;

		if (start >= 'A' && start <= 'Z') { // ù ���ڰ� �빮���� ���
			for (int i = 1; i < word.length(); i++) {
				char c = word.charAt(i);

				if (c >= 'A' && c <= 'Z') { 
					isCapital = true;
					count++;
				} else {
					isCapital = false;
					count--;
				}
				
				if(count >= 0) {		// ù ���� �̿ܿ� �빮�ڰ� �ִٸ�
					if(isCapital == false || count <= 0) {	// �߰��� �ϳ��� �ҹ��ڰ� ������ false.
						System.out.println("false1");
						return false;
					}
				}else {				// ù ���� �̿ܿ� �빮�ڰ� ���ٸ�
					if(isCapital == true || count > 0) {	// �߰��� �ϳ��� �빮�ڰ� ������ false.
						System.out.println("false2");
						return false;
					}
				}
				
			}
		} else if (start >= 'a' && start <= 'z') { // ù ���ڰ� �ҹ����� ���
			for (int i = 1; i < word.length(); i++) {
				char c = word.charAt(i);
				if (c >= 'A' && c <= 'Z') { // �빮�ڰ� �ִٸ� false
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

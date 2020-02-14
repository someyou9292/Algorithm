package easy_461_HammingDistance;

class Solution {
	public int hammingDistance(int x, int y) {
		int answer = 0;
		
		int diff = x^y;
		
		
		while(diff !=0) {	
			diff &= diff -1;
			answer++;
		}
		
		return answer;
	}
}

public class Main {
	public static void main(String[] args) {
		Solution st = new Solution();
		int x = 4;
		int y = 1;

		st.hammingDistance(x, y);
	}
}

//	È¿À² 20.7%
//class Solution {
//	public int hammingDistance(int x, int y) {
//		int answer = 0;
//		String strX = Integer.toBinaryString(x);
//		String strY = Integer.toBinaryString(y);
//		
//		if (strX.length() != strY.length()) {
//			if (strX.length() < strY.length()) {
//				while(strX.length() != strY.length()) {
//					strX = "0" + strX;
//				}
//			}else {
//				while(strY.length() != strX.length()) {
//					strY = "0" + strY;
//				}
//			}
//		}
//
//		for (int i = 0; i < strX.length(); i++) {
//			if (strX.charAt(i) != strY.charAt(i)) {
//				answer++;
//			}
//		}
//
//
//		return answer;
//	}
//}

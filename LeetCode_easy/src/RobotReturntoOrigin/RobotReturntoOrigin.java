package RobotReturntoOrigin;

/*
 �־����� ���ڿ� moves �� ���� �����̴� �κ��� �ֽ��ϴ�.
 �κ��� ������ġ�� 0,0 �Դϴ�.
 �������� ��ģ �� �������� ���ƿ��� true �� ��ȯ�ϼ���
 moves �� L R U D �� �����Դϴ�.
 (L �������� 1ĭ, R ���������� 1ĭ, U ���� ��ĭ, D �Ʒ��� ��ĭ)
 * */

// ȿ�� 94.54%    ���� �� ����!
class Solution {
	public boolean judgeCircle(String moves) {
		
		int[] arr = new int[26];
		
		for(int i=0; i<moves.length();i++) {
			char c = moves.charAt(i);
			arr[c - 'A']++;
		}
		
		if(arr['R'-'A'] - arr['L'-'A'] == 0 && arr['U'-'A'] - arr['D'-'A'] == 0 ) {
			return true;
		}

		return false;
	}
}

public class RobotReturntoOrigin {
	public static void main(String[] args) {
		Solution st = new Solution();
		String moves = "RRDD";
		System.out.println(st.judgeCircle(moves));
	}
}

//	ȿ���� 65.09%   ������ ����
//class Solution {
//	public boolean judgeCircle(String moves) {
//		int xPoint = 0;
//		int yPoint = 0;
//		
//		for (int i = 0; i < moves.length(); i++) {
//			char ch = moves.charAt(i);
//
//			switch (ch) {
//			case 'L':
//				xPoint--;
//				break;
//			case 'R':
//				xPoint++;
//				break;
//			case 'U':
//				yPoint++;
//				break;
//			case 'D':
//				yPoint--;
//				break;
//			default:
//				break;
//			}
//		}
//		if(xPoint ==0 && yPoint == 0) {
//			return true;
//		}
//		return false;
//	}
//}



//	ȿ���� 38.37%    �� �� ��
//class Solution {
//	public boolean judgeCircle(String moves) {
//
//		int xCount = 0;
//		int yCount = 0;
//
//		for (int i = 0; i < moves.length(); i++) {
//			if(moves.charAt(i) == 'L') {
//				xCount--;
//			}else if(moves.charAt(i) == 'R') {
//				xCount++;
//			}else if(moves.charAt(i) == 'U') {
//				yCount++;
//			}else {
//				yCount--;
//			}
//		}
//		
//		if(xCount ==0 && yCount ==0) {
//			return true;
//		}
//
//		return false;
//	}
//}
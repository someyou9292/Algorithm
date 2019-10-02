package RobotReturntoOrigin;

/*
 주어지는 문자열 moves 에 따라 움직이는 로봇이 있습니다.
 로봇의 시작위치는 0,0 입니다.
 움직임을 마친 후 원점으로 돌아오면 true 를 반환하세요
 moves 는 L R U D 로 움직입니다.
 (L 왼쪽으로 1칸, R 오른쪽으로 1칸, U 위로 한칸, D 아래로 한칸)
 * */

// 효율 94.54%    아주 잘 했음!
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

//	효율성 65.09%   나쁘지 않음
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



//	효율성 38.37%    구 데 기
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
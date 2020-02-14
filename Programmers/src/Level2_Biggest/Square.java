package Level2_Biggest;

// 0111
// 1111
// 1111
// 0010
// dp ·Î Ç®±â. 
class Solution {
	public int solution(int[][] board) {
		int[][] arr = new int[board.length + 1][board[0].length + 1];

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				arr[i + 1][j + 1] = board[i][j];
			}
		}

		int max = 0;
		for (int i = 1; i < arr.length; i++) {
			for (int j = 1; j < arr[i].length; j++) {
				if (arr[i][j] == 1) {
					int min = Math.min(arr[i - 1][j], arr[i][j - 1]);
					min = Math.min(min, arr[i - 1][j - 1]);
					arr[i][j] = min + 1;
					if (max < arr[i][j]) {
						max = arr[i][j];
					}
				}
			}
		}

		int answer = max * max;
		return answer;
	}
}

public class Square {
	public static void main(String[] args) {
		Solution st = new Solution();
		int[][] board = { { 0, 1, 1, 1 }, { 1, 1, 1, 1 }, { 1, 1, 1, 1 }, { 0, 0, 1, 0 } };
//		int[][] board = { { 1, 1, 1, 1 }, { 1, 0, 0, 1 }, { 1, 0, 0, 1 }, { 1, 1, 1, 1 } };

		st.solution(board);
	}
}

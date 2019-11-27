package Test1_20191109;

import java.util.Stack;

//board : 인형이 들어있는 2차원 배열  (1~100 의 값이 들어가있음)
//moves : 크레인이 움직여 인형을 뽑는 배열
class Solution {
	public int soluion(int[][] board, int[] moves) {
		int answer = 0;
		Stack<Integer> stack = new Stack<Integer>();

		int row_Index = 0;
		int col_Index = 0;
		int index = 0;
		int stack_top;
		for (int i = 0; i < moves.length; i++) {
			col_Index = moves[i] - 1;
			while (row_Index != board.length) {
				if (board[row_Index][col_Index] == 0) {
					row_Index++;
					continue;
				} else {
					stack.push(board[row_Index][col_Index]);
					board[row_Index][col_Index] = 0;
					break;
				}
			}
			row_Index = 0;
			
			if(!stack.isEmpty()) {
				if(stack.size() > 1) {
					int stack_pop = stack.pop();
					stack_top = stack.peek();
					if(stack_pop == stack_top) {
						answer+=2;
						stack.pop();
					}else {
						stack.push(stack_pop);
					}
				}
			}
		}
		
		for(int i=0; i<board.length;i++) {
			for(int j = 0; j<board.length; j++) {
				System.out.print(board[i][j]);
			}
			System.out.println();
		}
		
		for(int i=0; i<stack.size();i++) {
			System.out.println(stack.pop());
		}
		System.out.println(answer);

		return answer;
	}
}

public class Test1 {
	public static void main(String[] args) {
		Solution st = new Solution();
		int[][] board = { { 0, 0, 0, 0, 0 }, { 0, 0, 1, 0, 3 }, { 0, 2, 5, 0, 1 }, { 4, 2, 4, 4, 2 },
				{ 3, 5, 1, 3, 1 } };
		int[] moves = { 1, 5, 3, 5, 1, 2, 1, 4 };

		st.soluion(board, moves);
	}
}

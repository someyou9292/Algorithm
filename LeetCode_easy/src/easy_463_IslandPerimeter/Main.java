package easy_463_IslandPerimeter;

/*
 leetcode 463
 
 1 -> 땅  (한 변이 1인 정사각형)
 0 -> 물

 섬의 둘레를 구하시오.
 * */

class Solution {
	public int islandPerimeter(int[][] grid) {
		int count = 0;
		int answer = 0;


		return answer;
	}
}

public class Main {
	public static void main(String[] args) {
		Solution st = new Solution();
//		int[][] grid = { { 0, 1, 0, 0 }, { 1, 1, 1, 0 }, { 0, 1, 0, 0 }, { 1, 1, 0, 0 } };
		int[][] grid = { { 1, 1, 1 }, { 0, 1, 0 } };

		st.islandPerimeter(grid);
	}
}


//	효율 14.12%
//class Solution {
//	public int islandPerimeter(int[][] grid) {
//		int count = 0;
//		int answer = 0;
//		int[][] new_grid = new int[grid.length + 2][grid[0].length + 2];
//
//		for (int i = 1; i < new_grid.length; i++) {
//			for (int j = 1; j < new_grid[i].length; j++) {
//				if (i == new_grid.length - 1 || j == new_grid[i].length - 1) {
//					break;
//				}
//				new_grid[i][j] = grid[i - 1][j - 1];
//			}
//		}
//
//		for (int i = 0; i < new_grid.length - 1; i++) {
//			for (int j = 0; j < new_grid[i].length - 1; j++) {
//				if (new_grid[i][j] == 1) {
//					answer += 4;
//					if (new_grid[i - 1][j] != 0) {
//						count++;
//					}
//					if (new_grid[i][j - 1] != 0) {
//						count++;
//					}
//					if (new_grid[i + 1][j] != 0) {
//						count++;
//					}
//					if (new_grid[i][j + 1] != 0) {
//						count++;
//					}
//				}
//				new_grid[i][j] = count;
//				count = 0;
//			}
//		}
//
//		System.out.println(answer);
//		for (int i = 0; i < new_grid.length; i++) {
//			for (int j = 0; j < new_grid[i].length; j++) {
//
//				if (new_grid[i][j] == 1) {
//					answer -= 1;
//				} else if (new_grid[i][j] == 2) {
//					answer -= 2;
//				} else if (new_grid[i][j] == 3) {
//					answer -= 3;
//				} else if (new_grid[i][j] == 4) {
//					answer -= 4;
//				}
//			}
//		}
//
//		
//		for (int i = 0; i < new_grid.length; i++) {
//			for (int j = 0; j < new_grid[i].length; j++) {
//				System.out.print(new_grid[i][j]);
//			}
//			System.out.println();
//		}
//		
//		
//		System.out.println(answer);
//
//		return answer;
//	}
//}


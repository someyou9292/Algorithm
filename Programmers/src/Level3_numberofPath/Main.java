package Level3_numberofPath;

class Solution {
	public void printArr(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public int solution(int m, int n, int[][] puddles) {
		int answer = 0;
		boolean[][] isAble = new boolean[n][m];		// 물 웅덩이 표시해주기 위한 배열
		int[][] path = new int[n][m];

		// isAble 배열을 모두 true로 초기화
		for (int i = 0; i < isAble.length; i++) {
			for (int j = 0; j < isAble[i].length; j++) {
				isAble[i][j] = true;
			}
		}
		
		// 물 웅덩이가 있는 위치는 false로 초기화
		for (int i = 0; i < puddles.length; i++) {
			isAble[puddles[i][1] - 1][puddles[i][0] - 1] = false;
		}
		
		// 길 초기화
		for (int i = 0; i < path.length; i++) {
			for (int j = 0; j < path[i].length; j++) {
				if (isAble[i][j] == false) {		// 웅덩이가 있는 곳은 0
					path[i][j] = 0;
				} else {							// 아니면 1
					path[i][j] = 1;
				}

				if (i == 0 && j != 0) {				// 첫행에서 중간에 웅덩이가 있다면 이후에는 모두 웅덩이
					if (isAble[i][j - 1] == false) {
						isAble[i][j] = false;		// 해당 위치를 false로 바꾸고
						path[i][j] = 0;				// 0으로 초기화
					}
				} else if (j == 0 && i != 0) {		// 첫 열에서 중간에 웅덩이가 있다면 이후는 모두 웅덩이
					if (isAble[i - 1][j] == false) {
						isAble[i][j] = false;		// 해당 위치를 false로 바꾸고
						path[i][j] = 0;				// 0으로 초기화
					}
				}

			}
		}
		path[0][0] = 0;		// 집은 0으로 초기화
		path[path.length - 1][path[0].length - 1] = 0;		// 학교도 0으로 초기화
		
		// 최단거리 계산
		for (int i = 1; i < path.length; i++) {
			for (int j = 1; j < path[i].length; j++) {

				if (isAble[i][j] == true) {
					path[i][j] = (path[i - 1][j] + path[i][j - 1]) % 1000000007;
				}
			}
		}

		printArr(path);

		answer = path[path.length - 1][path[0].length - 1];

		System.out.println("-------------");
		System.out.println(answer);
		return answer;
	}
}

public class Main {
	public static void main(String[] args) {
		Solution st = new Solution();
		int m = 10;
		int n = 10;
		int[][] puddles = { { 1, 5 }, { 3, 5 }, { 4, 4 } };

		st.solution(m, n, puddles);
	}
}

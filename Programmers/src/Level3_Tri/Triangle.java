package Level3_Tri;

class Solution {
	public int solution(int[][] triangle) {
		int answer = 0;

		for (int i = triangle.length - 2; i >= 0; i--) {
			for (int j = 0; j < triangle[i+1].length-1; j++) {
				if(triangle[i+1][j] >= triangle[i+1][j+1]) {
					triangle[i][j] += triangle[i+1][j];
				}else {
					triangle[i][j] += triangle[i+1][j+1];
				}
			}
		}
		
		answer = triangle[0][0];
		return answer;
	}
}

public class Triangle {
	public static void main(String[] args) {
		Solution st = new Solution();
		int[][] triangle = { { 7 }, { 3, 8 }, { 8, 1, 0 }, { 2, 7, 4, 4 }, { 4, 5, 2, 6, 5 } };

		st.solution(triangle);
	}
}

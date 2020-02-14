package easy_1266_MinimumTImeVisiting;

/*
 LeetCode 1266 문제
 
 주어진 배열의 순서대로 각 좌표를 모두 방문하는 최소 시간을 구해라. (1초에 x로 1칸 or y로 1칸 or xy로 1칸 씩 이동가능)
 * */
class Solution {
	public int minTimeToVisitAllPoints(int[][] points) {
		int time = 0;
		
		for(int i =1 ; i<points.length;i++) {
			// 현재 좌표와 이전 좌표의 차만큼 대각선으로 이동 후 x 와 y 중에서 큰 수만큼 더 이동하므로.
			time += Math.max(Math.abs(points[i][0] - points[i-1][0]), Math.abs(points[i][1] - points[i-1][1]));
		}
		
		
		System.out.println(time);
		return time;
	}
}

public class Main {
	public static void main(String[] args) {
		Solution st = new Solution();
		int[][] points = { { 1, 1 }, { 3, 4 }, { -1, 0 } };

		st.minTimeToVisitAllPoints(points);
	}
}

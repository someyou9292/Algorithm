package easy_1266_MinimumTImeVisiting;

/*
 LeetCode 1266 ����
 
 �־��� �迭�� ������� �� ��ǥ�� ��� �湮�ϴ� �ּ� �ð��� ���ض�. (1�ʿ� x�� 1ĭ or y�� 1ĭ or xy�� 1ĭ �� �̵�����)
 * */
class Solution {
	public int minTimeToVisitAllPoints(int[][] points) {
		int time = 0;
		
		for(int i =1 ; i<points.length;i++) {
			// ���� ��ǥ�� ���� ��ǥ�� ����ŭ �밢������ �̵� �� x �� y �߿��� ū ����ŭ �� �̵��ϹǷ�.
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

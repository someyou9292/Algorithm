package easy_1029_TwoCityScheduling;

import java.util.Arrays;
import java.util.Comparator;

//660/5000
//ȸ�簡 ���ͺ並 ��ȹ�ϰ��ִ� 2N ���� �ֽ��ϴ�. i ��° ����� ���� A�� �����ϴ� ����� ��� [i] [0]�̸�, i ��° ����� ���� B�� �����ϴ� ����� ��� [i] [1]�Դϴ�.
//
//�� ���ÿ� ��Ȯ�� N ���� ������ �� �ֵ��� ��� ����� ���÷� �����ϴ� �ּ� ����� ��ȯ�Ͻʽÿ�.
//
// 
//�Է� : [[10,20], [30,200], [400,50], [30,20]]
//��� : 110
//����:
//ù ��° ����� ���� A�� 10�� ������ΰ��ϴ�.
//�� ��° ����� 30�� ������� ���� A�ΰ��ϴ�.
//�� ��° ����� ���� B�� 50�� ������ΰ��ϴ�.
//�� ��° ����� ���� B�� 20�� ������ΰ��ϴ�.
//
//�� �ּ� ����� 10 + 30 + 50 + 20 = 110�̸� �� ���ÿ��� ������ ������� ���ͺ並�մϴ�.
// 1 <= costs.length <= 100
// It is guaranteed that costs.length is even.
// 1 <= costs[i][0], costs[i][1] <= 1000

class Solution {
	public int twoCitySchedCost(int[][] costs) {
		int money = 0;
		int cityA = 0;
		int cityB = 0;
		int N = costs.length / 2;

        
		Comparator<int[]> comp = new Comparator<int[]>() {
			public int compare(int[] arr1, int[] arr2) {
				int a = Math.abs(arr1[0]-arr1[1]);
				int b = Math.abs(arr2[0]-arr2[1]);
//				return a-b;		// �� ���� ���̰� ������ ���� ���� (��������)
				return b-a;		// �� ���� ���̰� ū �� ���� ����(��������)
			}
		};
		
		// �� ���� ���̰� ū �ͺ��� �ذ��ؾ� ���� �ּ��� ������ ���� �� �ֱ� ����.
		Arrays.sort(costs, comp);
    
		for (int i = 0; i < costs.length; i++) {
			// A�� ������ B�� ���ݺ��� �۰� A�� ���� N���� �۰ų� || B�� ���� N�̸�
			if ((costs[i][0] <= costs[i][1] && cityA < N) || cityB == N) {
				money += costs[i][0];
				cityA++;
			} else {
				// �ƴ϶�� B�� �ְ�.
				money += costs[i][1];
				cityB++;
			}
		}

		return money;
	}
}

public class TwoCityScheduling {
	public static void main(String[] args) {
		Solution st = new Solution();
		int[][] costs = { { 259, 770 }, { 448, 54 }, { 926, 667 }, { 184, 139 }, { 840, 118 }, { 577, 469 } };

		st.twoCitySchedCost(costs);
	}
}

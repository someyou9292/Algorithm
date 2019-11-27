package easy_1029_TwoCityScheduling;

import java.util.Arrays;
import java.util.Comparator;

//660/5000
//회사가 인터뷰를 계획하고있는 2N 명이 있습니다. i 번째 사람을 도시 A로 비행하는 비용은 비용 [i] [0]이며, i 번째 사람을 도시 B로 비행하는 비용은 비용 [i] [1]입니다.
//
//각 도시에 정확히 N 명이 도착할 수 있도록 모든 사람을 도시로 비행하는 최소 비용을 반환하십시오.
//
// 
//입력 : [[10,20], [30,200], [400,50], [30,20]]
//출력 : 110
//설명:
//첫 번째 사람은 도시 A에 10의 비용으로갑니다.
//두 번째 사람은 30의 비용으로 도시 A로갑니다.
//세 번째 사람은 도시 B에 50의 비용으로갑니다.
//네 번째 사람은 도시 B에 20의 비용으로갑니다.
//
//총 최소 비용은 10 + 30 + 50 + 20 = 110이며 각 도시에서 절반의 사람들이 인터뷰를합니다.
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
//				return a-b;		// 두 값의 차이가 작은수 부터 정렬 (오름차순)
				return b-a;		// 두 값의 차이가 큰 수 부터 정렬(내림차순)
			}
		};
		
		// 두 값의 차이가 큰 것부터 해결해야 가장 최소의 가격을 뽑을 수 있기 때문.
		Arrays.sort(costs, comp);
    
		for (int i = 0; i < costs.length; i++) {
			// A의 가격이 B의 가격보다 작고 A의 수가 N보다 작거나 || B의 수가 N이면
			if ((costs[i][0] <= costs[i][1] && cityA < N) || cityB == N) {
				money += costs[i][0];
				cityA++;
			} else {
				// 아니라면 B에 넣고.
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

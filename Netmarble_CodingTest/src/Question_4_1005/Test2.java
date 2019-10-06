package Question_4_1005;

class Solution {
	public int solution(int n, int[][] battery) {
		int answer = 0;
		int[] onePrice = new int[battery.length];

		for (int i = 0; i < onePrice.length; i++) {
			onePrice[i] = battery[i][1] / battery[i][0];
		}
		int min = onePrice[0];
		int index = 0;
		for (int i = 0; i < onePrice.length; i++) {
			if (min > onePrice[i]) {
				min = onePrice[i];
				index = i;
			} else if (min == onePrice[i]) {
				if (battery[i][0] > battery[index][0]) {
					min = onePrice[i];
					index = i;
				}
			}
		}

		System.out.println("min >> " + min);
		System.out.println("index >> " + index);
		System.out.println("battery[index][0] >> " + battery[index][0]);

		int totalCount = 0;
		int totalPrice = 0;

		while (totalCount < n) {
			totalCount = totalCount + battery[index][0];
			totalPrice = totalPrice + battery[index][1];
		}
		if (totalCount == n) {
			return totalPrice;
		}

		if (totalCount > n) {
			totalCount = totalCount - battery[index][0];
			totalPrice = totalPrice - battery[index][1];
		}

		int remain = n - totalCount;
		int remainMin = Integer.MAX_VALUE;

		for (int i = 0; i < battery.length; i++) {
			if (remain <= battery[i][0]) {
				if (remainMin > battery[i][1]) {
					remainMin = battery[i][1];
				}
			} else {
				if (remainMin > battery[i][1] * remain) {
					remainMin = battery[i][1] * remain;
				}
			}
		}

		answer = totalPrice + remainMin;

		return answer;
	}
}

public class Test2 {
	public static void main(String[] args) {
		Solution st = new Solution();
		int n = 50;
//		int[][] battery = { { 6, 30000 }, { 3, 18000 }, { 4, 28000 }, { 1, 9500 }, { 10, 40000 } };
		int[][] battery = { { 30, 30000 }, { 20, 20000 }, { 40, 40000} };

		System.out.println(st.solution(n, battery));
	}
}

//class Solution {
//	public int solution(int n, int[][] battery) {
//		int answer = 0;
//		int[] onePrice = new int[battery.length];
//
//		for (int i = 0; i < onePrice.length; i++) {
//			onePrice[i] = battery[i][1] / battery[i][0];
//		}
//		int min = onePrice[0];
//		int index = 0;
//		for (int i = 0; i < onePrice.length; i++) {
//			if (min >= onePrice[i]) {
//				min = onePrice[i];
//				index = i;
//			}
//		}
//
//		int totalCount = 0;
//		int totalPrice = 0;
//		
//		while (totalCount < n) {
//			totalCount = totalCount + battery[index][0];
//			totalPrice = totalPrice + battery[index][1];
//		}
//		if(totalCount == n) {
//			return totalPrice;
//		}
//		
//		if (totalCount > n) {
//			totalCount = totalCount - battery[index][0];
//			totalPrice = totalPrice - battery[index][1];
//		}
//		
//
//		int remain = n - totalCount;
//		int remainMin = Integer.MAX_VALUE;
//		
//		for (int i = 0; i < battery.length; i++) {
//			if(remain <= battery[i][0]) {
//				if(remainMin > battery[i][1]) {
//					remainMin = battery[i][1];
//				}
//			}else {
//				if(remainMin > battery[i][1] * remain) {
//					remainMin = battery[i][1] * remain;
//				}
//			}
//		}
//	
//		answer = totalPrice + remainMin;
//		
//		return answer;
//	}
//}

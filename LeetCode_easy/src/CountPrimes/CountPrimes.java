package CountPrimes;

import java.util.Arrays;

/*
  양수 중에서 주어진 수 보다 작은 소수들의 수를 구하시오
  
  ex)
  input 10
  output 4    (2 3 5 7)
 * */


class Solution {
	public int countPrimes(int n) {

		int count = 0;
		int[] arr = new int[n];
		Arrays.fill(arr, 1);
		// 모든 배열을 1로 세팅

		for (int i = 2; i < n; i++) {
			for (int j = 2; i * j < n; j++) { // i*j 한 곳을 모두 0으로 세팅
				arr[i * j] = 0;
			}
		}
		for (int i = 2; i < arr.length; i++) {
			if (arr[i] == 1) { // 변화되지 않은 1인 곳 = 소수
				count++;
			}
		}
		return count;
	}
}
public class CountPrimes {
	public static void main(String[] args) {
		Solution st = new Solution();
		int n = 10;

		System.out.println(st.countPrimes(n));
	}
}

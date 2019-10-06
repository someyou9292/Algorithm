package CountPrimes;

import java.util.Arrays;

/*
  ��� �߿��� �־��� �� ���� ���� �Ҽ����� ���� ���Ͻÿ�
  
  ex)
  input 10
  output 4    (2 3 5 7)
 * */


class Solution {
	public int countPrimes(int n) {

		int count = 0;
		int[] arr = new int[n];
		Arrays.fill(arr, 1);
		// ��� �迭�� 1�� ����

		for (int i = 2; i < n; i++) {
			for (int j = 2; i * j < n; j++) { // i*j �� ���� ��� 0���� ����
				arr[i * j] = 0;
			}
		}
		for (int i = 2; i < arr.length; i++) {
			if (arr[i] == 1) { // ��ȭ���� ���� 1�� �� = �Ҽ�
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

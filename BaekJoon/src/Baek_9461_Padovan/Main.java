package Baek_9461_Padovan;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		long[] arr = new long[N + 5];

		arr[0] = 1;
		arr[1] = 1;
		arr[2] = 1;
		arr[3] = 2;
		arr[4] = 2;

		for (int i = 5; i <= N; i++) {
			arr[i] = arr[i - 1] + arr[i - 5];
		}
		if (N <= 4) {
			System.out.println(arr[N]);
		} else {
			System.out.println(arr[N - 1]);
		}
	}
}

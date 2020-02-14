package Baek_2748_Fibonacci;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Solution {
	public int solution(int n) {
		int answer = 0;
		List<Integer> fibonacci = new ArrayList<Integer>();

		fibonacci.add(0);
		fibonacci.add(1);

		for (int i = 2; i <= n; i++) {
			fibonacci.add(fibonacci.get(i - 1) + fibonacci.get(i - 2));
		}
		
		System.out.println(fibonacci.get(n));
		
		return answer;
	}
}

public class Fibonacci {
	public static void main(String[] args) {
		Solution st = new Solution();
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();

		st.solution(n);
	}
}

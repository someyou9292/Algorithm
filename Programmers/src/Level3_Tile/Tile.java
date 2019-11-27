package Level3_Tile;

class Solution {
	public int solution(int n) {
		int answer = 0;
		int[] count = new int[n + 1];

		count[0] = 1;
		count[1] = 1;

		for (int i = 2; i <= n; i++) {
			count[i] = (count[i - 1] + count[i - 2]) % 1000000007;
		}

		answer = count[count.length - 1];

		System.out.println(answer);
		return answer;
	}
}

public class Tile {
	public static void main(String[] args) {
		Solution st = new Solution();
		int n = 5;

		st.solution(n);
	}
}

//	수가 너무 크다보니 에러남..
//class Solution {
//	public int Combination(int total, int even, int Loop) {
//		double result = 1;
//		double p = total - even;
//		double c = 1;
//
//		for (int i = 0; i < Loop; i++) {
//			result *= p / c;
//			p--;
//			c++;
//		}
//		return (int) result;
//	}
//
//	public int solution(int n) {
//		int answer = 0;
//		int odd_count = n;
//		int even_count = 0;
//		long result = 0;
//		
//		while (odd_count > 0) {
//			int E = even_count/2;
//			result += Combination(n, E ,odd_count);
//			odd_count = odd_count - 2;
//			even_count = even_count + 2;
//		}
//		
//
//		if (n % 2 == 0) {
//			result++;
//		}
//		
//		answer = (int)(result % 1000000007);
//
//		System.out.println(answer);
//
//		return answer;
//	}
//}
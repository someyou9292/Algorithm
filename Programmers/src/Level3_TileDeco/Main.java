package Level3_TileDeco;

class Solution {
	public long solution(int N) {
		long answer = 0;
		long[] tiles = new long[N + 1];

		tiles[0] = 1;
		tiles[1] = 1;

		for (int i = 2; i < tiles.length; i++) {
			tiles[i] = tiles[i-1] + tiles[i-2];
		}
		
		answer = (tiles[N] + tiles[N-1]) * 2;
		
		return answer;
	}
}

public class Main {
	public static void main(String[] args) {
		Solution st = new Solution();
		int N = 5;

		st.solution(N);
	}
}

//	정확도는 100 / 효율성에서 fail
//class Solution {
//	public long solution(int N) {
//		long answer = 0;
//		List<Integer> list = new ArrayList<Integer>();
//
//		list.add(1);
//		list.add(1);
//
//		// N 까지 하는 이유 : N개의 타일로 만드는 직사각형의 긴 변의 길이가 N+1번째 타일의 한 변의 길이와 같다.
//		// 작은 변의 길이는 N번째 타일의 한변과 같음.
//		for (int i = 2; i <= N; i++) {
//			list.add(list.get(i - 1) + list.get(i - 2));
//		}
//
//		answer = (list.get(N) + list.get(N - 1)) * 2;
//		
//		System.out.println(answer);
//		return answer;
//	}
//}

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

//	��Ȯ���� 100 / ȿ�������� fail
//class Solution {
//	public long solution(int N) {
//		long answer = 0;
//		List<Integer> list = new ArrayList<Integer>();
//
//		list.add(1);
//		list.add(1);
//
//		// N ���� �ϴ� ���� : N���� Ÿ�Ϸ� ����� ���簢���� �� ���� ���̰� N+1��° Ÿ���� �� ���� ���̿� ����.
//		// ���� ���� ���̴� N��° Ÿ���� �Ѻ��� ����.
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

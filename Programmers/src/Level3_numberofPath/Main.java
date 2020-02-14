package Level3_numberofPath;

class Solution {
	public void printArr(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public int solution(int m, int n, int[][] puddles) {
		int answer = 0;
		boolean[][] isAble = new boolean[n][m];		// �� ������ ǥ�����ֱ� ���� �迭
		int[][] path = new int[n][m];

		// isAble �迭�� ��� true�� �ʱ�ȭ
		for (int i = 0; i < isAble.length; i++) {
			for (int j = 0; j < isAble[i].length; j++) {
				isAble[i][j] = true;
			}
		}
		
		// �� �����̰� �ִ� ��ġ�� false�� �ʱ�ȭ
		for (int i = 0; i < puddles.length; i++) {
			isAble[puddles[i][1] - 1][puddles[i][0] - 1] = false;
		}
		
		// �� �ʱ�ȭ
		for (int i = 0; i < path.length; i++) {
			for (int j = 0; j < path[i].length; j++) {
				if (isAble[i][j] == false) {		// �����̰� �ִ� ���� 0
					path[i][j] = 0;
				} else {							// �ƴϸ� 1
					path[i][j] = 1;
				}

				if (i == 0 && j != 0) {				// ù�࿡�� �߰��� �����̰� �ִٸ� ���Ŀ��� ��� ������
					if (isAble[i][j - 1] == false) {
						isAble[i][j] = false;		// �ش� ��ġ�� false�� �ٲٰ�
						path[i][j] = 0;				// 0���� �ʱ�ȭ
					}
				} else if (j == 0 && i != 0) {		// ù ������ �߰��� �����̰� �ִٸ� ���Ĵ� ��� ������
					if (isAble[i - 1][j] == false) {
						isAble[i][j] = false;		// �ش� ��ġ�� false�� �ٲٰ�
						path[i][j] = 0;				// 0���� �ʱ�ȭ
					}
				}

			}
		}
		path[0][0] = 0;		// ���� 0���� �ʱ�ȭ
		path[path.length - 1][path[0].length - 1] = 0;		// �б��� 0���� �ʱ�ȭ
		
		// �ִܰŸ� ���
		for (int i = 1; i < path.length; i++) {
			for (int j = 1; j < path[i].length; j++) {

				if (isAble[i][j] == true) {
					path[i][j] = (path[i - 1][j] + path[i][j - 1]) % 1000000007;
				}
			}
		}

		printArr(path);

		answer = path[path.length - 1][path[0].length - 1];

		System.out.println("-------------");
		System.out.println(answer);
		return answer;
	}
}

public class Main {
	public static void main(String[] args) {
		Solution st = new Solution();
		int m = 10;
		int n = 10;
		int[][] puddles = { { 1, 5 }, { 3, 5 }, { 4, 4 } };

		st.solution(m, n, puddles);
	}
}

package LastStoneWeight;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 ������ ����
 ���� ���԰� �迭�� �־����ϴ�.
 �� �ϸ��� ���� ���ſ� �� ���� ���� ��� ���� Ĩ�ϴ�.
 ���� ���Դ� x <= y �Դϴ�.
 
 ����� ������ ��Ģ�� �����ϴ�.
 1. x == y �̸� �� ���� �ı��˴ϴ�.
 2. x != y �̸� x�� �ı��ǰ� y ���� y-x �� ���԰� �˴ϴ�.
 3. �ϳ��� ���� ���� �� ���� ���� ������ �ݺ��մϴ�.
 ������ ���� ���� ���Ը� ��ȯ�Ͻÿ�.
 * */

// ȿ�� 96.33% 
class Solution {
	public int lastStoneWeight(int[] stones) {
		if (stones.length == 1) {
			return stones[0];
		}
		int length = stones.length;
		int count = stones.length;

		while (count >= 1) {
			Arrays.sort(stones);
			int x = stones[length - 2];
			int y = stones[length - 1];

			if (x == y) {
				stones[length - 2] = 0;
				stones[length - 1] = 0;
				count -= 2;
			} else {
				stones[length - 1] = stones[length - 1] - stones[length - 2];
				stones[length - 2] = 0;
				count--;
			}
		}

		return stones[stones.length - 1];
	}
}

public class LastStoneWeight {
	public static void main(String[] args) {
		Solution st = new Solution();
		int[] stones = { 2, 7, 4, 1, 8, 1 };
		System.out.println(st.lastStoneWeight(stones));
	}
}

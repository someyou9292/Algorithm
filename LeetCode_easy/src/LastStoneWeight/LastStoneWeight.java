package LastStoneWeight;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 돌맹이 문제
 돌의 무게가 배열로 주어집니다.
 매 턴마다 가장 무거운 두 개의 돌을 골라 서로 칩니다.
 돌의 무게는 x <= y 입니다.
 
 결과는 다음의 규칙을 따릅니다.
 1. x == y 이면 두 돌은 파괴됩니다.
 2. x != y 이면 x는 파괴되고 y 돌은 y-x 의 무게가 됩니다.
 3. 하나의 돌이 남을 때 까지 위의 과정을 반복합니다.
 마지막 남은 돌의 무게를 반환하시오.
 * */

// 효율 96.33% 
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

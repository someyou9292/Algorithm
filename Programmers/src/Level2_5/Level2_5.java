package Level2_5;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Solution {
	public int[] solution(int[] prices) {
		Stack<Integer> stack = new Stack<Integer>();
		List<Integer> list = new ArrayList<Integer>();
		int[] answer = new int[prices.length];

		for (int i = 0; i < prices.length; i++) {
			stack.push(prices[i]);
		}

		int index = 0;
		int size = stack.size();
		while (index < size) {
			int stackPop = stack.pop();
			int time = 0;
			list.add(stackPop);

			if (list.size() > 1) {
				for (int i = list.size() - 2; i >= 0; i--) {
					if (stackPop > list.get(i)) {
						time++;
						break;
					} else {
						time++;
						continue;
					}
				}
			}
			answer[answer.length - 1 - index] = time;
			index++;
		}

		for (int n : answer) {
			System.out.println(n);
		}

		return answer;
	}
}

public class Level2_5 {
	public static void main(String[] args) {
		Solution st = new Solution();
		int[] prices = { 5,4,3,4,5 };
		st.solution(prices);
	}
}

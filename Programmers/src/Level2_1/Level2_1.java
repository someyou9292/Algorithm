package Level2_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Solution {
	public int[] solution(int[] heights) {
		int[] answer = new int[heights.length];
		Stack<Integer> stack = new Stack<Integer>();
		List<Integer> list = new ArrayList<Integer>();

		for (int i = heights.length - 1; i >= 0; i--) {
			stack.push(heights[i]);
		}

		int size = stack.size();
		int index = 0;

		while (index < size) {
			int stack_pop = stack.pop();
			list.add(stack_pop);
			for (int i = list.size() - 1; i >= 0; i--) {
				if (stack_pop < list.get(i)) {
					answer[index] = i + 1;
					break;
				} else {
					continue;
				}
			}
			index++;
		}

//		for (int n : answer) {
//			System.out.println(n);
//		}

		return answer;
	}
}

public class Level2_1 {
	public static void main(String[] args) {
		Solution st = new Solution();
		int[] heights = { 1,5,3,6,7,6,5 };
		st.solution(heights);
	}
}

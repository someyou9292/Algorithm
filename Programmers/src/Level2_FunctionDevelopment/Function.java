package Level2_FunctionDevelopment;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {
	public int[] solution(int[] progresses, int[] speeds) {
		Queue<Integer> q = new LinkedList<Integer>();
		Queue<Integer> develop = new LinkedList<Integer>();
		Queue<Integer> speed = new LinkedList<Integer>();

		List<Integer> result = new ArrayList<Integer>();
		for (int i = 0; i < progresses.length; i++) {
			q.add(progresses[i]);
			speed.add(speeds[i]);
		}

		while (!q.isEmpty()) {
			if (q.peek() < 100) {
				int loop = speed.size();
				while (loop > 0) {
					int work = q.poll();
					int s = speed.poll();
					develop.add(work + s);
					q.add(develop.poll());
					speed.add(s);
					loop--;
				}
			} else {
				int count = 0;
				while (!q.isEmpty() && q.peek() >= 100) {
					q.poll();
					speed.poll();
					count++;
				}
				result.add(count);
			}
		}

		int[] answer = new int[result.size()];

		for (int i = 0; i < result.size(); i++) {
			answer[i] = result.get(i);
		}
		

		return answer;
	}
}

public class Function {
	public static void main(String[] args) {
		Solution st = new Solution();
		int[] progresses = { 93, 30, 55 };
		int[] speeds = { 1, 30, 5 };

		st.solution(progresses, speeds);
	}
}

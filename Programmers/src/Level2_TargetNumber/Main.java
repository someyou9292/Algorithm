package Level2_TargetNumber;

class Solution {

	public int dfs(int[] numbers, int target, int index, int sum) {
		if (index == numbers.length) {
			return sum == target ? 1 : 0;
		} else {
			return dfs(numbers, target, index + 1, sum + numbers[index])
					+ dfs(numbers, target, index + 1, sum - numbers[index]);
		}
	}

	public int solution(int[] numbers, int target) {
		int answer = 0;

		answer = dfs(numbers, target, 0, 0);

		System.out.println(answer);
		return answer;
	}
}

public class Main {
	public static void main(String[] args) {
		Solution st = new Solution();
		int[] numbers = { 1, 1, 1, 1, 1 };
		int target = 3;

		st.solution(numbers, target);
	}
}

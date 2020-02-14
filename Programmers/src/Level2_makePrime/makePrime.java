package Level2_makePrime;

import java.util.ArrayList;
import java.util.List;

class Solution {
	public boolean findPrime(int n) {
		int count = 0;

		boolean isPrime = false;

		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}

		return true;
	}

	public List<Integer> comb(List<Integer> resultList, int[] arr, boolean[] visited, int depth, int n, int r) { // nCr
		if (r == 0) {
			resultList.add(Sum(arr, visited, n));
			return resultList;
		}
		if (depth == n) {
			return resultList;
		} else {
			visited[depth] = true;
			comb(resultList, arr, visited, depth + 1, n, r - 1);
			visited[depth] = false;
			comb(resultList, arr, visited, depth + 1, n, r);
		}
		return resultList;
	}

	static int Sum(int[] arr, boolean[] visited, int n) {
		int result = 0;
		for (int i = 0; i < n; i++) {
			if (visited[i] == true) {
				result += arr[i];
//				System.out.print(arr[i] + " ");
			}
		}
//		System.out.println();
//		System.out.println("ÇÕ °á°ú > " + result);
		return result;
	}

	public int solution(int[] nums) {
		int answer = 0;
		List<Integer> resultList = new ArrayList<Integer>();

		boolean[] visited = new boolean[nums.length];
		comb(resultList, nums, visited, 0, nums.length, 3);

		for (int i = 0; i < resultList.size(); i++) {
			if (findPrime(resultList.get(i)) == true) {
				answer++;
			}
		}

		return answer;
	}
}

public class makePrime {
	public static void main(String[] args) {
		Solution st = new Solution();
		int[] nums = { 1, 2, 3, 4 };
		st.solution(nums);
	}
}

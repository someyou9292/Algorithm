package easy_575_DistributeCandies;

import java.util.HashSet;

/*
 leetcode 575 ����
 ¦�������� �迭 cadies���� �� ��Ҵ� ������ ������ ��Ÿ����.
 �ִ��� �ٸ� ������ ������ �й��ϴ� �������� �����Ͻÿ�.
 * */
class Solution {
	public int distributeCandies(int[] candies) {
		int answer = 0;
		HashSet<Integer> set_a = new HashSet<Integer>();
		HashSet<Integer> set_b = new HashSet<Integer>();
		for (int i = 0; i < candies.length && set_a.size() < candies.length / 2; i++) {
			if (set_a.isEmpty()) {
				set_a.add(candies[i]);
			} else {
				if (!set_a.contains(candies[i])) {
					set_a.add(candies[i]);
				} else {
					set_b.add(candies[i]);
				}
			}
		}

		answer = Math.max(set_a.size(), set_b.size());

		System.out.println(answer);
		return answer;
	}
}

public class Main {
	public static void main(String[] args) {
		Solution st = new Solution();

		int[] candies = { 0, 0, 14, 0, 10, 0, 0, 0 };
		st.distributeCandies(candies);
	}
}

//	36.23%
//class Solution {
//	public int distributeCandies(int[] candies) {
//		int answer = 0;
//		HashSet<Integer> set_a = new HashSet<Integer>();
//		HashSet<Integer> set_b = new HashSet<Integer>();
//		for (int i = 0; i < candies.length && set_a.size() < candies.length / 2; i++) {
//			if (set_a.isEmpty()) {
//				set_a.add(candies[i]);
//			} else {
//				if (!set_a.contains(candies[i])) {
//					set_a.add(candies[i]);
//				} else {
//					set_b.add(candies[i]);
//				}
//			}
//		}
//
//		answer = Math.max(set_a.size(), set_b.size());
//
//		System.out.println(answer);
//		return answer;
//	}
//}
// ȿ�� 28.64%
//class Solution {
//	public int distributeCandies(int[] candies) {
//		int count = 1;
//
//		Arrays.sort(candies);
//
//		for (int i = 1; i < candies.length && count < candies.length / 2; i++) {
//			if (candies[i - 1] < candies[i]) {
//				count++;
//			}
//		}
//
//		return count;
//	}
//}

//	�ð� �ʰ����� ��������.
//class Solution {
//	int max = 0;
//	public void permute(int[] nums, int index) {
//		if (index == nums.length - 1) {
//			HashSet<Integer> set = new HashSet<>();
//
//			for (int i = 0; i < nums.length / 2; i++) {
//				set.add(nums[i]);
//			}
//			max = Math.max(max, set.size());
//		}
//
//		for (int i = index; i < nums.length; i++) {
//			swap(nums, i, index);
//			permute(nums, index + 1);
//			swap(nums, i, index);
//		}
//	}
//
//	public void swap(int[] nums, int x, int y) {
//		int temp = nums[x];
//		nums[x] = nums[y];
//		nums[y] = temp;
//	}
//
//	public int distributeCandies(int[] candies) {
//		permute(candies, 0);
//		
//		return max;
//	}
//}

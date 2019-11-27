package IntersectionOfTwoArrays_2;

import java.util.Arrays;

class Solution {
	public int[] intersect(int[] nums1, int[] nums2) {

		Arrays.sort(nums1);
		Arrays.sort(nums2);

		int i = 0, j = 0, k = 0;
		while (i < nums1.length && j < nums2.length) {
			if (nums1[i] > nums2[j]) {
				j++;
			} else if (nums1[i] < nums2[j]) {
				i++;
			} else {
				nums1[k++] = nums1[i++];
				j++;
			}
		}

		return Arrays.copyOfRange(nums1, 0, k);
	}
}

public class IntersectionOfTwoArrays_2 {
	public static void main(String[] args) {
		Solution st = new Solution();
		int[] nums1 = { 4, 9, 5 };
		int[] nums2 = { 9, 4, 9, 8, 4 };
		st.intersect(nums1, nums2);
	}
}

// È¿À² 13.12%
//class Solution {
//	public int[] intersect(int[] nums1, int[] nums2) {
//		Stack<Integer> stack = new Stack<Integer>();
//		List<Integer> list = new ArrayList<Integer>();
//		List<Integer> answer = new ArrayList<Integer>();
//
//		for (int i = 0; i < nums1.length; i++) {
//			stack.push(nums1[i]);
//		}
//
//		for (int i = 0; i < nums2.length; i++) {
//			list.add(nums2[i]);
//		}
//
//		while (!stack.isEmpty()) {
//			int pop = stack.pop();
//			for (int i = 0; i < list.size(); i++) {
//				if (pop == list.get(i)) {
//					answer.add(pop);
//					list.remove(i);
//					break;
//				}
//			}
//		}
//
//		int[] result = new int[answer.size()];
//
//		for (int i = 0; i < result.length; i++) {
//			result[i] = answer.get(i);
//		}
//		
//		
//		return result;
//	}
//}
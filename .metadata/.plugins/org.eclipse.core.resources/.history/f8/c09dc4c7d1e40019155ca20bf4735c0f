package ContatinsDuplicate_2;

class Solution {
	public boolean containsNearbyDuplicate(int[] nums, int k) {

		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = i + 1; j - i <= k; j++) {
				if (nums[i] == nums[j]) {
					return true;
				}
				if (j == nums.length - 1) {
					break;
				}
			}
		}

		return false;
	}
}

public class ContainsDuplicate_2 {
	public static void main(String[] args) {
		Solution st = new Solution();
		int[] nums = { 1, 2, 3, 1, 2, 3 };
		int k = 2;
		System.out.println(st.containsNearbyDuplicate(nums, k));
	}
}

// My Solution = GuDeKi
//class Solution {
//	public boolean containsNearbyDuplicate(int[] nums, int k) {
//		
//		int distance = 0;
//		
//		for (int i = 0; i < nums.length; i++) {
//			for (int j = i+1; j < nums.length; j++) {
//				if(nums[i] == nums[j]) {
//					distance = j - i;
//					if(distance <=k) return true;
//				}
//			}
//			distance = 0;
//		}
//
//		return false;
//	}
//}
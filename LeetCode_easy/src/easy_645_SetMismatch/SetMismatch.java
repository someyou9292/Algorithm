package easy_645_SetMismatch;

class Solution {
	public int[] findErrorNums(int[] nums) {

		int n = nums.length;
		int[] count = new int[n + 1]; // 1 부터 n 까지 이므로 +1 해줌

		int countSum = 0;
		int dup = 0;
		for (int i = 0; i < nums.length; i++) {
			count[nums[i]]++;
			countSum += nums[i];
			if (count[nums[i]] == 2) {
				dup = nums[i];
			}
		}

		int sum = ((n + 1) * n) / 2; // 등차수열의 합공식
		int missing = sum - (countSum - dup);
		
		return new int[] {dup, missing};
	}
}

public class SetMismatch {
	public static void main(String[] args) {
		Solution st = new Solution();
		int[] nums = { 3, 2, 3, 4, 6, 5 };
		st.findErrorNums(nums);
	}
}

// 효율 5%
//class Solution {
//	public int[] findErrorNums(int[] nums) {
//		int[] result = new int[2];
//		List<Integer> comp = new ArrayList<Integer>();
//		
//		Arrays.sort(nums);
//		for(int i=0; i<nums.length;i++) {
//			comp.add(nums[i]);
//		}
//		
//		int check = nums.length;
//		for(int i=0; i<nums.length;i++) {
//			if(i < nums.length-1) {
//				if(nums[i] == nums[i+1]) {
//					result[0] = nums[i];
//				}
//			}
//			if(!comp.contains(check)) {
//				result[1] = check;
//			}
//			check--;
//		}
//		
//
//		return result;
//	}
//}

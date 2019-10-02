package NonDecreasingArray;

/*
 * 배열의 원소 중 딱 하나의 원소만 수정하여 감소하지 않는 배열인지 판단하시오.
 * 
 * array [i] <= array [i + 1]이 모든 i (1 <= i <n)에 대해 유지되는 경우
 * 배열이 감소하지 않는 것으로 정의합니다.
 * 
 * [4,2,3] -> true
 * 4 -> 1 로 바꾸면 감소하지 않으므로 true
 * */

class Solution {
	public boolean checkPossibility(int[] nums) {
		
		int count = -1;
		
		for(int i=1 ; i<nums.length;i++) {
			if(nums[i-1] > nums[i]) {
				if(count != 0) {
					return false;
				}
				else count = i;
			}
		}
		
		return (count == -1 || count == 0 || count == nums.length-1 ||
				nums[count -2] <= nums[count] || nums[count - 1] <= nums[count + 1]);
	}
}

public class NonDecreassingArray {
	public static void main(String[] args) {
		Solution st = new Solution();
		int[] nums = { -1, 4, 2, 3 };
		System.out.println(st.checkPossibility(nums));
	}
}

/*
  public boolean checkPossibility(int[] nums) {
        int p = -1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i-1] > nums[i]) {
                if (p != -1) return false;
                else p = i;
            }
        }
        return (p == -1 ||   // no reversed pair
                p == 1 || p == nums.length - 1 ||  // reversed pair is first or last element
                nums[p - 2] <= nums[p] || nums[p - 1] <= nums[p + 1]); // normal case range [p-2 --> p+1] all valid
    }
 * */

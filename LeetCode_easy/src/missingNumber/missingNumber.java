package missingNumber;

/*
 0 ~ N 까지의 수가 있는 배열이 주어지면 빠진 숫자를 구해라
 Example 1:
 
 Input: [3,0,1]
 Output: 2
 * */
//class Solution {
//	public int missingNumber(int[] nums) {
//
//		int[] check = new int[nums.length + 1];
//
//		for (int i = 0; i < check.length; i++) {
//			check[i] = i;
//		}
//
//		for (int i = 0; i < nums.length; i++) {
//			for (int j = 0; j < check.length; j++) {
//				if (nums[i] == check[j]) {
//					check[j] = -1;
//					break;
//				}
//			}
//		}
//
//		for(int i=0; i<check.length;i++) {
//			if(check[i]!=-1) {
//				return check[i];
//			}
//		}
//		
//		return -1;
//	}
//}

class Solution {
    public int missingNumber(int[] nums) {
        int missing = nums.length;
        for (int i = 0; i < nums.length; i++) {
        	
            missing = missing ^ (i ^ nums[i]);
        }
        return missing;
    }
}

public class missingNumber {
	public static void main(String[] args) {
		Solution st = new Solution();
		int[] nums = { 3, 0, 1 };
		System.out.println(st.missingNumber(nums));
	}
}

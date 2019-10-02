package SearchInsertPosition;


/*
 정렬된 배열이 주어지고 타겟의 수가 발견되면 타겟의 인덱스를 반환
 없다면 타겟이 들어가서 정렬되었을때의 타겟 인덱스를 반환
 
 Example 1:
Input: [1,3,5,6], 5
Output: 2

Example 2:
Input: [1,3,5,6], 2
Output: 1

Example 3:
Input: [1,3,5,6], 7
Output: 4

Example 4:
Input: [1,3,5,6], 0
Output: 0
 * */

class Solution {
    public int searchInsert(int[] nums, int target) {
        
    	int index = 0;
    	
    	for(int i=0; i<nums.length;i++) {
    		if(nums[i] == target) {
    			return i;
    		}else {
    			if(i==0) {
    				if(nums[i] > target) {
    					return index;
    				}else {
    					index++;
    				}
    			}else if(i == nums.length-1){
    				if(nums[i] < target) {
    					index = nums.length;
    				}
    			}else {
    				if(nums[i] < target) {
    					index++;
    				}else {
    					return index;
    				}
    			}
    		}
    	}
    
    	return index;
    }
}

public class searchInsertPosition {
	public static void main(String[] args) {
		Solution st = new Solution();
		int[] nums = {1,3,5,6};
		int target = 0;
		
		System.out.println(st.searchInsert(nums, target));
	}

}

package RemoveDuplicates;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

/*
	19.09.17
	Desciption
	
	배열에 중복되는 것을 제외시킨 배열의 길이를 반환
	
	ex1) 
	nums = [1,2,2]
	ans = 2
	
	ex2)
	nums = [1,2,3]
	ans = 3
	
	* 조건
	다른 배열에 추가 공간을 할당 하면 안된다.
	추가 메모리를 할당 하는 것 대신에 주어진 입력 배열을 수정하여 작업을 수행해야된다.
 * */

//class Solution {
//	public int removeDuplicates(int[] nums) {
//		HashSet<Integer> arr = new HashSet<Integer>();
//		
//		for(int i=0; i<nums.length;i++) {
//			arr.add(nums[i]);
//		}
//		
//		System.out.println(arr);
//		
//		return arr.size();
//	}	
//}

class Solution {
    public int removeDuplicates(int[] nums) {
    	
    	if(nums.length==0) return 0;
    	
    	int result = 0;
 
    	for(int i=1; i<nums.length;i++) {
    		if(nums[result] == nums[i]) {
    			result = nums[i];
    			continue;
    		}
    		if(nums[result] != nums[i]) {
    			result++;
    		}
    	}
    	
    	return result;
    }
}

//class Solution {
//    public int removeDuplicates(int[] nums) {
//    	
//    	if(nums.length==0) return 0;
//    	
//    	int result = 0;
// 
//    	for(int i=1; i<nums.length;i++) {
//    		if(nums[result] != nums[i]) {
//    			result++;
//    			nums[result] = nums[i];
//    		}
//    	}
//    	
//    	return result+1;
//    }
//}
public class duplicatesArr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Solution st = new Solution();

		int[] arr = { 1,2,2,2,2,2,3,4,5 };

		System.out.println(st.removeDuplicates(arr));
	}
}

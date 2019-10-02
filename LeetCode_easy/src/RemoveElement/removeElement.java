package RemoveElement;

import java.util.Scanner;

class Solution {
    public int removeElement(int[] nums, int val) {    	
    	
    	int i = 0;
    	int n = nums.length;
    	
    	while(i < n) {
    		if(nums[i] == val) {
    			nums[i] = nums[n-1];
    			n--;
    		}
    		else {
    			i++;
    		}
    	}
    	
    	return n;
    }
}

public class removeElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Solution st = new Solution();

		int[] arr = { 1,1,2,3,1,1,2,2,1,1 };
		
		System.out.println(st.removeElement(arr, 1));
	}
}

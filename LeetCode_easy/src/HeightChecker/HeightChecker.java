package HeightChecker;

import java.util.Arrays;
import java.util.HashMap;

/*
키의 순서가 줄어들지 않게 줄을 맞춰야됩니다. 이때 올바른 위치에 있지 않은 학생들의 수를 구하시오
 (오름차순으로 정렬했을때 제 위치에 있지않는 학생들의 수)
 Input: [1,1,4,2,1,3]
Output: 3
 4, 1, 3 은 제 위치에 없다
 1 1 1 2 3 4  가 되야되는 것
 * */

class Solution {
	public int heightChecker(int[] heights) {

		int[] sortedHeights = new int[heights.length];
		
		for(int i=0; i<heights.length;i++) {
			sortedHeights[i] = heights[i];
		}
		Arrays.sort(sortedHeights);
		
		int count = 0;
		for (int i = 0; i < heights.length; i++) {
			if(heights[i] != sortedHeights[i]) {
				count++;
			}
		}
		
		return count;
	}
}

public class HeightChecker {
	public static void main(String[] args) {
		Solution st = new Solution();
		int[] heights = { 1, 2, 1, 2, 1, 1, 1, 2, 1 };

		System.out.println(st.heightChecker(heights));
	}
}

package HeightChecker;

import java.util.Arrays;
import java.util.HashMap;

/*
Ű�� ������ �پ���� �ʰ� ���� ����ߵ˴ϴ�. �̶� �ùٸ� ��ġ�� ���� ���� �л����� ���� ���Ͻÿ�
 (������������ ���������� �� ��ġ�� �����ʴ� �л����� ��)
 Input: [1,1,4,2,1,3]
Output: 3
 4, 1, 3 �� �� ��ġ�� ����
 1 1 1 2 3 4  �� �ǾߵǴ� ��
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

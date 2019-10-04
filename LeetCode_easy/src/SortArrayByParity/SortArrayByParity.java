package SortArrayByParity;

import java.util.ArrayList;
import java.util.List;

/*
 * ������ �ƴ� �迭�� �־����� ��� ¦���� ��� Ȧ���� ���� �迭�� ��ȯ�Ͻÿ�
 * 
 * Example 1:

Input: [3,1,2,4]
Output: [2,4,3,1]
The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
 * */

class Solution {
	public int[] sortArrayByParity(int[] A) {
		int[] result = new int[A.length];
		int index = 0;
		for (int i = 0; i < A.length; i++) {
			if (A[i] % 2 == 0) {
				result[index] = A[i];
				index++;
			}
		}
		for (int i = 0; i < A.length; i++) {
			if (A[i] % 2 == 1) {
				result[index] = A[i];
				index++;
			}
		}
		for(int i=0; i < result.length;i++) {
			System.out.println(result[i]);
		}
		return result;
	}
}

public class SortArrayByParity {
	public static void main(String[] args) {
		Solution st = new Solution();
		int[] A = {3,1,2,4};
		st.sortArrayByParity(A);
	}
}

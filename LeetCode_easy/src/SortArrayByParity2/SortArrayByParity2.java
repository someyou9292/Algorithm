package SortArrayByParity2;

import java.util.ArrayList;
import java.util.List;

/*
 	음수가 아닌 정수 배열이 주어지면
 	짝수 인덱스에는 짝수가, 홀수 인덱스에는 홀수가 배치되도록 정렬하시오
 	
Example 1:

Input: [4,2,5,7]
Output: [4,5,2,7]
Explanation: [4,7,2,5], [2,5,4,7], [2,7,4,5] would also have been accepted.
 * */

// 효율 97.71% good
class Solution {
	public int[] sortArrayByParityII(int[] A) {
		int[] result = new int[A.length];
		int index = 0;
		int odd_index = 1;
		int even_index = 0;

		for (int i = 0; i < A.length; i++) {
			if (A[i] % 2 == 0) {
				result[even_index] = A[i];
				even_index += 2;
			} else {
				result[odd_index] = A[i];
				odd_index += 2;
			}
		}

		return result;
	}
}

public class SortArrayByParity2 {
	public static void main(String[] args) {
		Solution st = new Solution();
		int[] A = {4,2,5,7,1,8};
		
		st.sortArrayByParityII(A);
	}
}

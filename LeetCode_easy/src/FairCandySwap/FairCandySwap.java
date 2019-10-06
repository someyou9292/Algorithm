package FairCandySwap;

import java.util.ArrayList;
import java.util.List;

/*
   Alice �� Bob �� �������� ������ �ֽ��ϴ�.
   A[i] �� Alice�� ������ �ִ� i ��° ������ ũ���̰�
   B[j] �� Bob�� ������ �ִ� j ��° ����ũ���Դϴ�.
   
   �� ���� ������ ������ ��ȯ�Ͽ� �� ���� �������⸦ ���մϴ�.
   ans[0] �� Alice�� ��ȯ�� �����̰� ans[1]�� Bob�� ��ȯ�� �����Դϴ�.
   ans �迭�� ���Ͻÿ�.
   
Example 1:
Input: A = [1,1], B = [2,2]
Output: [1,2]

Example 2:
Input: A = [1,2], B = [2,3]
Output: [1,2]

Example 3:
Input: A = [2], B = [1,3]
Output: [2,3]

Example 4:
Input: A = [1,2,5], B = [2,4]
Output: [5,4]
 * */


class Solution {
	public int[] fairCandySwap(int[] A, int[] B) {
		int[] ans = new int[2];

		int aSum = 0;
		int bSum = 0;
		int avg = 0;

		for (int i = 0; i < A.length; i++) {
			aSum += A[i];
		}
		for (int i = 0; i < B.length; i++) {
			bSum += B[i];
		}

		avg = (aSum + bSum) / 2;

		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < B.length; j++) {
				aSum = aSum - A[i] + B[j];
				if (aSum != avg) {
					aSum = aSum - B[j] + A[i];
				} else {
					ans[0] = A[i];
					ans[1] = B[j];
					System.out.println(ans[0]);
					System.out.println(ans[1]);
					return ans;
				}
			}
		}
		return ans;
	}
}

public class FairCandySwap {
	public static void main(String[] args) {
		Solution st = new Solution();
		int[] A = { 1, 2, 5 };
		int[] B = { 2, 4 };

		st.fairCandySwap(A, B);
	}
}

//  ȿ�� 20.56%  
//class Solution {
//	public int[] fairCandySwap(int[] A, int[] B) {
//		int[] ans = new int[2];
//
//		int aSum = 0;
//		int bSum = 0;
//		int avg = 0;
//
//		for (int i = 0; i < A.length; i++) {
//			aSum += A[i];
//		}
//		for (int i = 0; i < B.length; i++) {
//			bSum += B[i];
//		}
//
//		avg = (aSum + bSum) / 2;
//
//		for (int i = 0; i < A.length; i++) {
//			for (int j = 0; j < B.length; j++) {
//				aSum = aSum - A[i] + B[j];
//				if (aSum != avg) {
//					aSum = aSum - B[j] + A[i];
//				} else {
//					ans[0] = A[i];
//					ans[1] = B[j];
//					System.out.println(ans[0]);
//					System.out.println(ans[1]);
//					return ans;
//				}
//			}
//		}
//		return ans;
//	}
//}



// ȿ�� 5.05% 
//class Solution {
//	public int[] fairCandySwap(int[] A, int[] B) {
//		int[] ans = new int[2];
//		List list = new ArrayList();
//		
//		int aSum = 0;
//		int bSum = 0;
//
//		for (int i = 0; i < A.length + B.length; i++) {
//			if (i < A.length) {
//				aSum += A[i];
//			} else {
//				bSum += B[i - A.length];
//				list.add(B[i-A.length]);
//			}
//		}
//
//		int avg = (aSum + bSum) / 2;
//		int aDelta;
//		int bDelta;
//		
//		if(aSum < avg) {
//			aDelta = avg - aSum;
//			for(int i=0; i<A.length;i++) {
//				if(list.contains(A[i] + aDelta)) {
//					ans[0] = A[i];
//					ans[1] = A[i] + aDelta;
//				}
//			}
//		}else {
//			aDelta = aSum - avg;
//			for(int i=0; i<A.length;i++) {
//				if(list.contains(A[i] - aDelta)) {
//					ans[0] = A[i];
//					ans[1] = A[i] - aDelta;				
//				}
//			}
//		}
//		
//		return ans;
//	}
//}

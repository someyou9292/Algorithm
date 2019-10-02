package CountingBits;

/*
 ������ �ƴ� num ������ ������ 2������ �ٲپ��� �� 1�� ������ �迭�� ��ȯ�Ͻÿ�
 
Input: 5
Output: [0,1,1,2,1,2]
0 -> 0
1 -> 1
2 -> 10
3 -> 11
4 -> 100
5 -> 101
output -> [0, 1, 1, 2, 1, 1]
 * */

// solution    ¾��..
class Solution {
	public int[] countBits(int num) {

		if (num == 0) {
			return new int[] { 0 };
		} else if (num == 1) {
			return new int[] { 0, 1 };
		}

		int[] result = new int[num + 1];

		result[0] = 0;
		result[1] = 1;

		for (int i = 2; i <= num; i++) {
			System.out.println(result[i >> 1]);
			result[i] = result[i >> 1] + (i % 2 == 0 ? 0 : 1);
		}

		return result;
	}
}

public class CountingBits {
	public static void main(String[] args) {
		Solution st = new Solution();
		int num = 5;

		st.countBits(num);
	}
}

// ȿ�� 15.49    �� �� ��
//class Solution {
//	public int[] countBits(int num) {
//		int[] result = new int[num + 1];
//		String[] binaryNumber = new String[num + 1];
//		
//		int count = 0;
//		
//		for (int i = 0; i <= num; i++) {
//			int mok = i;
//			while (mok != 0) {
//				int remind = mok % 2;
//				mok = mok / 2 ;
//				if(remind == 1) {
//					count++;
//				}
//			}
//			result[i] = count;
//			count = 0;
//		}
//		
//		return result;
//	}
//}

//	ȿ�� 5.44%	�� �� �� ��
//class Solution {
//	public int[] countBits(int num) {
//		int[] result = new int[num + 1];
//		String[] binaryNumber = new String[num + 1];
//
//		for (int i = 0; i <= num; i++) {
//			binaryNumber[i] = Integer.toBinaryString(i);
//		}
//		int count = 0;
//		for (int i = 0; i <= num; i++) {
//			for (int j = 0; j < binaryNumber[i].length(); j++) {
//				if (binaryNumber[i].charAt(j) == '1') {
//					count++;
//				}
//			}
//			result[i] = count;
//			count = 0;
//		}
//
//		return result;
//	}
//}

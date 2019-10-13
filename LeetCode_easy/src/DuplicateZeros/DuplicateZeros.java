package DuplicateZeros;

/*
 ���� ���� �迭 arr�� �־������� 0�� �ִٸ� 0�� �����Ͽ� �ڷ� ���̰� �� ��Ҵ� ��ĭ�� �ڷ� ���ϴ�.
 �ش� �迭�� �����ϴ� �Լ��� �ۼ��Ͻÿ�
 �Է� : [1,0,2,3,0,4,5,0]
��� : null
���� : �Լ��� ȣ�� �� �� �Է� �迭�� [1,0,0,2,3,0,0,4]�� �����˴ϴ�.
 * */

// ȿ�� 95.16% ��
class Solution {
	public void duplicateZeros(int[] arr) {
		int[] replace = new int[arr.length];

		int replaceIndex = 0;
		int index = 0;

		while (replaceIndex != replace.length) {
			if (arr[index] == 0) {
				replace[replaceIndex++] = arr[index];
				if (replaceIndex == replace.length) {
					break;
				}
				replace[replaceIndex++] = arr[index];
				index++;
			} else {
				replace[replaceIndex] = arr[index];
				replaceIndex++;
				index++;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			arr[i] = replace[i];
		}
	}
}

public class DuplicateZeros {
	public static void main(String[] args) {
		Solution st = new Solution();
		int[] arr = { 0, 0, 0, 0, 0, 0, 0 };
		st.duplicateZeros(arr);
	}
}

// ȿ�� 31.22%   ���� �ø���
//class Solution {
//	public void duplicateZeros(int[] arr) {
//		for (int i = 0; i < arr.length; i++) {
//			int index = arr.length - 1;
//			if (arr[i] == 0) {
//				while (index != i) {
//					arr[index] = arr[index - 1];
//					index--;
//				}
//				i++;
//			}
//		}
//		
//	}
//}

//  ȿ�� 12.18% ;;; �� �ø���
//class Solution {
//	public void duplicateZeros(int[] arr) {
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] == 0) {
//				for (int j = arr.length - 1; j > i; j--) {
//					arr[j] = arr[j - 1];
//				}
//				i++;
//			}
//		}
//	}
//}

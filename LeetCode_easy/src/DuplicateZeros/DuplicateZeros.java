package DuplicateZeros;

/*
 고정 길이 배열 arr가 주어졌을때 0이 있다면 0을 복사하여 뒤로 붙이고 각 요소는 한칸씩 뒤로 뺍니다.
 해당 배열을 수정하는 함수를 작성하시오
 입력 : [1,0,2,3,0,4,5,0]
출력 : null
설명 : 함수를 호출 한 후 입력 배열이 [1,0,0,2,3,0,0,4]로 수정됩니다.
 * */

// 효율 95.16% 굳
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

// 효율 31.22%   좀더 올리자
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

//  효율 12.18% ;;; 더 올리자
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

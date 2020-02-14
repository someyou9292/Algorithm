package easy_1002_FindComminCharacters;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 leetcode 1002�� ����
 ���� ���� �ݺ��Ǵ� ���ڸ� �����Ͻÿ�.
 
Input: ["bella","label","roller"]
Output: ["e","l","l"]

Input: ["cool","lock","cook"]
Output: ["c","o"]
 * */
class Solution {
	public List<String> commonChars(String[] A) {
		List<String> answer = new ArrayList<String>();

		int[] arr = new int[26];
		Arrays.fill(arr, Integer.MAX_VALUE);

		for (int i = 0; i < A.length; i++) {
			int[] count = new int[26];
			for (int j = 0; j < A[i].length(); j++) {
				count[A[i].charAt(j) - 'a']++;
			}

			for (int k = 0; k < arr.length; k++) {
				arr[k] = Math.min(arr[k], count[k]);
			}
		}

		
		for(int i=0; i<arr.length;i++) {
			while(arr[i]!=0) {
				answer.add(String.valueOf((char)(i+'a')));
				arr[i]--;
			}
		}
		
		return answer;
	}
}

public class Main {
	public static void main(String[] args) {
		Solution st = new Solution();
		String[] A = { "bella", "label", "roller" };

		st.commonChars(A);
	}
}

// ȿ�� 33.84%
//class Solution {
//	public List<String> commonChars(String[] A) {
//		List<String> answer = new ArrayList<String>();
//
//		List<int[]> list = new ArrayList<int[]>();
//		int[] alphabet = new int[26];
//		Arrays.fill(alphabet, Integer.MAX_VALUE);
//
//		for (int i = 0; i < A.length; i++) {
//			int[] arr = new int[26];
//
//			// �� ���ڿ��� ���ĺ��� ���� �迭�� ���� �� List�� �迭�� ����
//			for (int j = 0; j < A[i].length(); j++) {
//				arr[A[i].charAt(j) - 'a']++;
//			}
//			
//			list.add(arr);
//		}
//
//		// �� ���ĺ��� �ּҰ����� alphabet �迭�� ����.
//		for (int i = 0; i < list.size(); i++) {
//			for (int j = 0; j < 26; j++) {
//				alphabet[j] = Math.min(alphabet[j], list.get(i)[j]);
//			}
//		}
//		
//		for (int i = 0; i < 26; i++) {
//			while (alphabet[i] != 0) {
//				answer.add(String.valueOf((char) (i + 'a')));
//				alphabet[i]--;
//			}
//		}
//		
//		return answer;
//	}
//}

package RelativeSortArray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/*
 arr1 �� arr2 �� �־����ϴ�. arr2 �� ��� ��Ҵ� arr1 �� ���ԵǾ��ֽ��ϴ�.
 arr2 �� ����� ������� arr1�� �����ϰ� arr2�� �ش����� �ʴ� ���ҵ��� ������������ �����մϴ�.
 
 Example 1:
Input: arr1 = [2,3,1,3,2,4,6,7,9,2,19], arr2 = [2,1,4,3,9,6]
Output: [2,2,2,1,4,3,3,9,6,7,19]
 * */

// ȿ�� 13% ���ø���
class Solution {
	public int[] relativeSortArray(int[] arr1, int[] arr2) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		List remain = new ArrayList();
		int[] result = new int[arr1.length];

		for (int i = 0; i < arr2.length; i++) {
			if (!map.containsKey(arr2[i])) {
				map.put(arr2[i], arr2[i]);
			}
		}

		for (int i = 0; i < arr1.length; i++) {
			if (map.containsKey(arr1[i])) {
				continue;
			} else {
				remain.add(arr1[i]);
			}
		}

		Collections.sort(remain);

		int index = 0;
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr1.length; j++) {
				if(arr2[i] == arr1[j]) {
					result[index] = arr1[j];
					index++;
				}
			}
		}
		
		for(int i=index; i < arr1.length;i++) {
			result[i] = (int)remain.get(i-index);
		}

		for(int i=0; i < result.length;i++) {
			System.out.println(result[i]);
		}
		return result;
	}
}

public class RelativeSortArray {
	public static void main(String[] args) {
		Solution st = new Solution();
		int[] arr1 = { 2, 21, 43, 38, 0, 42, 33, 7, 24, 13, 12, 27, 12, 24, 5, 23, 29, 48, 30, 31 };
		int[] arr2 = { 2, 42, 38, 0, 43, 21 };


		st.relativeSortArray(arr1, arr2);
	}
}



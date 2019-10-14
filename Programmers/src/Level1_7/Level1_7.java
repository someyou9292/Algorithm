package Level1_7;

import java.util.ArrayList;
import java.util.List;

class Solution {
	public int[] solution(int[] arr) {
		List<Integer> list = new ArrayList();

		list.add(arr[0]);
		int index = 0;
		for(int i=1; i<arr.length;i++) {
			if(list.get(index) != arr[i]) {
				list.add(arr[i]);
				index++;
			}
		}
		
		int[] answer = new int[list.size()];

		for (int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
		}	
		
		for(int num : list) {
			System.out.println(num);
		}

		return answer;
	}
}

public class Level1_7 {
	public static void main(String[] args) {
//		int[] arr = { 1, 1, 3, 3, 0, 1, 1 };
		int[] arr = { 4, 4, 4 };
		Solution st = new Solution();
		st.solution(arr);
	}
}

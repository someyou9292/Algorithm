package Level1_arrayDivisor;

import java.util.Arrays;

class Solution {
	public int[] solution(int[] arr, int divisor) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % divisor == 0) {
				count++;
			}
		}

		if (count == 0) {
			int[] answer = new int[1];
			answer[0] = -1;
			return answer;
		}

		int[] answer = new int[count];
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % divisor == 0) {
				answer[index] = arr[i];
				index++;
			}
		}
		
		int temp;
		for(int i = 0 ; i < answer.length ; i ++) {
			for(int j = 0 ; j < answer.length -i -1 ; j ++) {
				if(answer[j]>answer[j+1]) {
					temp = answer[j];
					answer[j] = answer[j+1];
					answer[j+1] = temp;
				}
			}
		}

		for(int i=0; i<answer.length;i++) {
			System.out.println(answer[i]);
		}
		
		return answer;
	}
}

public class arrayDivisor {
	public static void main(String[] args) {
		Solution st = new Solution();
		int[] arr = {2,36,1,3};
		int divisor = 1;
		
		st.solution(arr, divisor);
	}
}

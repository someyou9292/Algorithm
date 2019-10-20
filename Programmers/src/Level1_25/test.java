package Level1_25;

class Solution {
	public int[] solution(int[] arr) {
		
		if(arr.length == 1) {
//			int[] answer = {-1};
//			return answer;
			return new int[]{ -1 };
		}
		
		int[] answer = new int[arr.length-1];
		int min = arr[0];
		
		for(int i=1; i<arr.length;i++) {
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		
		int index = 0;
		for(int i=0; i < arr.length;i++) {
			if(arr[i] == min) {
				continue;
			}
			answer[index] = arr[i];
			index++;
		}
		
		for (int num : answer) {
			System.out.println(num);
		}
		return answer;
	}
}

public class test {
	public static void main(String[] args) {
		Solution st = new Solution();
		int[] arr = {4,3,2,1};
		st.solution(arr);
	}
}

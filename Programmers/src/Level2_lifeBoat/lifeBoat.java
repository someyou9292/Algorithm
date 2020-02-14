package Level2_lifeBoat;

import java.util.Arrays;

class Solution {
	public int solution(int[] people, int limit) {
		int answer = 0;
		int l = 0;
		int r = people.length-1;
		
		Arrays.sort(people);
		
		while(l <= r) {
			if(people[l] + people[r] <= limit) {
				l++;
				r--;
			}else {
				r--;
			}
			answer++;
		}
		
		System.out.println(answer);
		
		return answer;
	}
}

public class lifeBoat {
	public static void main(String[] args) {
		Solution st = new Solution();
		int[] people = { 70, 50, 80 };
		int limit = 100;

		st.solution(people, limit);
	}
}

//	정확도는 100%, 효율에서 over함.
//class Solution {
//	public int solution(int[] people, int limit) {
//		int answer = 0;
//		Arrays.sort(people);
//
//		for (int i = people.length - 1; i >= 0; i--) {
//			int L = limit;
//			int count = 2;
//			if (people[i] == -1) {
//				continue;
//			}
//			L -= people[i];
//			people[i] = -1;
//			count--;
//			for (int j = i - 1; j >= 0; j--) {
//				if (L >= people[j] && people[j] != -1 && count !=0) {
//					L -= people[j];
//					people[j] = -1;
//					count--;
//				}
//			}
//			answer++;
//		}
//
//		return answer;
//	}
//}
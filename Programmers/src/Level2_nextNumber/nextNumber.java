package Level2_nextNumber;

import java.util.ArrayList;
import java.util.List;

class Solution {
	public List<Integer> Binary(int n) {
		List<Integer> list = new ArrayList<Integer>();
		while (n != 0) {
			list.add(n % 2);
			n /= 2;
		}

		return list;
	}

	public int countOne(List<Integer> list) {
		int result = 0;

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) == 1) {
				result++;
			}
		}

		return result;
	}

	public int solution(int n) {
		List<Integer> list = new ArrayList<Integer>();
		list = Binary(n);
		int countN = countOne(list);
		int nextNumber = n + 1;
		
		while (true) {
			List<Integer> next = new ArrayList<Integer>();
			next = Binary(nextNumber);
			int countNext = countOne(next);
			if (countNext == countN) {
				break;
			} else {
				nextNumber++;
			}
		}


		return nextNumber;
	}
}

public class nextNumber {
	public static void main(String[] args) {
		Solution st = new Solution();
		int n = 15;

		st.solution(n);
	}
}

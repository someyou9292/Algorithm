package Level1_23;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
	public long solution(long n) {
		long answer = 0;

		List<Long> list = new ArrayList();

		while (n != 0) {
			list.add(n % 10);
			n = n / 10;
		}

		Collections.sort(list);

		for (int i = list.size() - 1; i >= 0; i--) {
			answer = answer * 10 + list.get(i);
		}

		return answer;
	}
}

public class Level1_23 {
	public static void main(String[] args) {
		Solution st = new Solution();
		long n = 118372;

		st.solution(n);

	}
}

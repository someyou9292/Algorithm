package PowerfulIntegers;

import java.util.ArrayList;
import java.util.List;

class Solution {

	public int power(int n, int r) {
		int result = 1;
		if (r == 0) {
			return 1;
		} else {
			for (int i = 0; i < r; i++) {
				result = result * n;
			}
		}
		return result;
	}

	public List<Integer> powerfulIntegers(int x, int y, int bound) {
		List<Integer> list = new ArrayList<Integer>();
		int powX;
		int powY;

		for (int i = 0; (powX = power(x, i)) < bound; i++) {
			for (int j = 0; (powY = power(y, j)) + powX <= bound; j++) {
				if (!list.contains(powX + powY)) {
					list.add(powX + powY);
					if (y == 1)
						break;
				}
			}
			if (x == 1)
				break;
		}

		return list;
	}
}

public class PowerfulIntegers {
	public static void main(String[] args) {
		Solution st = new Solution();
		int x = 2;
		int y = 3;
		int bound = 10;

		System.out.print("°á°ú >> ");
		System.out.print(st.powerfulIntegers(x, y, bound) + " ");
		System.out.println();
	}
}

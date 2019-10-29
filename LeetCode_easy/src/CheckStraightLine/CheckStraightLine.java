package CheckStraightLine;

// 효율 100% 
class Solution {
	public boolean checkStraightLine(int[][] coordinates) {
		boolean isStraight = false;
		if (coordinates.length == 2) {
			return true;
		}

		double inclination = (double) (coordinates[1][1] - coordinates[0][1])
				/ (double) (coordinates[1][0] - coordinates[0][0]);

		for (int i = 1; i < coordinates.length; i++) {
			// 기울기
			if (inclination == (double) (coordinates[i][1] - coordinates[i - 1][1])
					/ (double) (coordinates[i][0] - coordinates[i - 1][0])) {
				isStraight = true;
			} else {
				return false;
			}

		}

		return isStraight;
	}
}

public class CheckStraightLine {
	public static void main(String[] args) {
		Solution st = new Solution();
		int[][] coordinates = { { 1, 2 }, { 2, 3 }, { 3, 4 }, { 4, 5 }, { 5, 6 }, { 6, 7 } };
		System.out.println(st.checkStraightLine(coordinates));
	}
}

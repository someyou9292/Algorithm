package medium_6_zigzagConversion;

import java.util.Arrays;

// leetcode 6 
// numRow에 따라서 zigzag 형태로 문자열을 저장 후 출력하시오.
//Example 1:
//
//Input: s = "PAYPALISHIRING", numRows = 3
//Output: "PAHNAPLSIIGYIR"
//P   A   H   N
//A P L S I I G
//Y   I   R

//Example 2:
//
//Input: s = "PAYPALISHIRING", numRows = 4
//Output: "PINALSIGYAHRPI"
//Explanation:
//
//P     I    N
//A   L S  I G
//Y A   H R
//P     I

class Solution {
	public String convert(String s, int numRows) {
		String answer = "";
		int numCols = s.length();
		char[][] arr = new char[numRows][numCols];
		int index = 0;
		int rowDown = 0;
		int rowUp = numRows - 1;
		int col = 0;
		if(numRows == 1) {
			return s;
		}
		for(char[] row : arr) {
			Arrays.fill(row, '*');
		}
			
			
		while (index < s.length()) {
			char c = s.charAt(index);
			if (rowDown < numRows) {
				arr[rowDown][col] = c;
				rowDown++;
			} else {
				if (rowUp >= 0) {
					col++;
					rowUp--;
					arr[rowUp][col] = c;
				}
			}

			if (rowDown == numRows && rowUp == 0) {
				rowDown = 1;
				rowUp = numRows - 1;
			}
			index++;
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
//				System.out.print(arr[i][j]);
				if (arr[i][j] != '*') {
					answer += arr[i][j];
				}
			}
//			System.out.println();
		}

		System.out.println(answer);

		return answer;
	}
}

public class Main {
	public static void main(String[] args) {
		Solution st = new Solution();
		String s = "ABCDEFGHIJKLMNO";
		int numRows = 6;

		st.convert(s, numRows);
	}
}

package easy_171_ExcelSheetColumnNumber;

// 26Áø¹ý
class Solution {
	public int titleToNumber(String s) {
		int result = 0;

		int alphabetPow = 1;

		for (int i = s.length()-1; i >= 0; i--) {
			char c = s.charAt(i);
			result += (c - 64) * alphabetPow;
			alphabetPow *= 26;
		}
		
		System.out.println(result);
		return result;
	}
}

public class ExcelSheet {
	public static void main(String[] args) {
		Solution st = new Solution();
		String s = "ZZZ";

		st.titleToNumber(s);
	}
}

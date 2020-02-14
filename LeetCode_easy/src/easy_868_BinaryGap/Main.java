package easy_868_BinaryGap;

class Solution {
	public int binaryGap(int N) {
		int max = 0;
		String biStr = Integer.toBinaryString(N);

		int pre_one = 0;
		int one = 0;
		for (int i = 0; i < biStr.length(); i++) {
			if (biStr.charAt(i) == '1') {
				one = i;
			}
			max = Math.max(max, one - pre_one);
			pre_one = one;
		}
		
		System.out.println(max);
		
		return max;
	}
}

public class Main {
	public static void main(String[] args) {
		Solution st = new Solution();
		int N = 6;

		st.binaryGap(N);
	}
}

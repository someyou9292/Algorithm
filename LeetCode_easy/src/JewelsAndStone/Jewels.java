package JewelsAndStone;

/*
 19.09.18
  보석을 의미하는 J 와 내가 소유하고 있는 돌 S
  내가 가진 돌 중에서 J에 해당하는 보석의 갯수를 구해라. (대소문자 구분)
Example 1:
Input: J = "aA", S = "aAAbbbb"
Output: 3

Example 2:
Input: J = "z", S = "ZZ"
Output: 0
 * */

class Solution {
	public int numJewelsInStones(String J, String S) {

		int jewelsCount = 0;

		char[] Jewels = new char[J.length()];
		char[] Stones = new char[S.length()];

		for (int i = 0; i < Jewels.length; i++) {
			Jewels[i] = J.charAt(i);
			for (int j = 0; j < Stones.length; j++) {
				Stones[j] = S.charAt(j);
				if (Jewels[i] == Stones[j]) {
					jewelsCount++;
				}
			}
		}

		return jewelsCount;
	}
}

public class Jewels {
	public static void main(String[] args) {
		Solution st = new Solution();
		String J = "aA";
		String S = "aAAbbbb";
		
		System.out.println(st.numJewelsInStones(J, S));
	}
}

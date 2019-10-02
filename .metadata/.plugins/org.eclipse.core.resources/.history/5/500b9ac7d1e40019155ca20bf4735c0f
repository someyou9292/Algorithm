package FirstUniqueCharacter;

import java.util.HashSet;

/*
  문자열이 주어지면 최초로 반복되지 않는 글자의 인덱스를 리턴
  없으면 -1 을 리턴
 ex1) 
 s = "leetcode"  -> l, t, c, o, d 가 유니크한데 이중 l의 인덱스가 제일 작으므로 0 반환
return 0.

ex2)
s = "loveleetcode",	-> v t c d  중 v 가 인덱스가 제일 작으므로 2반환
return 2.
 * */

// 똑똑한 사람들 뭐이리 많냐..
class Solution {
	public int firstUniqChar(String s) {
		int[] check = new int[26];
//		== int[] check = new int['z' - 'a' +1];

		char[] S = s.toCharArray();

		for (char c : S) {		// S 배열에 있는 값을 c 에 넣으면서 for문을 돌림
			check[c - 'a']++;	// check 배열에 해당 알파벳의 위치에 ++ 을 함
		}

		for (int i = 0; i < S.length; i++) {
			if(check[S[i] - 'a'] == 1) {	// check 배열에서 S[i] 의 알파벳위치값이 1이면 턴
				return i;
			}
		}
		return -1;
	}
}

public class FirstUniqueCh {
	public static void main(String[] args) {
		Solution st = new Solution();
		String s = "dabbcb";

		System.out.println(st.firstUniqChar(s));
	}
}

// 효율 45.12   그럭저럭.. 
//class Solution {
//	public int firstUniqChar(String s) {
//		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
//		int count = 0;
//		for (int i = 0; i < s.length(); i++) {
//			if (!map.containsKey(s.charAt(i))) {
//				count = 0;
//				map.put(s.charAt(i), count);
//			}else {
//				count++;
//				map.put(s.charAt(i), count);
//			}
//		}
//		for(int i=0; i<s.length();i++) {
//			if(map.get(s.charAt(i))==0) {
//				return i;
//			}
//		}
//		return -1;
//	}
//}
package DivisionofStrings;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/*
 
 Example 1:
Input: str1 = "ABCABC", str2 = "ABC"
Output: "ABC"

Example 2:
Input: str1 = "ABABAB", str2 = "ABAB"
Output: "AB"

Example 3:
Input: str1 = "LEET", str2 = "CODE"
Output: ""
 
 두 문자열의 공통된 가장 큰 문자열을 반환해라
 
 * */

class Solution {
	public String gcdOfStrings(String str1, String str2) {
		HashMap<Integer, String> result = new HashMap<Integer, String>();
		int keyResult = 0;
		String gcdStr = "";
		int minLength;

		if (str1.length() <= str2.length()) {
			minLength = str1.length();
		} else {
			minLength = str2.length();
		}

		for (int i = 0; i < minLength; i++) {
			if (str1.charAt(i) != str2.charAt(i)) {
				return "";
			} else if (str1.charAt(i) == str2.charAt(i)) {
				gcdStr += str1.charAt(i);
				keyResult++;
				result.put(keyResult, gcdStr);
			}
		}

		Set keyset = result.keySet();
		Iterator itr = keyset.iterator();
		while (itr.hasNext()) {
			int key = (int) itr.next();
			if (str1.length() % key == 0 && str2.length() % key == 0) {
				gcdStr = result.get(key);
			}
		}

		int index = 0;
		for (int i = 0; i < str1.length(); i++) {
			if(gcdStr.charAt(index) != str1.charAt(i)) {
				return "";
			}
			
			index++;
			
			if(index > gcdStr.length()-1) {
				index = 0;
			}
		}
		
		index = 0;
		
		for (int i = 0; i < str2.length(); i++) {
			if(gcdStr.charAt(index) != str2.charAt(i)) {
				return "";
			}
			
			index++;
			
			if(index > gcdStr.length()-1) {
				index = 0;
			}
		}

		return gcdStr;
	}
}

public class DivisionOfStrings {
	public static void main(String[] args) {
		Solution st = new Solution();
		String str1 = "ABC";
		String str2 = "ABCDEF";
		System.out.println(st.gcdOfStrings(str1, str2));
	}
}

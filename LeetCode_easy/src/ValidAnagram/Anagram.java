package ValidAnagram;

import java.util.Arrays;

/*
  s 와 t 가 아나그램관계이냐?
 * */

//class Solution {
//	public String sortStr(String str) {
//		char[] arr = str.toCharArray();
//		Arrays.sort(arr);
//		
//		return new StringBuilder(new String(arr)).toString();
//	}
//    public boolean isAnagram(String s, String t) {
//    	
//    	if(s.length() != t.length()) {
//    		return false;
//    	}
//    	
//    	String newS = sortStr(s);
//    	String newT = sortStr(t);
//    	
//    	System.out.println(newS);
//    	System.out.println(newT);
//    	
//    	for(int i=0; i<newS.length();i++) {
//    		if(newS.charAt(i) == newT.charAt(i)) {
//    			continue;
//    		}else {
//    			return false;
//    		}
//    	}
//    	
//    	return true;
//    }
//}

public class Anagram {
	public static void main(String[] args) {
		Solution st = new Solution();
		String s = "anagram";
		String t = "nagaram";

		System.out.println(st.isAnagram(s, t));
	}
}

//class Solution {
//	public boolean isAnagram(String s, String t) {
//		if (s.length() != t.length()) {
//			return false;
//		}
//		char[] str1 = s.toCharArray();
//		char[] str2 = t.toCharArray();
//		Arrays.sort(str1);
//		Arrays.sort(str2);
//		return Arrays.equals(str1, str2);
//	}
//}

class Solution {
	public boolean isAnagram(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}
		
		int[] arr = new int[26];
		
		for(int i = 0; i < s.length();i++) {
			arr[s.charAt(i) - 'a']++;
			arr[t.charAt(i) - 'a']--;
		}
		for(int i=0; i<arr.length;i++) {
			if(!(arr[i] %2 == 0 && arr[i] >=0)) {
				return false;
			}
		}
		
		return true;
	}
}

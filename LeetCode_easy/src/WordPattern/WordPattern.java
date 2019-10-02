package WordPattern;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/*
 
Example 1:
Input: pattern = "abba", str = "dog cat cat dog"
Output: true

Example 2:
Input:pattern = "abba", str = "dog cat cat fish"
Output: false

Example 3:
Input: pattern = "aaaa", str = "dog cat cat dog"
Output: false

Example 4:
Input: pattern = "abba", str = "dog dog dog dog"
Output: false
 * 패턴에 소문자 만 포함하고 str에는 단일 공백으로 구분할 수있는 소문자가 포함되어 있다고 가정 할 수 있습니다.
 * */

class Solution {
	public boolean wordPattern(String pattern, String str) {

		HashMap<Character, String> result = new HashMap<Character, String>();
		String[] strArr = str.split(" ");
		char[] patternArr = new char[pattern.length()];
		HashSet<Character> chSet = new HashSet<Character>();
		
		boolean flag = false;
		
		for (int i = 0; i < pattern.length(); i++) {
			chSet.add(pattern.charAt(i));
		}
		
		char[] patternCh = new char[chSet.size()];
		
		int count = 0;
		Iterator it = chSet.iterator();
		while (it.hasNext()) {
			patternCh[count] = (char) it.next();
			count++;
		}

		if(pattern.length() != strArr.length) {
			return false;
		}
		
		for (int i = 0; i < strArr.length; i++) {
			patternArr[i] = pattern.charAt(i);
			// key 가 없다면
			if (!result.containsKey(pattern.charAt(i))) {
				// hashmap에 저장
				result.put(pattern.charAt(i), strArr[i]);
			}
		}
		
		Iterator<Character> iteratork = result.keySet().iterator();
		while(iteratork.hasNext()) {
			Character key = iteratork.next();
			String value = result.get(key);
			System.out.println("key : " + key + "," + "value : " + value);
		}
		
		for(int i=0; i<result.size();i++) {
			for(int j=i+1; j<result.size();j++) {
				if(result.get(patternCh[i]).equals(result.get(patternCh[j]))) {
					return false;
				}
			}
		}
		
		for(int i=0; i< strArr.length;i++) {
			System.out.println(strArr[i]);
		}
		
		int ok = 0;
		for(int i=0; i<strArr.length;i++) {
//			System.out.println("result.get(patternArr[i])"+ result.get(patternArr[i]));
//			System.out.println("strArr[i]" + strArr[i]);
			if(strArr[i].equals(result.get(patternArr[i]))) {
				ok++;
//				flag = true;
			}else if(!strArr[i].equals(result.get(patternArr[i]))){
				System.out.println("result.get(patternArr[i])"+ result.get(patternArr[i]));
				System.out.println("strArr[i]" + strArr[i]);
//				flag = false;
			}
		}
			
		if(ok == strArr.length) {
			flag = true;
		}else
			flag= false;

		return flag;
	}
}

public class WordPattern {
	public static void main(String[] args) {
		Solution st = new Solution();

		String pattern = "aaaa";
		String str = "dog cat cat dog";
		System.out.println(st.wordPattern(pattern, str));
//		st.wordPattern(pattern, str);
	}
}

package LongestCommonPrefix;
/*
 Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

ex1)
Input: ["flower","flow","flight"]
Output: "fl"

ex2)
Input: ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.

* All given inputs are in lowercase letters a-z.
 */

class Solution {
	public String longestCommonPrefix(String[] strs) {
		// 1. 배열의 원소에서 길이가 가장 작은 문자를 찾아 MAX 범위로 설정
		// 2. index < MAX범위 까지 각 배열의 원소들을 비교하면서 공통된 문자 찾아 저장

		int minCharLength = Integer.MAX_VALUE;
		int charLength = 0;
		int index = 0;
		String result ="";
		
		if(strs.length==1)
			return strs[0];
		
		for (int i = 0; i < strs.length; i++) {
			charLength = strs[i].length();
			if (minCharLength >= charLength) {
				minCharLength = charLength;
			}
		}

		for (int i = 0; i < minCharLength; i++) {
			index++;
			for (int j = 1; j < strs.length; j++) {
				if(!strs[0].substring(0,index).equals(strs[j].substring(0,index))) {
					index--;
				}
				if(strs[0].substring(0,index).equals(strs[j].substring(0,index))) {
					result = strs[0].substring(0, index);
				}
			}
		}
		
		if(result == "") {
			return "";
		}

		return result;
	}
}

public class prefix {
	public static void main(String[] args) {
		String[] arr1 = {"flower","flow","flight"};
		String[] arr2 = {"dog","racecar","car"};
		Solution st = new Solution();
		
		System.out.println(st.longestCommonPrefix(arr1));
		
	}

}

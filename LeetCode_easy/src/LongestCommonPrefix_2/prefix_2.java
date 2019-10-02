package LongestCommonPrefix_2;
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
		
		if(strs.length==0)
			return "";

		String prefix = strs[0];

		for(int i = 0; i<strs.length;i++) {
			while(strs[i].indexOf(prefix)!=0) {
				prefix = prefix.substring(0, prefix.length()-1);
				if(prefix.isEmpty()) {
					return "";
				}
			}
		}
		
		return prefix;
	}
}

public class prefix_2 {
	public static void main(String[] args) {
		String[] arr1 = {"flower","flow","flight"};
		String[] arr2 = {"dog","racecar","car"};
		Solution st = new Solution();
		
		System.out.println(st.longestCommonPrefix(arr1));
		
	}

}

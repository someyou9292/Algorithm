package medium_3_LongestSubsring;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Leetcode medium 3��

// ���ڿ��� �κ� ���ڿ� �߿��� �ݺ����� �ʴ� ���� �� ���� �� �κ� ���ڿ��� ���̸� ���ض�.
//Example 1:
//
//Input: "abcabcbb"
//Output: 3 
//Explanation: The answer is "abc", with the length of 3. 
//Example 2:
//
//Input: "bbbbb"
//Output: 1
//Explanation: The answer is "b", with the length of 1.
//Example 3:
//
//Input: "pwwkew"
//Output: 3
//Explanation: The answer is "wke", with the length of 3. 
//             Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
// ���� �� Ư�����ڵ� ���Ե˴ϴ�.

class Solution {
	public int lengthOfLongestSubstring(String s) {
		int answer = 0;
		int[] arr = new int[95]; // ���� ���� ~ ����
		
		for (int i = 0; i < s.length(); i++) {
			int len = 0;
			for (int j = i; j < s.length(); j++) {
				int c = s.charAt(j) - ' ';
				arr[c]++;
				
				if(arr[c] > 1) {
					if(answer < len) {
						answer = len;
					}
					Arrays.fill(arr, 0);
					break;
				}
				len++;
				
				if(j == s.length()-1) {
					if(answer < len) {
						answer = len;
						System.out.println(answer + "�����?");
						return answer;
					}
				}
			}
		}
		
		System.out.println(answer);
		
		return answer;
	}
}

public class Main {
	public static void main(String[] args) {
		Solution st = new Solution();
		String s = "!asd";

		st.lengthOfLongestSubstring(s);
	}
}

//	21.97%
//class Solution {
//	public int lengthOfLongestSubstring(String s) {
//		int answer = 0;
//		int[] arr = new int[95]; // ���� ���� ~ ����
//		
//		for (int i = 0; i < s.length(); i++) {
//			int len = 0;
//			for (int j = i; j < s.length(); j++) {
//				int c = s.charAt(j) - ' ';
//				arr[c]++;
//				
//				if(arr[c] > 1) {
//					if(answer < len) {
//						answer = len;
//					}
//					Arrays.fill(arr, 0);
//					break;
//				}
//				len++;
//				
//				if(j == s.length()-1) {
//					if(answer < len) {
//						answer = len;
//						System.out.println(answer + "�����?");
//						return answer;
//					}
//				}
//			}
//		}
//		
//		System.out.println(answer);
//		
//		return answer;
//	}
//}
//	5%.. 
//class Solution {
//	public int lengthOfLongestSubstring(String s) {
//		int answer = 0;
//		List<Character> list = new ArrayList<Character>();
//		
//		if(s.length()==0) {
//			return 0;
//		}
//		if (s.charAt(0) == ' ') {
//			System.out.println(1);
//			return 1;
//		}
//
//		for (int i = 0; i < s.length(); i++) {
//			int len = 0;
//			for (int j = i; j < s.length(); j++) {
//				char c = s.charAt(j);
//				if (!list.contains(c)) {
//					list.add(c);
//					len++;
//					if(j == s.length()-1 && answer < len) {
//						answer = len;
//						System.out.println(answer);
//						return answer;
//					}
//				} else if (list.contains(c)) {
//					list.removeAll(list);
//					if (answer < len) {
//						answer = len;
//					}
//					break;
//				}
//			}
//		}
//
//		System.out.println(answer);
//
//		return answer;
//	}
//}
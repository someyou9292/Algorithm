package Level3_longestPalindrome;

//class Solution {
//	public int solution(String s) {
//		// ���� �� �κ� ���ڿ����� �ϳ��� �ٿ����� �˻�
//	    for (int answer = s.length(); answer > 1; answer--) {
//	        int start = 0;
//	        int end = 0 + answer - 1;
//	        
//	        while (end < s.length()) {
//	            if (isPalindrome(s, start, end)) {
//	            	System.out.println(answer);
//	                return answer;
//	            }
//	            
//	            start++;		// �κ� ���ڿ��� ���� �����ε����� 1����
//	            end++;			// �κ� ���ڿ��� �� ���� �ε����� 1����
//	        }
//	    }
//	    
//	    return 1;
//	}
//	 
//	private boolean isPalindrome(String s, int start, int end) {
//	    int diffBy2 = (end - start + 1) / 2 - 1;		// �߰� �ε���
//	    
//	    for (int i = 0; i <= diffBy2; i++) {		// �κ� ���ڿ��� �߰� �ε������� �ݺ�
//	        char c1 = s.charAt(start + i);
//	        char c2 = s.charAt(end - i);
//	        
//	        if (c1 != c2) {
//	            return false;
//	        }
//	    }
//	    
//	    return true;
//	}
//}

import java.util.ArrayList;
import java.util.List;

class Solution {

	public List<String> comb(List<String> resultList, char[] arr, boolean[] visited, int depth, int n, int r) { // nCr
		if (r == 0) {
			resultList.add(Sum(arr, visited, n));
			return resultList;
		}
		if (depth == n) {
			return resultList;
		} else {
			visited[depth] = true;
			comb(resultList, arr, visited, depth + 1, n, r - 1);
			visited[depth] = false;
			comb(resultList, arr, visited, depth + 1, n, r);
		}
		return resultList;
	}

	static String Sum(char[] arr, boolean[] visited, int n) {
		String result = "";
		for (int i = 0; i < n; i++) {
			if (visited[i] == true) {
				result += arr[i];
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println();
		System.out.println("�� ��� > " + result);

		return result;
	}

	public boolean isPalindrome(List<String> list, int index) {

		for (int i = 0, j = list.get(index).length() - 1; i < list.get(index).length(); i++, j--) {
			if (list.get(index).length() % 2 == 0) {
				if (list.get(index).charAt(i) == list.get(index).charAt(j)) {
					continue;
				} else {
					return false;
				}
			} else {
				if (i != list.get(index).length() / 2) {
					if (list.get(index).charAt(i) == list.get(index).charAt(j)) {
						continue;
					} else {
						return false;
					}
				}
			}
		}

		return true;
	}

	public int solution(String s) {
		int answer = 0;
		List<String> list = new ArrayList<String>();
		char[] arr = s.toCharArray();
		boolean[] visited = new boolean[arr.length];

		for (int i = 1; i <= arr.length; i++) {
			comb(list, arr, visited, 0, arr.length, i);
		}
		
		int max = 0;
		for(int i=0; i<list.size();i++) {
			if(isPalindrome(list, i) == true) {
				if(max < list.get(i).length()) {
					max = list.get(i).length();
				}
			}
		}
		
		System.out.println(max);
		return answer;
	}
}

public class Main {
	public static void main(String[] args) {
		Solution st = new Solution();
		String s = "aaABCCBA";

		st.solution(s);
	}
}

//	��Ȯ�� 100 / ȿ������ fail
//class Solution {
//	public int solution(String s) {
//		int answer = 0;
//
//		for (int i = 0; i < s.length(); i++) {
//			for (int j = i + 1; j <= s.length(); j++) {
//				String subString = s.substring(i, j);
//				String reverse = new StringBuffer(subString).reverse().toString();
//
//				if (subString.equals(reverse) && subString.length() > answer) {
//					answer = subString.length();
//				}
//			}
//		}
//
//		System.out.println(answer);
//		return answer;
//	}
//}

// �ð��ʰ�...��
//import java.util.ArrayList;
//import java.util.List;
//
//class Solution {
//
//	public List<String> comb(List<String> resultList, char[] arr, boolean[] visited, int depth, int n, int r) { // nCr
//		if (r == 0) {
//			resultList.add(Sum(arr, visited, n));
//			return resultList;
//		}
//		if (depth == n) {
//			return resultList;
//		} else {
//			visited[depth] = true;
//			comb(resultList, arr, visited, depth + 1, n, r - 1);
//			visited[depth] = false;
//			comb(resultList, arr, visited, depth + 1, n, r);
//		}
//		return resultList;
//	}
//
//	static String Sum(char[] arr, boolean[] visited, int n) {
//		String result = "";
//		for (int i = 0; i < n; i++) {
//			if (visited[i] == true) {
//				result += arr[i];
////				System.out.print(arr[i] + " ");
//			}
//		}
////		System.out.println();
////		System.out.println("�� ��� > " + result);
//
//		return result;
//	}
//
//	public boolean isPalindrome(List<String> list, int index) {
//
//		for (int i = 0, j = list.get(index).length() - 1; i < list.get(index).length(); i++, j--) {
//			if (list.get(index).length() % 2 == 0) {
//				if (list.get(index).charAt(i) == list.get(index).charAt(j)) {
//					continue;
//				} else {
//					return false;
//				}
//			} else {
//				if (i != list.get(index).length() / 2) {
//					if (list.get(index).charAt(i) == list.get(index).charAt(j)) {
//						continue;
//					} else {
//						return false;
//					}
//				}
//			}
//		}
//
//		return true;
//	}
//
//	public int solution(String s) {
//		int answer = 0;
//		List<String> list = new ArrayList<String>();
//		char[] arr = s.toCharArray();
//		boolean[] visited = new boolean[arr.length];
//
//		for (int i = 1; i <= arr.length; i++) {
//			comb(list, arr, visited, 0, arr.length, i);
//		}
//		
//		int max = 0;
//		for(int i=0; i<list.size();i++) {
//			if(isPalindrome(list, i) == true) {
//				if(max < list.get(i).length()) {
//					max = list.get(i).length();
//				}
//			}
//		}
//		
//		System.out.println(max);
//		return answer;
//	}
//}

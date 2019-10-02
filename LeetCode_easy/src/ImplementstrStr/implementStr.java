package ImplementstrStr;

/*
 19.9.17
 
 String haystack�� String needle �� �ִٸ� needle�� ���� �ε����� ��ȯ
 ���ٸ� -1�� ��ȯ
 
 * */

class Solution {
    public int strStr(String haystack, String needle) {
        
    	if(haystack.contains(needle)) {
    		return haystack.indexOf(needle);
    	}	
    	return -1;
    }
}

public class implementStr {
	public static void main(String[] args) {
		Solution st = new Solution();
		String haystack = "abcdefg";
		String needle = "acde";
		
		System.out.println(st.strStr(haystack, needle));
	}
}

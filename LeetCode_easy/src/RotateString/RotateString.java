package RotateString;

import java.util.Stack;

/*
 String 을 로테이트 해서 일치가 되면 true
 아니면 fasle 를 반환해라.
 * */

//class Solution {
//	public String rotate(String str) {
//		String result = "";
//		for (int i = 1; i < str.length(); i++) {
//			result += str.charAt(i);
//		}
//		return 	result += str.charAt(0);
//	}
//	public boolean rotateString(String A, String B) {
//		if (A.length() != B.length()) {
//			return false;
//		}else if(A.length() == 0 && B.length()==0) {
//			return true;
//		}
//		
//		String rotateA = A;
//		
//		for(int i=0; i<A.length();i++) {
//			rotateA = rotate(rotateA);
//			if(rotateA.equals(B)) {
//				return true;
//			}
//		}
//		
//		return false;
//	}
//}

class Solution {
    public boolean rotateString(String A, String B) {
        if (A.length() != B.length())
            return false;
        if (A.length() == 0)
            return true;

        search:
            for (int s = 0; s < A.length(); ++s) {
                for (int i = 0; i < A.length(); ++i) {
                	System.out.println("A >>> " + A.charAt((s+i) % A.length()));
                	System.out.println("B >>> " + B.charAt(i));
                    if (A.charAt((s+i) % A.length()) != B.charAt(i))
                        continue search;
                }
                return true;
            }
        return false;
    }
}

public class RotateString {
	public static void main(String[] args) {
		Solution st = new Solution();
		
		String A = "abcde";
		String B = "cdeab";
		System.out.println(st.rotateString(A, B));
	}
}


//class Solution {
//    public boolean rotateString(String A, String B) {
//        if (A.length() != B.length())
//            return false;
//        if (A.length() == 0)
//            return true;
//
//        search:
//            for (int s = 0; s < A.length(); ++s) {
//                for (int i = 0; i < A.length(); ++i) {
//                    if (A.charAt((s+i) % A.length()) != B.charAt(i))
//                        continue search;
//                }
//                return true;
//            }
//        return false;
//    }
//}
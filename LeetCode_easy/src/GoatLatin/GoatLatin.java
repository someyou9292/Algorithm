package GoatLatin;

import java.util.ArrayList;
import java.util.List;


// 효율 94.51% good
class Solution {
	public String toGoatLatin(String S) {

		String[] words = S.split(" ");
		String append = "maa";
		String result = "";
		for (int i = 0; i < words.length; i++) {
            
            if (i > 0) {
				result += " ";
			}
			char ch = words[i].charAt(0);
			switch (ch) {
			case 'a':
			case 'A':
			case 'e':
			case 'E':
			case 'u':
			case 'U':
			case 'o':
			case 'O':
			case 'i':
			case 'I':
				result += words[i] + append;
				append += 'a';
				break;
			default:
				if(words[i].length()==1) {
					result += words[i] + append;
                    append += 'a';
				}else {
					result += words[i].substring(1,words[i].length()-1) + words[i].charAt(words[i].length()-1) + words[i].charAt(0) + append;
					append += 'a';
                    
				}
				break;
			}
		}

		return result;
	}
}

public class GoatLatin {
	public static void main(String[] args) {
		Solution st = new Solution();
		String S = "HZ sg L";
		st.toGoatLatin(S);
	}
}

// 효율 28.30% 더 올리자
//class Solution {
//	public String toGoatLatin(String S) {
//
//		String[] words = S.split(" ");
//		String appendA = "maa";
//
//		for (int i = 0; i < words.length; i++) {
//			if (words[i].charAt(0) == 'a' || words[i].charAt(0) == 'e' || words[i].charAt(0) == 'i'
//					|| words[i].charAt(0) == 'o' || words[i].charAt(0) == 'u' || words[i].charAt(0) == 'A'
//					|| words[i].charAt(0) == 'E' || words[i].charAt(0) == 'I' || words[i].charAt(0) == 'O'
//					|| words[i].charAt(0) == 'U') {
//				words[i] += appendA;
//				appendA += 'a';
//				continue;
//			} else {
//				if (words[i].length() == 1) {
//					words[i] = words[i] + appendA;
//				} else {
//					String str = words[i].substring(1, words[i].length() - 1) + words[i].charAt(words[i].length() - 1);
//					str += words[i].charAt(0) + appendA;
//					words[i] = str;
//				}
//			}
//			appendA += 'a';
//		}
//
//		String result = "";
//		for (int i = 0; i < words.length - 1; i++) {
//			result += words[i] + " ";
//		}
//
//		result += words[words.length - 1];
//
//		System.out.println(result);
//
//		return result;
//	}
//}

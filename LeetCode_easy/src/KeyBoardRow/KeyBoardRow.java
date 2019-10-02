package KeyBoardRow;

import java.util.ArrayList;
import java.util.List;

/*
	문자열 배열이 주어지면 해당 단어들이 키보드의 한 줄로 완성할 수 있는 것을 반환해라
	
	
	Input: ["Hello", "Alaska", "Dad", "Peace"]
	Output: ["Alaska", "Dad"]
 * */

// 오우.. 세상 똑똑한 사람들 참 많다.
class Solution {
    //{a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z}
int[] keyrow = {2,3,3,2,1,2,2,2,1,2,2,2,3,3,1,1,1,1,2,1,1,3,1,3,1,3};
public String[] findWords(String[] words) {
List<String> list = new ArrayList<>();
for(int i=0;i<words.length;i++)
{
boolean flag= checkString(words[i]);
if(flag)
list.add(words[i]);
}
String[] result = new String[(list.size())];
int i=0;
for(String s:list)
result[i++]=s;
return result;
}

public boolean checkString(String word)
{
word = word.toLowerCase();
char[] alpha = word.toCharArray();
int row = keyrow[alpha[0]-'a'];
for(int i=1;i<alpha.length;i++)
{
if(row!=keyrow[alpha[i]-'a'])
    return false;  
}
return true;
}
}

public class KeyBoardRow {
	public static void main(String[] args) {
		Solution st = new Solution();
		String[] words = {"A", "B"};

		st.findWords(words);
	}
}


// 효율 74.18%    괜찮음.. 근데 코드가 그지.ㅋ
//class Solution {
//	public String[] findWords(String[] words) {
//		List<Character> firstLine = new ArrayList();
//		List<Character> secondLine = new ArrayList();
//		List<Character> thirdLine = new ArrayList();
//		List<String> result = new ArrayList();
//		boolean check = false;
//		firstLine.add('Q');
//		firstLine.add('q');
//		firstLine.add('W');
//		firstLine.add('w');
//		firstLine.add('E');
//		firstLine.add('e');
//		firstLine.add('R');
//		firstLine.add('r');
//		firstLine.add('T');
//		firstLine.add('t');
//		firstLine.add('Y');
//		firstLine.add('y');
//		firstLine.add('U');
//		firstLine.add('u');
//		firstLine.add('I');
//		firstLine.add('i');
//		firstLine.add('O');
//		firstLine.add('o');
//		firstLine.add('P');
//		firstLine.add('p');
//
//		secondLine.add('A');
//		secondLine.add('a');
//		secondLine.add('S');
//		secondLine.add('s');
//		secondLine.add('D');
//		secondLine.add('d');
//		secondLine.add('F');
//		secondLine.add('f');
//		secondLine.add('G');
//		secondLine.add('g');
//		secondLine.add('H');
//		secondLine.add('h');
//		secondLine.add('J');
//		secondLine.add('j');
//		secondLine.add('K');
//		secondLine.add('k');
//		secondLine.add('L');
//		secondLine.add('l');
//
//		thirdLine.add('Z');
//		thirdLine.add('z');
//		thirdLine.add('X');
//		thirdLine.add('x');
//		thirdLine.add('C');
//		thirdLine.add('c');
//		thirdLine.add('V');
//		thirdLine.add('v');
//		thirdLine.add('B');
//		thirdLine.add('b');
//		thirdLine.add('N');
//		thirdLine.add('n');
//		thirdLine.add('M');
//		thirdLine.add('m');
//
//		for (int i = 0; i < words.length; i++) {
//			char c = words[i].charAt(0);
//			check = false;
//			if(words[i].length() ==1) {
//				result.add(words[i]);
//			}
//			if (firstLine.contains(c)) {
//				for (int j = 1; j < words[i].length(); j++) {
//					if (!firstLine.contains(words[i].charAt(j))) {
//						check = false;
//						break;
//					} else {
//						check = true;
//						continue;
//					}
//				}
//				if (check == true) {
//					result.add(words[i]);
//				}
//			} else if (secondLine.contains(c)) {
//				for (int j = 1; j < words[i].length(); j++) {
//					if (!secondLine.contains(words[i].charAt(j))) {
//						check = false;
//						break;
//					} else {
//						check = true;
//						continue;
//					}
//				}
//				if (check == true) {
//					result.add(words[i]);
//				}
//			} else {
//				for (int j = 1; j < words[i].length(); j++) {
//					if (!thirdLine.contains(words[i].charAt(j))) {
//						check = false;
//						break;
//					} else {
//						check = true;
//						continue;
//					}
//				}
//				if (check == true) {
//					result.add(words[i]);
//				}
//			}
//		}
//
//
//		return result.toArray(new String[0]);
//	}
//}

package MorseCode_2;

import java.util.HashSet;
import java.util.Set;

/*
 a : ".-"		b : "-..."		c : "-.-."		d : "-.."
 e : "."		f : "..-."		g : "--."		h : "...."
 i : ".."		j : ".---"		k : "-.-"		l : ".-.."
 m : "--"		n : "-."		o : "---"		p : ".--."
 q : "--.-"		r : ".-."		s : "..."		t : "-"
 u : "..-"		v : "...-"		w : ".--"		x : "-..-"
 y : "-.--"		z : "--.."
 
 
Example:

Input: words = ["gin", "zen", "gig", "msg"]
Output: 2

Explanation: 
The transformation of each word is:
"gin" -> "--...-."
"zen" -> "--...-."
"gig" -> "--...--."
"msg" -> "--...--."

There are 2 different transformations, "--...-." and "--...--.".
 
 Input 이 주어지면 해당 Input 값에 맞는 Morse 부호로 바꾸고 모스부호의 수를 반환. (중복 x)
 * */
class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] MORSE = new String[]{".-","-...","-.-.","-..",".","..-.","--.",
                         "....","..",".---","-.-",".-..","--","-.",
                         "---",".--.","--.-",".-.","...","-","..-",
                         "...-",".--","-..-","-.--","--.."};

        Set<String> seen = new HashSet();
        for (String word: words) {
            StringBuilder code = new StringBuilder();
            for (char c: word.toCharArray())
                code.append(MORSE[c - 'a']);
            seen.add(code.toString());
        }

        return seen.size();
    }
}

public class MorseCode {
	public static void main(String[] args) {
		Solution st = new Solution();
		String[] words = {"vtpke","vngc","vnqr","gbzx","qvdx"};
		
		System.out.println(st.uniqueMorseRepresentations(words));
	}
}

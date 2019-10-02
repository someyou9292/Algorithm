package MorseCode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

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
		HashMap<Character, String> morseCode = new HashMap<Character, String>();
		HashSet morseSet = new HashSet();

		morseCode.put('a', ".-");
		morseCode.put('b', "-...");
		morseCode.put('c', "-.-.");
		morseCode.put('d', "-..");
		morseCode.put('e', ".");
		morseCode.put('f', "..-.");
		morseCode.put('g', "--.");
		morseCode.put('h', "....");
		morseCode.put('i', "..");
		morseCode.put('j', ".---");
		morseCode.put('k', "-.-");
		morseCode.put('l', ".-..");
		morseCode.put('m', "--");
		morseCode.put('n', "-.");
		morseCode.put('o', "---");
		morseCode.put('p', ".--.");
		morseCode.put('q', "--.-");
		morseCode.put('r', ".-.");
		morseCode.put('s', "...");
		morseCode.put('t', "-");
		morseCode.put('u', "..-");
		morseCode.put('v', "...-");
		morseCode.put('w', ".--");
		morseCode.put('x', "-..-");
		morseCode.put('y', "-.--");
		morseCode.put('z', "--..");

		for (int i = 0; i < words.length; i++) {
			String str = "";
			for(int j = 0; j < words[i].length();j++) {
				str += morseCode.get(words[i].charAt(j));
			}
			morseSet.add(str);
		}

		
		return morseSet.size();
	}
}
public class MorseCode {
	public static void main(String[] args) {
		Solution st = new Solution();
		String[] words = {"vtpke","vngc","vnqr","gbzx","qvdx"};
		
		System.out.println(st.uniqueMorseRepresentations(words));
	}
}

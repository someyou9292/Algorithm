package ValidParentheses;

import java.util.*;
/*
19.09.17
Description

* ��Ģ
���� ��ȣ�� ������ ������ ��ȣ�� �ݾƾ���
���� ��ȣ ������ ������ ������ ��ȣ�� �ݾƾ���
�� ���ڿ��� ��ȿ�� ������ ����

Example 1:				Example 2:
Input: "()"				Input: "()[]{}"
Output: true			Output: true

Example 3:				Example 4:
Input: "(]"				Input: "([)]"
Output: false			Output: false

Example 5:
Input: "{[]}"
Output: true
 * */

class Solution {
	private HashMap<Character, Character> mappings;
	
	// �ʱ�ȭ �۾�
	public Solution() {
		this.mappings = new HashMap<Character, Character>();
		this.mappings.put('(', ')');
		this.mappings.put('{', '}');
		this.mappings.put('[', ']');
	}
	public boolean isValid(String s) {
		Stack<Character> stack = new Stack<Character>();
		
		// �Է��� ������� ������ ���ؼ� �Ųٷ� ���ÿ� �ֱ� ����
		for(int i = s.length()-1; i >= 0; i--) {
			// �ؽ��ʿ� ���ԵǾ��ִ��� ���ϱ����� char�� ����.
			char c = s.charAt(i);
			
			// �ؽ��� mappins�� Ű�� c��( (,{,[ ) ���Ե��ִٸ�
			if(this.mappings.containsKey(c)) {
				// top �� ��������� '#' ���� ����, �ƴϸ� stack���� ���� ������ ����
				char top = stack.empty() ? '#' : stack.pop();
				
				// top�� ���� mappins���� ���� c�� ���� �ʴٸ� false
				if(top != this.mappings.get(c)) {
					return false;
				}
			}
			// �ؽ��� mappings�� c �� ���ԵǾ��ִٸ�
			else {
				// stack�� ����
				stack.push(c);
			}
		}
		
		// ���� ���ÿ� ���� �����ִٸ� false
		return stack.isEmpty();
	}
}
public class ValidParentheses {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		Solution st = new Solution();
		System.out.println(st.isValid(s));

	}
}

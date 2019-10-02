package reverseString;

class Solution {
	public void reverseString(char[] s) {
		int index = 0;

		char temp;
		
		for (int i = 0, j = s.length - 1; i < j ; i++, j--) {
			temp = s[i];
			s[i] = s[j];
			s[j] = temp;
		}
	}
}

public class reverseString {
	public static void main(String[] args) {
		Solution st = new Solution();
		char[] arr = { 'h', 'e', 'l', 'l', 'o' };
		st.reverseString(arr);
		
		for(int i=0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}

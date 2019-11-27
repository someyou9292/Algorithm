package Level2_phoneBook;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Solution {
	public boolean solution(String[] phone_book) {
		boolean answer = true;

		// 단어의 길이 순으로 정렬
		Arrays.sort(phone_book, new Comparator<String>() {
			public int compare(String s1, String s2) {
				return Integer.compare(s1.length(), s2.length());
			}
		});
		
		List<String> phoneBookList = new ArrayList<String>();
		phoneBookList.add(phone_book[0]);
		
		for(int i=1; i<phone_book.length;i++) {
			if(phone_book[i].indexOf(phoneBookList.get(0)) == 0) {
				System.out.println("false");
				return false;
			}else {
				phoneBookList.add(phone_book[i]);
			}
		}
		
		System.out.println(answer);
		
		return answer;
	}
}

public class phoneBook {
	public static void main(String[] args) {
		Solution st = new Solution();
		String[] phone_book = { "123", "456", "789" };

		st.solution(phone_book);
	}
}

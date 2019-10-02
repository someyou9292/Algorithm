package FizzBuzz;

import java.util.ArrayList;
import java.util.List;

/*
  3�� ����� Fizz, 5�ǹ���� Buzz, 15�� ����� FizzBuzz�� ����ض�
  Example:

n = 15,

Return:
[
    "1",
    "2",
    "Fizz",
    "4",
    "Buzz",
    "Fizz",
    "7",
    "8",
    "Fizz",
    "Buzz",
    "11",
    "Fizz",
    "13",
    "14",
    "FizzBuzz"
]
 * */

class Solution {
	public List<String> fizzBuzz(int n) {
		List<String> list = new ArrayList();

		for (int i = 1; i <= n; i++) {
			if(i % 15 == 0) {
				list.add("FizzBuzz");
			}else if(i % 5 == 0) {
				list.add("Buzz");
			}else if(i % 3 == 0) {
				list.add("Fizz");
			}else {
				list.add(i+"");
			}
		}
		
		for(int i=0; i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		return list;
	}
}

public class FizzBuzz {
	public static void main(String[] args) {
		Solution st = new Solution();
		int n = 30;
		
		st.fizzBuzz(n);
	}
}

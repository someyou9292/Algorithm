package Level1_22;

import java.util.ArrayList;
import java.util.List;

class Solution {
	  public int[] solution(long n) {
		  
		  /*
		   * �ڸ��� ���ϴ� ���� �����ϱ�
			String a = "" + n;
        	int[] answer = new int[a.length()];
		   * */
		  
	      List<Integer> list = new ArrayList();
	      
	      while(n !=0){
	          list.add((int) (n%10));
	          n /= 10;
	      }
	      int[] answer = new int[list.size()];
	      
	      for(int i=0; i<answer.length; i++){
	            answer[i] = list.get(i);
	      }
	      
	      for(int num : answer) {
	    	  System.out.println(num);
	      }
	      
	      return answer;
	  }
	}

public class test {
	public static void main(String[] args) {
		long n = 12345;
		Solution st = new Solution();
		st.solution(n);
	}
}

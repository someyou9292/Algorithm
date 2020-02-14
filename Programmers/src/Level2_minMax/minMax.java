package Level2_minMax;


class Solution {
	  public String solution(String s) {
	      String answer = "";
	      String[] arr= s.split(" ");
	      int min = Integer.MAX_VALUE;
	      int max = Integer.MIN_VALUE;
	      
	      for(int i=0; i<arr.length;i++) {
	    	  int n = Integer.parseInt(arr[i]);
	    	  
	    	  if(n >= max) {
	    		  max = n;
	    	  }
	    	  if(n <= min) {
	    		  min = n;
	    	  }
	      }
	      answer += ""  + min + " " + max;
	      return answer;
	  }
	}

public class minMax {
	public static void main(String[] args) {
		Solution st = new Solution();
		String s = "-1 -2 -3 -4";
		
		st.solution(s);
	}
}

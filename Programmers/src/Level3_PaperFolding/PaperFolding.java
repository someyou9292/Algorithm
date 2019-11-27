package Level3_PaperFolding;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int n) {
        int[] answer = new int[(int) Math.pow(2, n) - 1];
        List<Integer> pre_list = new ArrayList<Integer>();
        pre_list.add(0);
        int count = 1;

        while (count < n) {
            count++;
            List<Integer> new_list = new ArrayList<Integer>();
            int mid = pre_list.size();
            for (int i = 0; i < (int) Math.pow(2, count)-1; i++) {
                if (i < mid) {
                    new_list.add(pre_list.get(i));
                } else if (i > mid) {
                    if (pre_list.get(mid - 1) == 0) {
                        new_list.add(1);
                        mid--;
                    } else {
                        new_list.add(0);
                        mid--;
                    }
                } else {
                    new_list.add(0);
                }
            }
            pre_list = new_list;
        }

        for(int i=0;i<pre_list.size();i++){
            answer[i] = pre_list.get(i);
        }

        return answer;
    }
}

public class PaperFolding {
	public static void main(String[] args) {
		Solution st = new Solution();
		int n = 4;
		st.solution(n);
	}
}



// Àç±Í·Î Çª´Â ¹ı.   
//class Solution {
//
//  public int[] solution(int n) {
//
//      if(n == 1) return new int[]{0};
//        int tmp[] = solution(n - 1);
//        int answer[] = new int[tmp.length * 2 + 1];
//
//        for(int i = 0; i < answer.length; i++){
//            if(i < tmp.length) answer[i] = tmp[i];
//            else if(i == tmp.length) answer[i] = 0;
//            else answer[i] = tmp[answer.length - 1 - i] == 1 ? 0 : 1;
//        }
//
//        return answer;
//
//  }//end of solution
//
//}//end of Solution

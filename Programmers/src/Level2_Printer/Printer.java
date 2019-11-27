package Level2_Printer;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int[] priorities, int location) {
        Queue<Integer> prio_q = new LinkedList<Integer>();
        Queue<Integer> order_q = new LinkedList<Integer>();
        int[] sortedPriorities = new int[priorities.length];

        for (int i = 0; i < priorities.length; i++) {
            prio_q.add(priorities[i]);
            sortedPriorities[i] = priorities[i];
        }
        for(int i=0; i<priorities.length;i++){
            order_q.add(i);
        }

        Arrays.sort(sortedPriorities);
        int index = sortedPriorities.length-1;
        int count = 1;

        while (!prio_q.isEmpty()) {
            int prio_pop = prio_q.poll();
            int order_pop = order_q.poll();

            if(prio_q.size() == 0){
                System.out.print(prio_pop);
                return count;
            }

            if (prio_pop < sortedPriorities[index]) {
                prio_q.add(prio_pop);
                order_q.add(order_pop);
            } else {
                if(location == order_pop){
                    System.out.println("location"+ location + " >> "+count);
                    return count;
                }
                System.out.println(prio_pop);
                index--;
                count++;
            }
        }

        return count;
    }
}

public class Printer {
	public static void main(String[] args) {
        Solution st = new Solution();
        int[] priorities = {3,3,4,2};
        int location = 3;

        st.solution(priorities, location);
	}
}

package easy_989_AddToArrayFormOfInteger;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> addToArrayForm(int[] A, int K) {
        for(int i=A.length-1;i>=0&&K>0;i--){
            int tmp=A[i]+K;
            A[i]=tmp%10;
            K=tmp/10;
        }
        
        List<Integer> res=new ArrayList();
        while(K>0){
            res.add(0,K%10);
            K=K/10;
        }
        
        for(int num:A){
            res.add(num);
        }
        
        return res;
        
    }
}

public class Main {
	public static void main(String[] args) {
		Solution st = new Solution();
		int[] A = { 3,4,8,6};
		int K = 37;

		st.addToArrayForm(A, K);
	}
}

//	31.5%
//class Solution {
//	public List<Integer> cal(List<Integer> list, Stack<Integer> minStack, Stack<Integer> maxStack) {
//
//		int result = 0;
//		int carry = 0;
//		int min = 0;
//		int max = 0;
//		while (!maxStack.isEmpty()) {
//			max = maxStack.pop();
//			if (!minStack.isEmpty()) {
//				min = minStack.pop();
//			}
//
//			result = max + min + carry;
//			carry = 0;
//
//			if (result > 9) {
//				carry = 1;
//				result %= 10;
//			}
//			
//			if(maxStack.size() == 0 && carry != 0) {
//				list.add(result);
//				list.add(carry);
//			}else {
//				list.add(result);
//			}
//			min = 0;
//			max = 0;
//			result = 0;
//		}
//
//		return list;
//	}
//
//	public List<Integer> addToArrayForm(int[] A, int K) {
//		List<Integer> list = new ArrayList<Integer>();
//		Stack<Integer> A_stack = new Stack<Integer>();
//		Stack<Integer> K_stack = new Stack<Integer>();
//
//		for (int i = 0; i < A.length; i++) {
//			A_stack.push(A[i]);
//		}
//
//		while (K != 0) {
//			list.add(K % 10);
//			K /= 10;
//		}
//		
//		for (int i = list.size() - 1; i >= 0; i--) {
//			K_stack.push(list.get(i));
//		}
//
//		list.clear();
//
//		if(A_stack.size() >= K_stack.size()) {
//			cal(list, K_stack, A_stack);
//		}else {
//			cal(list, A_stack, K_stack);
//		}
//
//		Collections.reverse(list);
//		
//		for(int n : list) {
//			System.out.println(n);
//		}
//		
//		return list;
//	}
//}

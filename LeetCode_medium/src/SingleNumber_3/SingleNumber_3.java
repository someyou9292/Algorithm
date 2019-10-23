package SingleNumber_3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Solution {
	public int[] singleNumber(int[] nums) {
		int[] answer = new int[2];
		Set set = new HashSet<Integer>();

		for (int i = 0; i < nums.length; i++) {
			if (!set.contains(nums[i])) {
				set.add(nums[i]);
			} else {
				set.remove(nums[i]);
			}
		}
		
		Iterator it = set.iterator();
		int index = 0;
		while(it.hasNext()) {
			answer[index++] = (int)it.next();
		}
		

		return answer;
	}
}

public class SingleNumber_3 {
	public static void main(String[] args) {
		Solution st = new Solution();
		int[] nums = { 0, 1, 1, 2 };

		st.singleNumber(nums);
	}
}


// 효윻 37.15%
//class Solution {
//	public int[] singleNumber(int[] nums) {
//		int[] answer = new int[2];
//		List<Integer> list = new ArrayList<Integer>();
//		
//		Arrays.sort(nums);
//		
//		int index = 0;
//		for(int i=0; i<nums.length;i++) {
//			if(!list.contains(nums[i])) {
//				list.add(nums[i]);
//				index++;
//			}else {
//                index--;
//				list.remove(index);
//			}
//		}
//		
//		answer[0] = list.get(0);
//		answer[1] = list.get(1);
//		
//		return answer;
//	}
//}

// 효율 37.15%
//class Solution {
//	public int[] singleNumber(int[] nums) {
//		int[] answer = new int[2];
//		Set set = new HashSet<Integer>();
//
//		for (int i = 0; i < nums.length; i++) {
//			if (!set.contains(nums[i])) {
//				set.add(nums[i]);
//			} else {
//				set.remove(nums[i]);
//			}
//		}
//		
//		Iterator it = set.iterator();
//		int index = 0;
//		while(it.hasNext()) {
//			answer[index++] = (int)it.next();
//		}
//		
//
//		return answer;
//	}
//}

// 효율 24.45%
//class Solution {
//	public int[] singleNumber(int[] nums) {
//		int[] answer = new int[2];
//		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
//		
//		for(int i=0; i<nums.length;i++) {
//			if(!map.containsKey(nums[i])) {
//				map.put(nums[i], 1);
//			}else {
//				map.put(nums[i], 2);
//			}
//		}
//		int index = 0;
//		for(int key : map.keySet()) {
//			if(map.get(key) == 1) {
//				answer[index++] = key;
//			}
//		}
//		
//		return answer;
//	}
//}
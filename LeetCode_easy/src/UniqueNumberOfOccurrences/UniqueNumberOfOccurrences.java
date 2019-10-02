package UniqueNumberOfOccurrences;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
   각 숫자가 발생한 횟수가 고유한 값일 때 true를 반환해라
   
   ex)
   input : 1, 2, 3
   output : false			-> 1 : 1번 / 2 : 1번 / 3 : 1번
   
   input : 1 1 2 3 3 3 
   output : true			-> 1: 2번 / 2 : 1번 / 3 : 3번
 * */

class Solution {
	public boolean uniqueOccurrences(int[] arr) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		List list = new ArrayList();
		
		for (int i = 0; i < arr.length; i++) {
			if (!map.containsKey(arr[i])) {
				map.put(arr[i], 1);
			} else {
				map.put(arr[i], map.get(arr[i]) + 1);
			}
		}

		for (int mapkey : map.keySet()) {
			System.out.println("key : " + mapkey + " count :" + map.get(mapkey));
			if(list.contains(map.get(mapkey))) {
				return false;
			}else if(!list.contains(map.get(mapkey))) {
				list.add(map.get(mapkey));
			}
		}

		return true;
	}
}

public class UniqueNumberOfOccurrences {
	public static void main(String[] args) {
		Solution st = new Solution();
		int[] arr = { 1,1,2,3,3,3,4 };
		System.out.println(st.uniqueOccurrences(arr));
	}
}

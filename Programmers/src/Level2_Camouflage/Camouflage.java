package Level2_Camouflage;

import java.util.HashMap;

// clotes[n][0] : 옷의 이름
// clotes[n][1] : 옷의 분류
class Solution {
	public int solution(String[][] clothes) {
		int answer = 1;
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		for(int i=0; i<clothes.length;i++) {
			if(!map.containsKey(clothes[i][1])) {
				map.put(clothes[i][1], 1);
			}else {
				map.replace(clothes[i][1], map.get(clothes[i][1])+1);
			}
		}
		
		for(int value : map.values()) {
			answer *= (value+1);
		}
		
		System.out.println(answer-1);
		
		return answer-1;
	}
}

public class Camouflage {
	public static void main(String[] args) {
		Solution st = new Solution();
//		String[][] clothes = { { "yellow_hat", "headgear" }, { "blue_sunglasses", "eyewear" },
//				{ "green_turban", "headgear" } };
		String[][] clothes = { { "crow_mask", "face" }, { "blue_sunglasses", "face" }, { "smoky_makeup", "face" } };
		st.solution(clothes);
	}
}


// 틀린게 없는데... 왜 틀리지..?
//class Solution {
//	public int solution(String[][] clothes) {
//		int answer = 1;
//		List<String> list = new ArrayList<String>();
//		for (int i = 0; i < clothes.length; i++) {
//			if (!list.contains(clothes[i][1])) {
//				list.add(clothes[i][1]);
//			}
//		}
//		int[] count = new int[list.size()];
//		for (int i = 0; i < clothes.length; i++) {
//			for (int j = 0; j < list.size(); j++) {
//				if (clothes[i][1] == list.get(j)) {
//					count[j]++;
//					break;
//				}
//			}
//		}
//		
//		for(int i=0; i<count.length;i++) {
//			count[i]++;
//			answer *= count[i];
//		}
//		
//		answer--;
//		
//		return answer-1;
//	}
//}



//	Test Case에서 오류.. 전역변수를 사용하면 오류발생하나봐..
//class Solution {
//	List<Integer> resultList = new ArrayList<Integer>();
//	public List<Integer> comb(int[] arr, boolean[] visited, int depth, int n, int r) { // nCr
//		if (r == 0) {
//			resultList.add(Mul(arr, visited, n));
//			return resultList;
//		}
//		if (depth == n) {
//			return resultList;
//		} else {
//			visited[depth] = true;
//			comb(arr, visited, depth + 1, n, r - 1);
//			visited[depth] = false;
//			comb(arr, visited, depth + 1, n, r);
//		}
//		return resultList;
//	}
//
//	static int Mul(int[] arr, boolean[] visited, int n) {
//		int result = 1;
//		for (int i = 0; i < n; i++) {
//			if (visited[i] == true) {
//				result *= arr[i];
////				System.out.print(arr[i] + " ");
//			}
//		}
////		System.out.println();
////		System.out.println("곱 결과 > " + result);
//		return result;
//	}
//
//	public int solution(String[][] clothes) {
//		int answer = 0;
//		List<String> list = new ArrayList<String>();
//		for (int i = 0; i < clothes.length; i++) {
//			if (!list.contains(clothes[i][1])) {
//				list.add(clothes[i][1]);
//			}
//		}
//		int[] count = new int[list.size()];
//
//		for (int i = 0; i < clothes.length; i++) {
//			for (int j = 0; j < list.size(); j++) {
//				if (clothes[i][1] == list.get(j)) {
//					count[j]++;
//					break;
//				}
//			}
//		}
//
////		int[] test = { 3, 5, 2, 4 };
//
//		boolean[] visited = new boolean[count.length];
//		List<Integer> result = new ArrayList<Integer>();
////		result = comb(test, visited, 0, 4, 3);
//
//		for (int i = 1; i <= count.length; i++) {
//			result = comb(count, visited, 0, count.length, i);
//		}
//		
//		int[] arr = new int[result.size()];
//		for (int i = 0; i < result.size(); i++) {
////			answer += result.get(i);
//			arr[i] = result.get(i);
//		}
//		
//		for(int i=0; i<arr.length;i++) {
//			answer += arr[i];
//		}
//
//		System.out.println(answer);
//		
//
//		return answer;
//	}
//}

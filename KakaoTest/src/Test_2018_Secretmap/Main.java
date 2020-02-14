package Test_2018_Secretmap;

class Solution {
	public String binaryNum(int num, int n) {
		String result = "";

		int temp = num;

		while (temp != 0) {
			int r = temp % 2;
			result = r + result;
			temp /= 2;
		}

		while (result.length() != n) {
			result = 0 + result;
		}

//		System.out.println(result);
		return result;
	}

	public String[] solution(int n, int[] arr1, int[] arr2) {
		String[] answer = new String[n];
		String[] map1 = new String[n];
		String[] map2 = new String[n];
		int arr1_index = 0;
		int arr2_index = 0;

		for (int i = 0; i < n; i++) {
			map1[i] = binaryNum(arr1[i], n);
			map2[i] = binaryNum(arr2[i], n);
		}

		for (int i = 0; i < n; i++) {
			String result = "";
			for (int j = 0; j < n; j++) {
				if(map1[i].charAt(j) == '1' || map2[i].charAt(j) == '1') {
					result += '#';
				}else {
					result += ' ';
				}
			}
			answer[i] = result;
		}
		
		for(int i=0; i<answer.length;i++) {
			System.out.println(answer[i]);
		}

		return answer;
	}
}

public class Main {
	public static void main(String[] args) {
		Solution st = new Solution();
		int n = 6;
		int[] arr1 = { 46, 33, 33, 22, 31, 50 };
		int[] arr2 = { 27, 56, 19, 14, 14, 10 };

		st.solution(n, arr1, arr2);
	}
}


// 다른 사람 풀이.   공부하기!
//class Solution {
//  public String[] solution(int n, int[] arr1, int[] arr2) {
//        String[] result = new String[n];
//        for (int i = 0; i < n; i++) {
//            result[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
//        }
//
//        for (int i = 0; i < n; i++) {
//            result[i] = String.format("%" + n + "s", result[i]);
//            result[i] = result[i].replaceAll("1", "#");
//            result[i] = result[i].replaceAll("0", " ");
//        }
//
//        return result;
//    }
//}
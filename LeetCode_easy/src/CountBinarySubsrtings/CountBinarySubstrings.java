package CountBinarySubsrtings;

/*
 문자열이 주어지면 0과 1 의 개수가 같은 연속된 문자열의 갯수를 구해라
 
입력 : "00110011"
출력 : 6
0011
01
1100
10
0011
01
* 중복은 허용이 되고 연속이 되어야되며 0 과 1 의 갯수가 같아야 됨.
* 오직 0과 1만 으로 이루어진 문자열이 주어진다.
 * */

class Solution {
	public int countBinarySubstrings(String s) {
		int result = 0;
		int zero_count = 0;
		int one_count = 0;
		char[] arr = new char[s.length()];

		// 배열 세팅
		for (int i = 0; i < s.length(); i++) {
			arr[i] = s.charAt(i);
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == '0') {
				zero_count++;
				if (zero_count <= one_count) {
					result++;
				}
				if (i != arr.length - 1 && arr[i + 1] == '1') {
					one_count = 0;
				}
			} else if (arr[i] == '1') {
				one_count++;
				if (zero_count >= one_count) {
					result++;
				}
				if (i != arr.length - 1 && arr[i + 1] == '0') {
					zero_count = 0;
				}
			}
		}

		return result;
	}
}

public class CountBinarySubstrings {
	public static void main(String[] args) {
		Solution st = new Solution();
		String s = "00011100001111";

		System.out.println(st.countBinarySubstrings(s));
	}
}




/*
 class Solution {
    public int countBinarySubstrings(String s) {
        int ans = 0, prev = 0, cur = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i-1) != s.charAt(i)) {
                ans += Math.min(prev, cur);
                prev = cur;
                cur = 1;
            } else {
                cur++;
            }
        }
        return ans + Math.min(prev, cur);
    }
}
 */

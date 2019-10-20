package Level1_18;

/*
 
어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 바꾸는 암호화 방식을 시저 암호라고 합니다. 
예를 들어 AB는 1만큼 밀면 BC가 되고, 3만큼 밀면 DE가 됩니다. 
z는 1만큼 밀면 a가 됩니다. 
문자열 s와 거리 n을 입력받아 s를 n만큼 민 암호문을 만드는 함수, solution을 완성해 보세요.
 
제한 조건
공백은 아무리 밀어도 공백입니다.
s는 알파벳 소문자, 대문자, 공백으로만 이루어져 있습니다.
s의 길이는 8000이하입니다.
n은 1 이상, 25이하인 자연수입니다.
 * */
class Solution {
	public String solution(String s, int n) {
		String answer = "";

		char[] arr = s.toCharArray();

		for (int i = 0; i < arr.length; i++) {
			// 공백일 때
			if(arr[i] == ' ') {
				answer += arr[i];
				continue;
			}
			// 소문자인 경우
			if (arr[i] >= 97 && arr[i] <= 122) {
				if(arr[i] + n > 122) {
					arr[i] = (char) (arr[i] + n - 26);
				}else {
					arr[i] += n;
				}
			}
			// 대문자인 경우
			else if(arr[i] >= 65 && arr[i] <= 90) {
				if(arr[i] + n > 90) {
					arr[i] = (char) (arr[i] + n - 26);
				}else {
					arr[i] += n;
				}
			}

			answer += arr[i];
		}


		return answer;
	}
}

public class Level1_18 {
	public static void main(String[] args) {
		Solution st = new Solution();
		String s = "ZzZzabcd";
		int n = 10;
		st.solution(s, n);
	}
}

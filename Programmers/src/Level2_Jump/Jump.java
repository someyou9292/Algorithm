package Level2_Jump;

// 점프 : n 만큼 이동 한 만큼 베터리 n 소모
// 순간이도 : 소모 x / 온 거리의 2배만큼 이동
// 규칙 : 2진수로 바꾸었을때 1의 숫자를 세면됨.
// 1 - 1
// 2 - 1
// 3 - 2
// 4 - 1
// 5 - 2 ... 15 - 4
class Solution {
	public int solution(int n) {
		int ans = 0;
		
		while(n != 0) {
			int r = n % 2;
			n /= 2;
			if(r == 1) {
				ans++;
			}
		}
				
		return ans;
	}
}

public class Jump {
	public static void main(String[] args) {
		Solution st = new Solution();
		int n = 3;
		st.solution(n);
	}
}

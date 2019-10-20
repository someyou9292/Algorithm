package Level1_28;

/*
1-1. 입력된 수가 짝수라면 2로 나눕니다. 
1-2. 입력된 수가 홀수라면 3을 곱하고 1을 더합니다.
2. 결과로 나온 수에 같은 작업을 1이 될 때까지 반복합니다.

 * */
class Solution {
    public int solution(int num) {
        int count = 0;

        while (num != 1) {
            if(count > 500) {
                count = -1;
                break;
            }
            if (num % 2 == 0) {
                num /= 2;
            } else if (num % 2 == 1) {
                num = (num * 3) + 1;
            }
            count++;
        }

        return count;
    }
}
public class Level1_28 {
	public static void main(String[] args) {
		Solution st = new Solution();
		int num = 6;
		st.solution(num);
		
	}
}

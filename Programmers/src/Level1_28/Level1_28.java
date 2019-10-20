package Level1_28;

/*
1-1. �Էµ� ���� ¦����� 2�� �����ϴ�. 
1-2. �Էµ� ���� Ȧ����� 3�� ���ϰ� 1�� ���մϴ�.
2. ����� ���� ���� ���� �۾��� 1�� �� ������ �ݺ��մϴ�.

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

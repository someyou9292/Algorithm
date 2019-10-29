package LemonadeChange;

class Solution {
	public boolean lemonadeChange(int[] bills) {
		int[] m = new int[3];
		for (int i = 0; i < bills.length; i++) {
			switch (bills[i]) {
			case 5:
				m[0]++;
				break;
			case 10:
				if (m[0] != 0) {
					m[1]++;
					m[0]--;
				} else {
					return false;
				}
				break;
			case 20:
				if (m[0] > 0 && m[1] > 0) {
					m[2]++;
					m[1]--;
					m[0]--;
				} else if (m[0] >= 3 && m[1] == 0) {
					m[2]++;
					m[0] -= 3;
				}else {
					return false;
				}
				break;
			default:
				break;
			}
		}
		
		return true;
	}
}

public class LemonadeChange {
	public static void main(String[] args) {
		Solution st = new Solution();
		int[] bills = { 5,5,10,10,20 };
		System.out.println(st.lemonadeChange(bills));
	}
}

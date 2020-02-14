package Level3_visitLength;

/*
���α׷��ӽ� Level3 _ �湮���� ����
(0,0) ���� �����Ͽ� UDRL �� �Է¹����� ��ĭ�� �̵�.
���� (5,5), (5,-5), (-5,5), (-5,-5) �� ����
�� 100ĭ�� ũ��.
ó�� �̵��� �Ÿ��� ���ϸ� ��. (�ߺ��� ���� ī���� x)
���� ũ�⸦ �Ѿ�� ����.
ex) 
123456789
LULLLLLLU
7,8 ���� �����ϰ� 9�� ����� ���� -> 7 �� ���̵�

*/

import java.util.ArrayList;
import java.util.List;

class Solution {
	public int solution(String dirs) {
		int answer = 0;

		int x = 0;		// x ��ǥ
		int y = 0;		// y ��ǥ
		int pre_x = 0;	// ���� x ��ǥ
		int pre_y = 0; 	// ���� y ��ǥ
		List<String> isVisit = new ArrayList<String>();

		for (int i = 0; i < dirs.length(); i++) {
			char c = dirs.charAt(i);
			String visit = "";
			
			visit = x + "," + y;
			
			pre_x = x;
			pre_y = y;
			
			switch (c) {
			case 'U':
				y++;
				break;
			case 'D':
				y--;
				break;
			case 'R':
				x++;
				break;
			case 'L':
				x--;
				break;
			}

			visit = visit + "->" + x + "," + y;
			
			if (x < -5) {
				x++;
			} else if( x > 5){
				x--;
			}else if(y < -5) {
				y++;
			}else if(y > 5) {
				y--;
			}else {
				if (!isVisit.contains(visit)) {
					isVisit.add(visit);
					visit ="";
					visit = x + "," + y + "->" + pre_x + "," + pre_y;
					isVisit.add(visit);
					answer++;
				}
			}
		}
		
		System.out.println(answer);
		return answer;
	}
}


public class Main {
	public static void main(String[] args) {
		Solution st = new Solution();
		String dirs = "ULDRRL";

		st.solution(dirs);
	}
}

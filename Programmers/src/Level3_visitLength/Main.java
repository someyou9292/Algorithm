package Level3_visitLength;

/*
프로그래머스 Level3 _ 방문길이 문제
(0,0) 에서 시작하여 UDRL 을 입력받으면 한칸씩 이동.
경계는 (5,5), (5,-5), (-5,5), (-5,-5) 로 구성
총 100칸의 크기.
처음 이동한 거리를 구하면 됨. (중복된 길은 카운팅 x)
맵의 크기를 넘어가면 무시.
ex) 
123456789
LULLLLLLU
7,8 번은 무시하고 9번 명령을 실행 -> 7 이 답이됨

*/

import java.util.ArrayList;
import java.util.List;

class Solution {
	public int solution(String dirs) {
		int answer = 0;

		int x = 0;		// x 좌표
		int y = 0;		// y 좌표
		int pre_x = 0;	// 이전 x 좌표
		int pre_y = 0; 	// 이전 y 좌표
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

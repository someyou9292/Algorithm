package Level2_Carpet;

class Solution {
	public int[] solution(int brown, int red) {
		int[] answer = new int[2];
		int b = (brown - 4) / 2; // 각 꼭지점 4개의 사각형을 제외한 나머지 중 절반

		int h = 1; // red 의 높이
		int w = b - 1; // red 의 밑변

		for (int i = 0; i < b; i++) {
			if (h * w == red) {		// red의 넓이와 같은 경우
				answer[0] = w + 2; // 전체 사각형의 밑변
				answer[1] = h + 2; // 전체 사각형의 높이
				break;
			} else {
				h++;
				w--;
			}
		}

		System.out.println(answer[0]);
		System.out.println(answer[1]);

		return answer;
	}
}

public class Carpet {
	public static void main(String[] args) {
		Solution st = new Solution();

		int brown = 24;
		int red = 24;

		st.solution(brown, red);
	}
}

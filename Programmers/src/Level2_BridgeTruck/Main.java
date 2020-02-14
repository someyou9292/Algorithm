package Level2_BridgeTruck;

import java.util.Queue;
import java.util.LinkedList;

class Solution {
	public void increaseTime(Queue<Integer> time) {
		int queueSize = time.size();

		// time 큐에 저장된 원소들을 각각 1씩 증가
		for (int i = 0; i < queueSize; i++) {
			time.offer(time.poll() + 1);
		}
	}

	public int solution(int bridge_length, int weight, int[] truck_weights) {
		int answer = 0;

		int weightSum = 0;
		Queue<Integer> time = new LinkedList<>();
		int index = 0;	// 트럭 순서

		while (index < truck_weights.length) {	// 트럭 수 만큼 반복
			answer++;		// 시간 (결과) 증가

			int curTruck = truck_weights[index];	// 현재 트럭을 저장

			if (weightSum + curTruck <= weight) {	// 다리가 버틸 수 있는 무게보다 적다면 지나가는 트럭 추가
				index++;				// 다음 트럭
				weightSum += curTruck;	// 트럭 무게 합 증가
				time.offer(0);			// 다음 트럭 시간 저장
			}

			increaseTime(time);		// 각 원소를 1초씩 증가하는 함수

			if (time.peek() == bridge_length) {		// time의 top이 다리 길이와 같다면
				weightSum -= truck_weights[index - time.size()];	// 해당 트럭 무게를 뻄
				time.poll();		// time 큐에서 pop 함
			}
		}

		answer += bridge_length;	// 마지막 트럭 지나가는 것을 더해줌

		return answer;
	}
}

public class Main {
	public static void main(String[] args) {
		int bridge_length = 2; // 다리의 길이
		int weight = 10; // 다리가 버틸 수 있는 무게
		int[] truck_weights = { 7, 4, 5, 6 }; // 트럭의 무게
		Solution st = new Solution();
		st.solution(bridge_length, weight, truck_weights);
	}
}

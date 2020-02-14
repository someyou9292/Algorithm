package Level2_BridgeTruck;

import java.util.Queue;
import java.util.LinkedList;

class Solution {
	public void increaseTime(Queue<Integer> time) {
		int queueSize = time.size();

		// time ť�� ����� ���ҵ��� ���� 1�� ����
		for (int i = 0; i < queueSize; i++) {
			time.offer(time.poll() + 1);
		}
	}

	public int solution(int bridge_length, int weight, int[] truck_weights) {
		int answer = 0;

		int weightSum = 0;
		Queue<Integer> time = new LinkedList<>();
		int index = 0;	// Ʈ�� ����

		while (index < truck_weights.length) {	// Ʈ�� �� ��ŭ �ݺ�
			answer++;		// �ð� (���) ����

			int curTruck = truck_weights[index];	// ���� Ʈ���� ����

			if (weightSum + curTruck <= weight) {	// �ٸ��� ��ƿ �� �ִ� ���Ժ��� ���ٸ� �������� Ʈ�� �߰�
				index++;				// ���� Ʈ��
				weightSum += curTruck;	// Ʈ�� ���� �� ����
				time.offer(0);			// ���� Ʈ�� �ð� ����
			}

			increaseTime(time);		// �� ���Ҹ� 1�ʾ� �����ϴ� �Լ�

			if (time.peek() == bridge_length) {		// time�� top�� �ٸ� ���̿� ���ٸ�
				weightSum -= truck_weights[index - time.size()];	// �ش� Ʈ�� ���Ը� �M
				time.poll();		// time ť���� pop ��
			}
		}

		answer += bridge_length;	// ������ Ʈ�� �������� ���� ������

		return answer;
	}
}

public class Main {
	public static void main(String[] args) {
		int bridge_length = 2; // �ٸ��� ����
		int weight = 10; // �ٸ��� ��ƿ �� �ִ� ����
		int[] truck_weights = { 7, 4, 5, 6 }; // Ʈ���� ����
		Solution st = new Solution();
		st.solution(bridge_length, weight, truck_weights);
	}
}

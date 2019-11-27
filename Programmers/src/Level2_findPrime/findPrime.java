package Level2_findPrime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
	// �Ҽ� ����� �Լ�
	public List<Integer> makePrimeList(int max) {
		List<Integer> prime = new ArrayList<Integer>();
		for (int i = 2; i <= max; i++) {
			boolean isPrime = true;
			for (int j = 2; j * j <= i; j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime == true) {
				prime.add(i);
			}
		}

		return prime;
	}

	// �־��� �������� ����� �ִ� �Ҽ�
	public boolean isPossible(int num, int[] primeArr) {
		int[] tempArr = new int[primeArr.length];
		int tempNum = num;
		
		for(int i=0; i<tempArr.length;i++) {
			tempArr[i] = primeArr[i];
		}
		
		while(tempNum != 0) {
			int check = tempNum % 10;
			if(tempArr[check] > 0) {
				tempArr[check]--;
			}else {
				return false;
			}
			tempNum /= 10;
		}
		
		return true;
	}

	public int solution(String numbers) {
		int answer = 0;
		char[] charArr = numbers.toCharArray();
		Arrays.sort(charArr);
		String maxNumber = "";

		// �־��� ���� ���� �� �ִ� �ִ밪�� ����
		for (int i = charArr.length - 1; i >= 0; i--) {
			maxNumber += charArr[i];
		}
		int max = Integer.parseInt(maxNumber);

		// �ִ� �� ������ �Ҽ��� ����.
		List<Integer> prime = new ArrayList<Integer>();
		prime = makePrimeList(max);

		// �־��� ���ڿ����� �� ������ ������ ����
		int[] numberCount = new int[10];
		for (int i = 0; i < charArr.length; i++) {
			numberCount[charArr[i] - '0']++;
		}

		
		for (int i = 0; i < prime.size(); i++) {
			if(isPossible(prime.get(i), numberCount)) {
				answer++;
			}
		}
		
//		System.out.println("---------�־��� String�� �� ���� ����--------");
//		for(int n : numberCount) {
//			System.out.println(n);
//		}
//		System.out.println("----------------------");
//		
//		System.out.println("---------prime ����Ʈ--------");
//		for(int n : prime) {
//			System.out.println(n);
//		}
//		System.out.println("----------------------");		
//		
//		System.out.println(answer);
		
		return answer;
	}
}

public class findPrime {
	public static void main(String[] args) {
		Solution st = new Solution();
		String numbers = "237";
		st.solution(numbers);
	}
}

package Level2_findPrime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
	// 소수 만드는 함수
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

	// 주어진 조각으로 만들수 있는 소수
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

		// 주어진 수로 만들 수 있는 최대값을 구함
		for (int i = charArr.length - 1; i >= 0; i--) {
			maxNumber += charArr[i];
		}
		int max = Integer.parseInt(maxNumber);

		// 최대 수 까지의 소수를 구함.
		List<Integer> prime = new ArrayList<Integer>();
		prime = makePrimeList(max);

		// 주어진 문자열에서 각 숫자의 갯수를 저장
		int[] numberCount = new int[10];
		for (int i = 0; i < charArr.length; i++) {
			numberCount[charArr[i] - '0']++;
		}

		
		for (int i = 0; i < prime.size(); i++) {
			if(isPossible(prime.get(i), numberCount)) {
				answer++;
			}
		}
		
//		System.out.println("---------주어진 String의 각 숫자 갯수--------");
//		for(int n : numberCount) {
//			System.out.println(n);
//		}
//		System.out.println("----------------------");
//		
//		System.out.println("---------prime 리스트--------");
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

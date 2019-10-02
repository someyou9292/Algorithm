package SumOfEvenNumberAfterQueries;

/*
	
입력 : A = [1,2,3,4], 쿼리 = [[1,0], [-3,1], [-4,0], [2,3]]
출력 : [8,6,2,4]
설명:
처음에 배열은 [1,2,3,4]입니다.
A [0]에 1을 더한 후 배열은 [2,2,3,4]이고 짝수 값의 합은 2 + 2 + 4 = 8입니다.
A [1]에 -3을 더한 후 배열은 [2, -1,3,4]이고 짝수 값의 합은 2 + 4 = 6입니다.
A [0]에 -4를 더한 후 배열은 [-2, -1,3,4]이며 짝수 값의 합은 -2 + 4 = 2입니다.
A [3]에 2를 더한 후 배열은 [-2, -1,3,6]이고 짝수 값의 합은 -2 + 6 = 4입니다.
 * */

//class Solution {
//    public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
//        int S = 0;
//        for (int x: A)
//            if (x % 2 == 0)
//                S += x;
//
//        int[] ans = new int[queries.length];
//
//        for (int i = 0; i < queries.length; ++i) {
//            int val = queries[i][0], index = queries[i][1];
//            if (A[index] % 2 == 0) S -= A[index];
//            A[index] += val;
//            if (A[index] % 2 == 0) S += A[index];
//            ans[i] = S;
//        }
//
//        return ans;
//    }
//}
 
class Solution {
	public int[] sumEvenAfterQueries(int[] A, int[][] queries) {

		int Sum = 0;

		for (int i = 0; i < A.length; i++) {
			if (A[i] % 2 == 0) {
				Sum += A[i];
			}
		}

		int[] result = new int[A.length];
		for (int i = 0; i < A.length; i++) {
			int index = queries[i][1], val = queries[i][0];
			
			if(A[index] % 2==0){
				Sum -= A[index];
			}
			A[index] += val;
			if(A[index] % 2 ==0) {
				Sum += A[index];
			}
			result[i] = Sum;
		}

		return result;
	}
}

public class sumOfEvenNumber {
	public static void main(String[] args) {
		Solution st = new Solution();
		int[] A = { 1, 2, 3, 4 };
		int[][] queries = { { 1, 0 }, { -3, 1 }, { -4, 0 }, { 2, 3 } };

		st.sumEvenAfterQueries(A, queries);
	}
}



/*
 짝수의 합을 구하는 것이므로 
 최초 짝수의 값을 구한다. (그것은 A[index] 가 짝수일때만 영향을 미침)
 A[index] 가 짝수라면 중복되는 것이므로 일단 원래의 A[index]를 뺌
 그 후 A[index] 를 업데이트 함
 업데이트 된 A[index] 를 Sum 에 더함
 * */

package Level2_Square;


import java.math.BigInteger;

class Solution {
    public int GCD(int a, int b) {
        BigInteger num1 = BigInteger.valueOf(a);
        BigInteger num2 = BigInteger.valueOf(b);
        BigInteger gcd = num1.gcd(num2);

        return gcd.intValue();
    }

    public long solution(int w, int h) {
        long answer = (long)w * (long)h;
        long sub;

        int gcd = GCD(w, h);

        if (gcd == 1) {
            sub = w + h - 1;
        } else {
            sub = w + h - gcd;
        }

        answer -= sub;

        System.out.println(answer);
        return answer;
    }
}

public class Square {
    public static void main(String[] args) {
        Solution st = new Solution();
        int w = 10;
        int h = 10;
        st.solution(w, h);
    }
}

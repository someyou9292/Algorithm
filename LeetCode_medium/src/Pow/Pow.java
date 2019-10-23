package Pow;

class Solution {
    //credit to wikipedia for this
    public double myPow(double x, int n) {
        double exp = n;
        
        if(exp < 0)
		{
			x = (1 / x);
			exp = -exp;
		}
		else if(exp == 0)
		{
			return 1;
		}
		
		double y = 1;
		
		while(exp > 1)
		{
			if(exp % 2 == 0)
			{
				x = x * x;
				exp = exp / 2;
			}
			else
			{
				y = x * y;
				x = x * x;
				exp = (exp - 1) / 2;
			}
		}	
        
		return x * y;
    }
}
public class Pow {
	public static void main(String[] args) {
		Solution st = new Solution();
		double x = -13.62608;
		int n = 3;
		st.myPow(x, n);
	}
}

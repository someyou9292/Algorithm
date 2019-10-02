package DefangingIP;

/*
Example 1:

Input: address = "1.1.1.1"
Output: "1[.]1[.]1[.]1"

Example 2:
Input: address = "255.100.50.0"
Output: "255[.]100[.]50[.]0"
 * */

class Solution {
    public String defangIPaddr(String address) {
    
		String newAddress = address.replace(".", "[.]");
		
    	return newAddress;
    }
}


public class DefangingIP {
	public static void main(String[] args) {
		Solution st = new Solution();
		String address = "1.1.1.1";
		
		System.out.println(st.defangIPaddr(address));
	}
}

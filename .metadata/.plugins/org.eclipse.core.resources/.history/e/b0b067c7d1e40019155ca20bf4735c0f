package MaximumBalloon;
/*
 text 가 주어지면 그 text 안에서 Ballon을 만들수 있는 갯수를 구해라
 
 ex1) 
 Input: text = "nlaebolko"
 Output: 1

 ex2)
 Input: text = "loonbalxballpoon"
 Output: 2

 ex3)
 Input: text = "leetcode"
 Output: 0
 * */

class Solution {
	public int maxNumberOfBalloons(String text) {
		int[] balloonsCount = new int[5];
		int bCount = 0, aCount = 0, lCount = 0, oCount = 0, nCount = 0;
		
		for(int i = 0; i < text.length(); i++) {
			char c = text.charAt(i);
			switch(c) {
			case 'b':
				bCount++;
				break;
			case 'a':
				aCount++;
				break;
			case 'l':
				lCount++;
				break;
			case 'o':
				oCount++;
				break;
			case 'n':
				nCount++;
				break;
			default:
				break;
			}
		}
		
		System.out.println("b >>" + bCount);
		System.out.println("a >>" + aCount);
		System.out.println("l >>" + lCount);
		System.out.println("o >>" + oCount);
		System.out.println("n >>" + nCount);
		
		int minBA = (bCount < aCount) ? bCount : aCount;
		int minBAN = nCount < minBA ? nCount : minBA;
		
		int minLO = (lCount < oCount) ? lCount : oCount;
		
		if(minBAN == 0 || minLO == 0) {
			return 0;
		}else {
			return minLO/2;
		}
	}
}

public class MaxBalloon {
	public static void main(String[] args) {
		Solution st = new Solution();
		String text = "krhizmmgmcrecekgyljqkldocicziihtgpqwbticmvuyznragqoyrukzopfmjhjjxemsxmrsxuqmnkrzhgvtgdgtykhcglurvppvcwhrhrjoislonvvglhdciilduvuiebmffaagxerjeewmtcwmhmtwlxtvlbocczlrppmpjbpnifqtlninyzjtmazxdbzwxthpvrfulvrspycqcghuopjirzoeuqhetnbrcdakilzmklxwudxxhwilasbjjhhfgghogqoofsufysmcqeilaivtmfziumjloewbkjvaahsaaggteppqyuoylgpbdwqubaalfwcqrjeycjbbpifjbpigjdnnswocusuprydgrtxuaojeriigwumlovafxnpibjopjfqzrwemoinmptxddgcszmfprdrichjeqcvikynzigleaajcysusqasqadjemgnyvmzmbcfrttrzonwafrnedglhpudovigwvpimttiketopkvqw";
		
		System.out.println(st.maxNumberOfBalloons(text));
	}
}

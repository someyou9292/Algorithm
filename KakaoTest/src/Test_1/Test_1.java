package Test_1;

class Solution {
	public int solution(String s) {
        if(s.length() == 1){
            return 1;
        }
		int sLen = s.length();
		int[] len = new int[sLen / 2]; // ����� ���ڿ� ���̸� �����ϴ� �迭
//		String newS = s + " ";
		int count = 0; // ���� ��
		int cut = 1; // �ڸ��� ���� ��
		int limit = 0;
		
		String curr = "";
		String pre = "";

		for (int i = 0; i < sLen / 2; i++) {
			int index = 0;
			int same = 1;
			// limit ���� �ڸ��� �ֵ���
			if (s.length() % cut == 0) {
				limit = s.length();
			}else {
				limit = s.length() - (s.length() % cut);
			}
			while (index + cut <= limit) {
				curr = s.substring(index, index + cut);
				if (index == 0) {
					pre = curr;
				} else if (index != 0 && curr.equals(pre)) { // ���� ���
					same++;
				} else if (index != 0 && !curr.equals(pre)) { // �ٸ� ���
					if (same > 1 && same <= 9) {
//						count += 2;
						count = count + 1 + pre.length();
					} else if (same > 9 && same <= 99) {
//						count += 3;
						count = count + 2 + pre.length();
					} else if (same > 99 && same <= 999) {
//						count += 4;
						count = count + 3 + pre.length();
					}  else {
//						count++;
						count = count + pre.length();
					}
					pre = curr;
					same = 1;
				}
				index += cut;
			}

			String remaind = s.substring(limit);
			if (remaind.equals("")) {
				if (same > 1 && same <= 9) {
//					count += 2;
					count = count + 1 + pre.length();
				} else if (same > 9 && same <= 99) {
//					count += 3;
					count = count + 2 + pre.length();
				} else if (same > 99 && same <= 999) {
//					count += 4;
					count = count + 3 + pre.length();
				}else if (same == 1000) {
                    return 5;
                } else {
//					count++;
					count = count + pre.length();
				}
			} else {
				if (same > 1 && same <= 9) {
//					count += 2;
					count = count + 1 + pre.length() + remaind.length();
				} else if (same > 9 && same <= 99) {
//					count += 3;
					count = count + 2 + pre.length() + remaind.length();
				} else if (same > 99 && same <= 999) {
//					count += 4;
					count = count + 3 + pre.length() + remaind.length();
				} else {
//					count++;
					count = count + pre.length() + remaind.length();
				}
			}
			len[i] = count;
			count = 0;
			cut++;
			pre = "";
			curr = "";
		}
		
		int min = len[0];
		
		for(int i=1; i<len.length;i++) {
			if(min > len[i]) {
				min = len[i];
			}
		}

		return min;
	}
}

public class Test_1 {
	public static void main(String[] args) {
		Solution st = new Solution();
		String s = "aabbaccc";

		System.out.println(st.solution(s));
		
	}
}

package Test_2018_NEWS;

import java.util.ArrayList;
import java.util.List;

class Solution {
	public List<String> pureStr(List<String> list) {
		List<String> newList = new ArrayList<String>();
		for(int i=0; i<list.size();i++) {
			// list의 원소의 단어 중 A~Z 이외의 단어가 있다면 패스
			if(list.get(i).charAt(0) < 'A' || list.get(i).charAt(0) > 'Z'
			||list.get(i).charAt(1) < 'A' || list.get(i).charAt(1) > 'Z') {
				continue;
			}else {
				newList.add(list.get(i));
			}
		}

		return newList;
	}

	public List<String> multiSet(String str) {
		List<String> list = new ArrayList<String>();

		for (int i = 0; i < str.length() - 1; i++) {
			list.add("" + str.charAt(i) + str.charAt(i + 1));
		}

		return list;
	}

	public int Jaccard(List<String> list1, List<String> list2) {
		List<String> intersection = new ArrayList<String>();
		List<String> union = new ArrayList<String>();
		int result = 0;

		for (int i = 0; i < list1.size(); i++) {
			for (int j = 0; j < list2.size(); j++) {
				if (list1.get(i).equals(list2.get(j)) && !list1.get(i).equals("a")) {
					intersection.add(list1.get(i));
					list1.set(i, "a");		// a로 대체
					list2.set(j, "a");
					break;
				}
			}
		}

		for (int i = 0; i < intersection.size(); i++) {
			if (!intersection.get(i).equals("a")) {
				union.add(intersection.get(i));
			}
		}
		for (int i = 0; i < list1.size(); i++) {
			if (!list1.get(i).equals("a")) {
				union.add(list1.get(i));
			}
		}
		for (int i = 0; i < list2.size(); i++) {
			if (!list2.get(i).equals("a")) {
				union.add(list2.get(i));
			}
		}

//		System.out.println("합집합-----------");
//		for (String s : union) {
//			System.out.print(s + " ");
//		}
//		System.out.println();
//		System.out.println("교집합 -----------");
//		for (String s : intersection) {
//			System.out.print(s + " ");
//		}
//		System.out.println();
		

		double i = intersection.size();
		double u = union.size();
		double r = i / u;

		result = (int) (r * 65536);
		
		if(intersection.size() == 0 && union.size() == 0) {
			return 65536;
		}else if(intersection.size()==0 && union.size() != 0) {
			return 0;
		}
		
		return result;
	}

	public int solution(String str1, String str2) {
		int answer = 0;
		List<String> str1List = new ArrayList<String>();
		List<String> str2List = new ArrayList<String>();

		str1 = str1.toUpperCase();
		str2 = str2.toUpperCase();

		str1List = multiSet(str1);
		str2List = multiSet(str2);
		
		str1List = pureStr(str1List);
		str2List = pureStr(str2List);
		
//		System.out.println("str1 ------------");
//		for (String s : str1List) {
//			System.out.print(s + " ");
//		}
//		System.out.println();
//		System.out.println("str2 ------------");
//		for (String s : str2List) {
//			System.out.print(s + " ");
//		}
//		System.out.println();
		
		answer = Jaccard(str1List, str2List);
		
//		System.out.println(answer);
		
		return answer;
	}
}

public class NEWS {
	public static void main(String[] args) {
		Solution st = new Solution();
		String str1 = "asdd";
		String str2 = "1a2sz2";

		st.solution(str1, str2);
	}
}

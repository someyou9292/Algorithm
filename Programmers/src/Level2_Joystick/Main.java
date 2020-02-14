package Level2_Joystick;

//							        mid
// 0   1 2 3 4 5 6 7 8 9 10 11 12    13   12 11 10 9 8 7 6 5 4 3 2 1
// A   B C D E F G H I J  K  L  M     N    O  P  Q R S T U V W X Y Z
class Solution {
	public int solution(String name) {
		int answer = 0;

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < name.length(); i++) {
			sb.append('A');
		}

		if (name.equals(sb.toString())) {
			System.out.println(answer);
			return answer;
		}

		if (name.length() == 1) {
			if (name.charAt(0) <= 'N') {
				for (int i = 0; i < name.charAt(0) - 'A'; i++) {
					answer++;
				}
			} else {
				for (int i = 'Z' - 'A'; i >= name.charAt(0) - 'A'; i--) {
					answer++;
				}
			}
			System.out.println(answer);
			return answer;
		} else {
			int index = 0;
			char c = 'A';
			if (name.charAt(1) == 'A') {
				while (index != 1) {
					if (index == 0) {
						for (int i = 0; i < name.charAt(0) - 'A'; i++) {
							answer++;
							c++;
						}
						sb.setCharAt(0, c);
						if(name.equals(sb.toString())) {
							System.out.println(sb.toString());
							System.out.println(answer);

							return answer;
						}
						answer++; // 왼쪽으로 한번
						index = name.length() - 1;
					} else {
						if (name.charAt(index) <= 'N') {
							c = 'A';
							for (int i = 0; i < name.charAt(index) - 'A'; i++) {
								answer++;
								c++;
							}
							sb.setCharAt(index, c);
							if(name.equals(sb.toString())) {
								System.out.println(sb.toString());
								System.out.println(answer);

								return answer;
							}
							answer++;
						} else {
							c = 'Z' + 1;
							for (int i = 'Z' - 'A'; i >= name.charAt(index) - 'A'; i--) {
								answer++;
								c--;
							}
							sb.setCharAt(index, c);
							if(name.equals(sb.toString())) {
								System.out.println(sb.toString());
								System.out.println(answer);
								return answer;
							}
							answer++;
						}
						index--;
					}
				}
			} else {
				while (index != name.length()) {
					if (name.charAt(index) <= 'N') {
						c = 'A';
						for (int i = 0; i < name.charAt(index) - 'A'; i++) {
							answer++;
							c++;
						}
						sb.setCharAt(index, c);
						if(name.equals(sb.toString())) {
							System.out.println(sb.toString());
							System.out.println(answer);
							return answer;
						}
						answer++;
						
					} else {
						c = 'Z' + 1;
						for (int i = 'Z' - 'A'; i >= name.charAt(index) - 'A'; i--) {
							answer++;
							c--;
						}
						sb.setCharAt(index, c);
						if(name.equals(sb.toString())) {
							System.out.println(sb.toString());
							System.out.println(answer);
							return answer;
						}
						answer++;
					}
					index++;
				}
			}
		}
		
		return answer;
	}
}
public class Main {
	public static void main(String[] args) {
		String name = "ABABAAAAABA";
		Solution st = new Solution();

		st.solution(name);
	}
}

//	테스트 케이스 11 에서 오류남..
//class Solution {
//	public int solution(String name) {
//		int answer = 0;
//
//		StringBuilder sb = new StringBuilder();
//
//		for (int i = 0; i < name.length(); i++) {
//			sb.append('A');
//		}
//
//		if (name.equals(sb.toString())) {
//			System.out.println(answer);
//			return answer;
//		}
//
//		if (name.length() == 1) {
//			if (name.charAt(0) <= 'N') {
//				for (int i = 0; i < name.charAt(0) - 'A'; i++) {
//					answer++;
//				}
//			} else {
//				for (int i = 'Z' - 'A'; i >= name.charAt(0) - 'A'; i--) {
//					answer++;
//				}
//			}
//			System.out.println(answer);
//			return answer;
//		} else {
//			int index = 0;
//			char c = 'A';
//			if (name.charAt(1) == 'A') {
//				while (index != 1) {
//					if (index == 0) {
//						for (int i = 0; i < name.charAt(0) - 'A'; i++) {
//							answer++;
//							c++;
//						}
//						sb.setCharAt(0, c);
//						if(name.equals(sb.toString())) {
//							System.out.println(sb.toString());
//							System.out.println(answer);
//
//							return answer;
//						}
//						answer++; // 왼쪽으로 한번
//						index = name.length() - 1;
//					} else {
//						if (name.charAt(index) <= 'N') {
//							c = 'A';
//							for (int i = 0; i < name.charAt(index) - 'A'; i++) {
//								answer++;
//								c++;
//							}
//							sb.setCharAt(index, c);
//							if(name.equals(sb.toString())) {
//								System.out.println(sb.toString());
//								System.out.println(answer);
//
//								return answer;
//							}
//							answer++;
//						} else {
//							c = 'Z' + 1;
//							for (int i = 'Z' - 'A'; i >= name.charAt(index) - 'A'; i--) {
//								answer++;
//								c--;
//							}
//							sb.setCharAt(index, c);
//							if(name.equals(sb.toString())) {
//								System.out.println(sb.toString());
//								System.out.println(answer);
//								return answer;
//							}
//							answer++;
//						}
//						index--;
//					}
//				}
//			} else {
//				while (index != name.length()) {
//					if (name.charAt(index) <= 'N') {
//						c = 'A';
//						for (int i = 0; i < name.charAt(index) - 'A'; i++) {
//							answer++;
//							c++;
//						}
//						sb.setCharAt(index, c);
//						if(name.equals(sb.toString())) {
//							System.out.println(sb.toString());
//							System.out.println(answer);
//							return answer;
//						}
//						answer++;
//						
//					} else {
//						c = 'Z' + 1;
//						for (int i = 'Z' - 'A'; i >= name.charAt(index) - 'A'; i--) {
//							answer++;
//							c--;
//						}
//						sb.setCharAt(index, c);
//						if(name.equals(sb.toString())) {
//							System.out.println(sb.toString());
//							System.out.println(answer);
//							return answer;
//						}
//						answer++;
//					}
//					index++;
//				}
//			}
//		}
//		
//		return answer;
//	}
//}

package Naver;

public class webtoon2 {

	public static void main(String[] args) {

		String s = "abcxyasdfasdfxyabc";
		String s2 = "abc";

		String[] res = solution(s);

		for (int i = 0; i < res.length; i++) {
			System.out.print(res + " ");
		}

	}

	private static String[] solution(String s) {
		String[] answer = {};

		int n = s.length();
		String temp1 = "";
		String temp2 = "";

		if (n % 2 == 0) {
			temp1 = s.substring(0, n / 2);
			temp2 = s.substring(n / 2);

			String strTemp ="";
			for (int i = 0; i < temp1.length(); i++) {
				strTemp += temp1.indexOf(i);
			}

		} else {
			temp1 = s.substring(0, n / 2 + 1);
			temp2 = s.substring(n / 2 + 1);
		}

		return answer;
	}

}

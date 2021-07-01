package programmers.level1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class lessons12903 {

	public static void main(String[] args) {

		String s = "abcde";

		String res = solution(s);

		System.out.print(res);

	}

	private static String solution(String s) {
		String answer = "";

		int i = 0;
		if (s.length() % 2 != 0) {
			i = (s.length()) / 2;
			answer = Character.toString(s.charAt(i));
			return answer;
		} else {
			i = (s.length()) / 2;

			answer = Character.toString(s.charAt(i - 1)) + Character.toString(s.charAt(i));
			return answer;
		}
	}

}

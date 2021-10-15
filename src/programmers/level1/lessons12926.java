package programmers.level1;

public class lessons12926 {

	public static void main(String[] args) {

		String s1 = "AB";
		String s2 = "z";
		String s3 = "a B z";

		String res = solution(s1, 1);
		res = solutionOther(s1, 1);
		System.out.println(res);

	}

	//다른 사람 풀이
	private static String solutionOther(String s, int n) {
		String result = "";
		
		n = n % 26;
		
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (Character.isLowerCase(ch)) {
				ch = (char) ((ch - 'a' + n) % 26 + 'a');
			} else if (Character.isUpperCase(ch)) {
				ch = (char) ((ch - 'A' + n) % 26 + 'A');
			}
			result += ch;
		}
		return result;
	}

	private static String solution(String s, int n) {
		String answer = "";

		for (int i = 0; i < s.length(); i++) {
			int temp = s.charAt(i) + n;

			//소문자의 경우
			if (97 <= s.charAt(i) && 122 >= s.charAt(i)) {

				if (temp > 122) {
					int num = 97 + (Math.abs(122 - temp) - 1);

					answer += (char) num + "";
				} else {
					answer += (char) temp + "";
				}

			}
			//대문자의 경우
			else if (65 <= s.charAt(i) && 90 >= s.charAt(i)) {
				if (temp > 90) {
					int num = 65 + (Math.abs(90 - temp) - 1);
					answer += (char) num + "";
				} else {
					answer += (char) temp + "";
				}
			}
			//공백의 경우
			else {
				answer += " ";
			}
		}

		return answer;
	}

}

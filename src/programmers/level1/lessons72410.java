package programmers.level1;

public class lessons72410 {

	public static void main(String[] args) {

		String new_id = "...!@BaT#*..y.abcdefghijklm";
		String new_id2 = "z-+.^.";
		String new_id3 = "=.=";

		String res = solution(new_id);

		System.out.print(res);
	}

	private static String solution(String new_id) {
		String answer = "";

		answer = replace(new_id);
		answer = remove(answer);
		answer = close(answer);
		answer = frontend(answer);
		answer = emptied(answer);
		answer = lengthLong(answer);
		answer = addStr(answer);

		return answer;
	}

	// 2자 이하면 마지막 문자 추가하기
	private static String addStr(String answer) {

		if (answer.length() <= 2) {
			for (int i = answer.length(); i < 3; i++) {
				answer = answer += answer.charAt(answer.length() - 1);
			}
		}

		return answer;
	}

	// 16자 이상이면 삭제
	private static String lengthLong(String answer) {

		if (answer.length() >= 16) {
			answer = answer.substring(0, 15);
		}

		StringBuffer sb = new StringBuffer(answer);

		if (answer.endsWith(".")) {
			sb.deleteCharAt(answer.length() - 1);
		}

		return sb.toString();
	}

	// 비어 있는 문자열이라면 a 추가
	private static String emptied(String answer) {

		if (answer.length() == 0) {
			answer = "a";
		}

		return answer;
	}

	// 처음 혹은 끝에 '.'가 있으면 제거
	private static String frontend(String answer) {

		StringBuffer sb = new StringBuffer(answer);

		if (answer.length() > 0) {
			if (answer.charAt(0) == '.') {
				sb.deleteCharAt(0);

			}else if (answer.charAt(answer.length() - 1) == '.') {
				sb.deleteCharAt(answer.length() - 1);
			}
		}
		
		return sb.toString();
	}

	// 연속된 마침표 하나로 치환
	private static String close(String answer) {

		String temp = answer.toString().replace("..", ".");
		while (temp.contains("..")) {
			temp = temp.replace("..", ".");
		}

		return temp;
	}

	// 지정된 문자외 제거
	private static String remove(String answer) {
		String temp = "";

		for (int i = 0; i < answer.length(); i++) {
			char t = answer.charAt(i);

			if (t >= 'a' && t <= 'z') {
				temp += t;

			} else if (t >= '0' && t <= '9') {
				temp += t;

			} else if (t == '-' || t == '_' || t == '.') {
				temp += t;
			}

		}

		return temp;
	}

	// 대문자를 소문자로 전환
	private static String replace(String new_id) {

		new_id = new_id.toLowerCase();

		return new_id;
	}

}

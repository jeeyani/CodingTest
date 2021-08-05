package programmers.level1;

public class lessons12917 {

	public static void main(String[] args) {
		String s = "Zbcdefg";

		String res = solution(s);
		System.out.println(res);

	}

	private static String solution(String s) {
		String answer = "";

		int j =s.length()-1;
		System.out.print(j);
		for (int i = s.length()-1; i <0 ; i--) {
			answer = String.valueOf(s.charAt(i));
			System.out.print(answer);
		}

		return answer;
	}

}

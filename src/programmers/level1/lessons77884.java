package programmers.level1;

public class lessons77884 {

	public static void main(String[] args) {

		int left = 13;
		int right = 17;

		int res = solution(left, right);

		System.out.println(res);

	}

	private static int solution(int left, int right) {
		int answer = 0;

		int temp = 0;
		for (int i = left; i <= right; i++) {

			temp = divisor(i);
			if (temp % 2 == 0) {
				answer += i;
			} else {
				answer -= i;
			}

		}
		return answer;

	}

	private static int divisor(int n) {
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		return count;
	}

}

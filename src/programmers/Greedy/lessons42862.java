package programmers.Greedy;

public class lessons42862 {

	public static void main(String[] args) {
		/*
		 * int N = 5;
		 * 
		 * int[] lost = { 2, 4 }; int[] reserve = { 1, 3, 5 };
		 */

		int N = 5;

		int[] lost = { 2, 4 };
		int[] reserve = { 3 };

		int res = solution(N, lost, reserve);

		System.out.print(res);

	}

	private static int solution(int n, int[] lost, int[] reserve) {

		int answer = 0;

		int[] listener = new int[n];

		// 도난당한 학생 찾기
		for (int i = 0; i < lost.length; i++) {
			listener[lost[i] - 1] = -1;

		}
		// 여벌가진 학생 찾기
		for (int i = 0; i < reserve.length; i++) {
			listener[reserve[i] - 1] = 1;
		}

		for (int i = 0; i < listener.length; i++) {
			if (listener[i] < 0) {
				if (i != 0 && listener[i-1] > 0) {
					listener[i]++;
					listener[i -1]--;

				} else if (i != n - 1 && listener[i+1] > 0) {
					listener[i]++;
					listener[i + 1]--;
				}
			}

		}

		for (int i = 0; i < listener.length; i++) {
			if (!(listener[i] < 0)) {
				answer++;
			}
		}

		// 수업듣고 있는 사람 확인 용
		for (int i = 0; i < listener.length; i++) {
			System.err.println(listener[i]);
		}

		return answer;
	}

}

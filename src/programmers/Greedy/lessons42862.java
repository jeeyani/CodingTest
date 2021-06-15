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

		int answer = n;

		int[] listener = new int[n];

		// 도난당한 학생 찾기
		for (int l : lost) listener[l-1]--;
		
		// 여벌가진 학생 찾기
		 for (int r : reserve) listener[r-1]++;

		//수업에 참여할 수 있는 학생 구하기
		for (int i = 0; i < listener.length; i++) {
			
			if (listener[i] == -1) {
				//맨 처음학생이 아니고, 앞학생이 여벌을 가지고 있는 학생인 경우
				if (i-1 >=0 && listener[i-1] == 1) {
					listener[i]++;
					listener[i -1]--;

				//맨 뒤 학생이 아니고, 뒤 학생이 여벌을 가지고 있는 경우
				} else if (i+1 < listener.length && listener[i+1]==1) {
					listener[i]++;
					listener[i + 1]--;
					
				//맨 앞, 맨뒤 학생이 도난 당한 경우 미리 빼두기
				} else {
					answer --;
				}
			}

		}

		return answer;
	}

}

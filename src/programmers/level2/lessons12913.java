package programmers.level2;

import java.util.Arrays;

public class lessons12913 {

	public static void main(String[] args) {

		int[][] land = { { 1, 2, 3, 5 }, { 5, 6, 7, 8 }, { 4, 3, 2, 1 } };

		int res = 0;
		res = solution(land);
		res = solution2(land);

		System.out.println(res);

	}

	//다른사람 풀이
	private static int solution2(int[][] land) {
		for (int i = 1; i < land.length; i++) {
			for (int j = 0; j < land[0].length; j++) {
				int sum = 0;
				for (int k = 0; k < land[0].length; k++) { //index를 제외한 최고값
					if (k == j)
						continue; //해당 index 제외
					else
						sum = Math.max(sum, land[i - 1][k]);
				}
				land[i][j] += sum;
			}
		}

		Arrays.sort(land[land.length - 1]);
		return land[land.length - 1][land[0].length - 1];
	}

	//실패..
	private static int solution(int[][] land) {
		int answer = 0;

		int savePoint = 0;
		int max = 0;
		int point = 4;
		for (int i = 0; i < land.length; i++) {

			max = land[i][0];

			for (int j = 0; j < point; j++) {

				if (max < land[i][j]) {
					max = land[i][j];
					savePoint = j;
				}

			}
			point = savePoint;
			answer += max;
		}
		return answer;
	}

}

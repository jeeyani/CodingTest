package programmers.WeeklyChallenge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class eightWeek {

	public static void main(String[] args) {

		int[][] sizes1 = { { 60, 50 }, { 30, 70 }, { 60, 30 }, { 80, 40 } };
		int[][] sizes2 = { { 10, 7 }, { 12, 3 }, { 8, 15 }, { 14, 7 }, { 5, 15 } };
		int[][] sizes3 = { { 14, 4 }, { 19, 6 }, { 6, 16 }, { 18, 7 }, { 7, 11 } };

		int result = solution(sizes1);

		result = solution2(sizes1);

		System.out.println(result);

	}

	//다른 사람풀이
	private static int solution2(int[][] sizes) {
		int max = 0;
		int min = 0;

		for (int[] size : sizes) {
			int paramMax = Math.max(size[0], size[1]);
			int paramMin = Math.min(size[0], size[1]);

			if (paramMax > max) {
				max = paramMax;
			}

			if (paramMin > min) {
				min = paramMin;
			}
		}
		return max * min;
	}

	//내 풀이
	private static int solution(int[][] sizes) {
		int answer = 0;

		//1. 전체 사이즈 내림차순 정렬하기 - 가장큰 수 찾기

		List<Integer> Tlist = new ArrayList<>();

		for (int i = 0; i < sizes.length; i++) {
			for (int j = 0; j < sizes[0].length; j++) {
				Tlist.add(sizes[i][j]);
			}
		}

		//정렬
		Collections.sort(Tlist, Collections.reverseOrder());

		//2. 가장큰 사이즈 저장
		int f_size = Tlist.get(0);

		//각 명함에서의 가장 작은 사이즈만 모아두기(중복제거)
		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < sizes.length; i++) {

			if (sizes[i][0] > sizes[i][1]) {
				list.add(sizes[i][1]);
			} else {
				list.add(sizes[i][0]);
			}
		}

		//중복제거
		List<Integer> listSmall = new ArrayList<>();

		for (int i = 0; i < list.size(); i++) {
			if (!listSmall.contains(list.get(i))) {
				listSmall.add(list.get(i));
			}
		}

		Collections.sort(listSmall, Collections.reverseOrder());

		int s_size = listSmall.get(0); //가장작은 사이즈 중에 가장 큰 값

		answer = f_size * s_size;

		return answer;
	}

}

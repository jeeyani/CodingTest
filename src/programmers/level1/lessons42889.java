package programmers.level1;

import java.util.*;

public class lessons42889 {

	public static void main(String[] args) {
		int N = 5;
		int[] stages = { 2, 1, 2, 6, 2, 4, 3, 3 };

		int[] res = solution(N, stages);

		for (int i = 0; i < res.length; i++) {
			System.out.print(res);
		}

	}

	private static int[] solution(int N, int[] stages) {
		int[] answer = new int[N];

		Map<Integer, Double> map = new HashMap<Integer, Double>();
		// double[] failureRate = new double[N];
		int user = stages.length;

		for (int i = 1; i <= N; i++) {
			int arrive = 0;
			for (int j = 0; j < stages.length; j++) {

				if (i == stages[j]) {
					arrive++;
				}
			}

			// failureRate[i-1] = (double)arrive/user;
			map.put(i, (double) arrive / user);
			user = user - arrive;

		}

		List<Integer> keySetList = new ArrayList<>(map.keySet());

		Collections.sort(keySetList, (o1, o2) -> (map.get(o2).compareTo(map.get(o1))));

		int k = 0;
		for (Integer key : keySetList) {
			System.out.println("key : " + key + " / " + "value : " + map.get(key));
			answer[k] = key;
			k++;
		}

		return answer;
	}

}

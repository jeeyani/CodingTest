package Baekjoon.ExhaustiveSearch;

import java.util.Arrays;
import java.util.Scanner;

public class n10819_permutation {

	static int n;
	static int[] arr;
	static int result;
	static int[] tArr;
	static boolean[] visited;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		Arrays.sort(arr);

		visited = new boolean[n];
		tArr = new int[n]; // 각순열 케이스를 담아줄 임시 저장소

		result = 0;
		solve(0); //n!만큼 재귀
		System.out.println(result);
	}

	private static void solve(int count) {
		if (count == n) {
			int sum = 0;
			for (int i = 0; i < n - 1; i++) {
				sum += Math.abs(tArr[i] - tArr[i + 1]);
			}
			result = Math.max(result, sum);
			return;
		}

		for (int i = 0; i < n; i++) { // 각순열 케이스생성
			if (visited[i]) {
				continue;
			}
			visited[i] = true;
			tArr[count] = arr[i];// 담는다.
			solve(count + 1);// 재귀로 그 다음 index 늘려간다.
			visited[i] = false;// 다 만들고 false로 해제
		}

	}

}

package Baekjoon.Greedy;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class n2217 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N;
		N =sc.nextInt();
		
		Integer[] loopCount = new Integer[N];
		for (int i = 0; i < loopCount.length; i++) {
			loopCount[i] = sc.nextInt();
		}
		
		Loop(N,loopCount);

	}

	private static void Loop(int n, Integer[] loopCount) {
		
		int temp;
		int MAX = 0;

		Arrays.sort(loopCount,Collections.reverseOrder());
		for (int i = 0; i < n; i++) {
			temp = (i+1)*loopCount[i];
			if (temp > MAX) {
				MAX = temp;
			}
		}
		System.out.println(MAX);
	}

}

package Baekjoon.Greedy;

import java.util.Scanner;

public class n2217 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N;
		N =sc.nextInt();
		
		int loopCount[] = new int[N];
		for (int i = 0; i < loopCount.length; i++) {
			loopCount[i] = sc.nextInt();
		}
		
		Loop(N,loopCount);

	}

	private static void Loop(int n, int[] loopCount) {
		int temp;
		int MAX = n*loopCount[0];
		
		for (int i = 0; i < loopCount.length; i++) {
			temp = n*loopCount[i];
			if(MAX > temp) {
				MAX = temp;
			}
		}
		System.out.println(MAX);
	}

}

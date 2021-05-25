package Baekjoon.Realization;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class n1010 {

	public static int[][] dp = new int[30][30];
	
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < T; i++) {
			
			int N = Integer.parseInt(br.readLine());
			int M = Integer.parseInt(br.readLine());
			
			System.out.println(combi(N,M));
			
		}
		

	}

	private static int combi(int n, int r) {
		
		if(dp[n][r] > 0) {
			return dp[n][r];
		}
		
		//nCn = nC1 = 1 설정
		if(n==r || n == 0) {
			return dp[n][r] = 1;
		}
		
		//n+1Cr+1 = nCr + nCr+1
		return combi(n-1, r-1) + combi(n-1, r);
	}

}

package Baekjoon.Realization;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class n1010 {

	public static int[][] dp = new int[30][30];
	
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < T; i++) {
			
			st = new StringTokenizer(br.readLine()," ");
			
			// M개중 N개를 뽑는 경우이므로 nCr 에서 n = M, r = N이다.
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			
			sb.append(combi(M, N)).append('\n');
			
		}
		
		System.out.println(sb);

	}

	private static int combi(int n, int r) {
		
		if(dp[n][r] > 0) {
			return dp[n][r];
		}
		
		//nCn = nC1 = 1 성질
		if(n==r || r == 0) {
			return dp[n][r] = 1;
		}
		
		//n+1Cr+1 = nCr + nCr+1 성질
		return dp[n][r] = combi(n-1, r-1) + combi(n-1, r);
	}

}

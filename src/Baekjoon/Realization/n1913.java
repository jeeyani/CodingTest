package Baekjoon.Realization;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n1913 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		//입력값
		int n = Integer.valueOf(br.readLine());
		int k = Integer.valueOf(br.readLine());
		
		int[][] result = drawSnail(n);
		int kx = 0;
		int ky = 0;
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[0].length; j++) {
				
				sb.append(result[i][j]).append(" ");
				
				if(result[i][j] == k) {
					kx = i+1;
					ky = j+1;
				}
			}
			sb.append("\n");
		}
		
		System.out.print(sb.toString());
		System.out.println(kx+" "+ky);
		
	}

	private static int[][] drawSnail(int n) {
		
		int[][] snail = new int[n][n];
		int startValue = 1;
		int moveCnt = 1;
		
		int x = n/2;
		int y = n/2;
		snail[x][y] = startValue++;
		
		while(true) {
			
			//상
			for (int i = 0; i < moveCnt; i++) {
				snail[--x][y] = startValue++;
				
				//(0,0) 이면 끝!
				if(x == 0 && y == 0) return snail;
			}
			
			//우
			for (int i = 0; i < moveCnt; i++) {
				snail[x][++y] = startValue++;
				
			}
			
			moveCnt++;
			
			//하
			for (int i = 0; i < moveCnt; i++) {
				snail[++x][y] = startValue++;
				
			}
			
			//좌
			for (int i = 0; i < moveCnt; i++) {
				snail[x][--y] = startValue++;
				
			}
			
			moveCnt++;
			
			
		}
		
		//return snail;
	}

}

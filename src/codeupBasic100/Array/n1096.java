package codeupBasic100.Array;

import java.util.*;

public class n1096 {
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int n = sc.nextInt();
		int x,y;
		
		int[][] table = new int[20][20];
		
		for (int i = 0; i < n; i++) {
			x = sc.nextInt();
			y = sc.nextInt();
			
			table[x][y] = 1;
		}
		
		for (int i = 1; i <= 19; i++) {
			for (int j = 1; j <= 19; j++) {
				System.out.print(table[i][j]+" ");
			}
			System.out.print("\n");
		}
		
	}
	
	
}
	
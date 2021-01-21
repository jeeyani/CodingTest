package codeupBasic100.Array;

import java.util.*;

public class n1097 {
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
			
		int[][] table = new int[20][20];
		
		for (int i = 1; i <=19; i++) {
			for (int j = 1; j <=19; j++) {
				table[i][j] = sc.nextInt();
			}
		}
		
		int n = sc.nextInt();
		int x,y;
		for (int i = 1; i <=n; i++) {
			x = sc.nextInt();
			y = sc.nextInt();
			
			for (int j = 1; j <=19; j++) {
				if(table[x][j]==0) {
					table[x][j]=1;
				}else {
					table[x][j]=0;
				}
			}
			for (int j = 1; j <=19; j++) {
				if(table[j][y]==0) {
					table[j][y]=1;
				}else {
					table[j][y]=0;
				}
			}
		}
		
		
		for (int i = 1; i <=19; i++) {
			for (int j = 1; j <=19; j++) {
				System.out.print(table[i][j]+" ");
			}
			System.out.print("\n");
		}
		
	}
	
	
}
	
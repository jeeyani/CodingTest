package codeupBasic100.Synthesis;

import java.util.*;

public class n1084 {
	public static Scanner sc = new Scanner(System.in); //너무 느려서 시간초과 문제 발생 ㅠㅠ
	
	public static void main(String[] args) {
		
		int r = sc.nextInt();
		int g = sc.nextInt();
		int b = sc.nextInt();
		
		int count =0;
		
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < g; j++) {
				for (int j2 = 0; j2 < b; j2++) {
					System.out.printf("%d %d %d \n", i,j,j2);
					count++;
				}
			}
		}
		System.out.printf("%d", count);
	
		
	}
	
	
}
	
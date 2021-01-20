package codeupBasic100.Synthesis;

import java.util.*;

public class n1089 {
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int a = sc.nextInt();
		int d = sc.nextInt();
		int n = sc.nextInt();
		
		
		for (int i = 0; i < n-1; i++) {
			a +=d;
		}
		System.out.print(a);
	}
	
	
}
	
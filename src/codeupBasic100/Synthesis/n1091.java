package codeupBasic100.Synthesis;

import java.util.*;

public class n1091 {
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		long a = sc.nextInt();
		long m = sc.nextInt();
		long d = sc.nextInt();
		long n = sc.nextInt(); 
		
		
		for (int i = 0; i < n-1; i++) {
			a =(a*m)+d;
		}
		System.out.print(a);
	}
	
	
}
	
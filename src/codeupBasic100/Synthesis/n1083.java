package codeupBasic100.Synthesis;

import java.util.*;

public class n1083 {
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		String n = sc.next();
		int a = Integer.valueOf(n,16);
		
		for (int i = 1; i < 16; i++) {
			
			System.out.printf("%X*%X=%X\n",a,i,a*i);
		}
		

		
	}
	
	
}
	
package codeupBasic100.Synthesis;

import java.util.*;

public class n1085 {
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		long h = sc.nextLong(); 
		long b = sc.nextLong(); 
		long c = sc.nextLong(); 
		long s = sc.nextLong(); 
		
		double result = h*b*c*s;
		result =((result/8)/Math.pow(2, 10))/Math.pow(2, 10);
		
		System.out.printf("%.1f MB",result);
	
		
	}
	
	
}
	
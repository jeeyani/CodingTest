package codeupBasic100.Synthesis;

import java.util.*;

public class n1086 {
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int w = sc.nextInt(); 
		int h = sc.nextInt(); 
		int b = sc.nextInt();  
	 
		
		double result = h*b*w;
		result =((result/8)/Math.pow(2, 10))/Math.pow(2, 10);
		
		System.out.printf("%.2f MB",result);
	
		
	}
	
	
}
	
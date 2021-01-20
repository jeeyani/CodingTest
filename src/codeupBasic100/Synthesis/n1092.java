package codeupBasic100.Synthesis;

import java.util.*;

public class n1092 {
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int day =1;
		
		while (day%a!=0 || day%b!=0 || day%c!=0) {
			day++;
			
		}

		System.out.print(day);
		
	}
	
	
}
	
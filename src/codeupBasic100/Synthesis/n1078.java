package codeupBasic100.Synthesis;

import java.util.*;

public class n1078 {
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int n = sc.nextInt();
		int sum=0;
		for (int i = 1; i <= n; i++) {
			if(i%2==0) {
				sum +=i;
			}
		}
		System.out.println(sum);
	}
	
	
}
	
package codeupBasic100.Synthesis;

import java.util.*;

public class n1087 {
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int n = sc.nextInt();
		sc.nextLine();
		
		int sum=0;
		
		for (int i = 1; i <= n; i++) {
			sum+=i;
			
			if(sum>=n) break;
		}
	
		System.out.print(sum);
		
	}
	
	
}
	
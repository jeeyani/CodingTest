package codeupBasic100.Ternary;

import java.util.*;

public class n1064 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		System.out.printf("%d", (a>b? b:a)>c ? c:(a>b? b:a));
		

	}
	
}
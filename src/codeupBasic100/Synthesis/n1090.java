package codeupBasic100.Synthesis;

import java.util.*;

public class n1090 {
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		long a = sc.nextInt();
		long d = sc.nextInt();
		long n = sc.nextInt(); // 10 10 10 경우 int타입은 오버플로우 발생
		
		
		for (int i = 0; i < n-1; i++) {
			a *=d;
		}
		System.out.print(a);
	}
	
	
}
	
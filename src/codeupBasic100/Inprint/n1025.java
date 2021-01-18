package codeupBasic100.Inprint;


import java.util.*;

public class n1025 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String n = sc.next();
		int newN = Integer.parseInt(n);
		
		int a = newN-(newN%10000);
		int b = newN-a-(newN%1000);
		int c = newN-(a+b)-(newN%100);
		int d = newN-(a+b+c)-(newN%10);
		int e = newN-(a+b+c+d)-(newN%1);
		
		System.out.println("["+a+"]");
		System.out.println("["+b+"]");
		System.out.println("["+c+"]");
		System.out.println("["+d+"]");
		System.out.println("["+e+"]");
	}
}

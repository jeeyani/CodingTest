package codeupBasic100.Inprint;


import java.util.*;

public class n1025_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String n[] = sc.next().split("");
		int count = 5;
		
		for(String s: n) {
			count --;
			System.out.print("["+s);
			for (int i = 0; i < count; i++) {
				System.out.print("0");
			}
			System.out.println("]");
		}
		
	}
}

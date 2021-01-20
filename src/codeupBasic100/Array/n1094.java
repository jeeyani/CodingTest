package codeupBasic100.Array;

import java.util.*;

public class n1094 {
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int n = sc.nextInt();
		int[] num = new int[n];
		
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}
		sc.nextLine();
		
		for (int i = num.length-1; i >= 0; i--) {
			System.out.print(num[i]+" ");
		}
		
	}
	
	
}
	
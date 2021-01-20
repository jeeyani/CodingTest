package codeupBasic100.Array;

import java.util.*;

public class n1095 {
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int n = sc.nextInt();
		int[] num = new int[n];
		
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}
		sc.nextLine();
		
		Arrays.sort(num);
		
		System.out.print(num[0]);
		
		
	}
	
	
}
	
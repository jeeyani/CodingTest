package codeupBasic100.Array;

import java.util.*;

public class n1093 {
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int n = sc.nextInt();
		int[] num = new int[n];
		
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}
		sc.nextLine();
		
		int[] request = new int[24];
		
	
		for (int i = 0; i < num.length; i++) {
			request[num[i]]++;
		}
		
		for (int i = 1; i < request.length; i++) {
			System.out.print(request[i]+" ");
		}
		
	}
	
	
}
	
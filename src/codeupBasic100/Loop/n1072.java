package codeupBasic100.Loop;

import java.util.*;

public class n1072 {
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		sc.nextLine();
		inputResult(arr); //n개 갯수만큼 정수 입력받고 출력

		
	}
	
	public static void inputResult(int[] a) {
		
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		} 
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
	}
		

}
	
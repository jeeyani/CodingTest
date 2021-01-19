package codeupBasic100.SelectionRun;

import java.util.*;

public class n1066 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int[] list = new int[3];
		list[0] = a;
		list[1] = b;
		list[2] = c;

		for (int i = 0; i < list.length; i++) {
			if(list[i]%2==0) {
				System.out.println("even");
			}
			else {
				System.out.println("odd");
			}
			
		}

	}
	
}
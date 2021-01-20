package codeupBasic100.Loop;

import java.util.*;

public class n1076 {
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		String n = sc.nextLine();
		char newN = n.charAt(0);
		
		int start = 97;
		
		
		do {
			
			
			System.out.print((char)start+" ");
			if(start == newN) break;
			start ++;
			
		} while (true);
		
		
	}
	
	
}
	
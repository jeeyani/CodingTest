package codeupBasic100.SelectionRun;

import java.util.*;

public class n1069 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String a = sc.next();
		char b = a.charAt(0);
		
		switch (b) {
		case 'A': 
			System.out.print("best!!!");
			break;
			
		case 'B':
			System.out.print("good!!");
			break;
			
		case 'C':
			System.out.print("run!");
			break;
			
		case 'D':
			System.out.print("slowly~");
			break;

		default:
			System.out.print("what?");
			break;
		}
		
	}

}
	
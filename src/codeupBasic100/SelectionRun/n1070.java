package codeupBasic100.SelectionRun;

import java.util.*;

public class n1070 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		
		switch (a) {

		case 3:		
		case 4:
		case 5:
			System.out.print("spring");
			break;
			
		case 6:	
		case 7:
		case 8:
			System.out.print("summer");
			break;
			
		case 9:
		case 10:
		case 11:
			System.out.print("fall");
			break;
			
		default : 
			System.out.print("winter");
			break;
		}
		
	}

}
	
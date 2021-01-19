package codeupBasic100.SelectionRun;

import java.util.*;

public class n1068 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		
		if(a>=90) {
			System.out.print("A");
		}
		else if(a>=70 && a<=89) {
			System.out.print("B");
		}
		else if(a>=40 && a<=69) {
			System.out.print("C");
		}
		else {
			System.out.print("D");
		}
		
	}

}
	
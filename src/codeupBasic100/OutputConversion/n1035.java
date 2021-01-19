package codeupBasic100.OutputConversion;

import java.util.*;

public class n1035 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next(); 
		int b = Integer.valueOf(a,16); //8진수의 int타입으로 변환
		
		System.out.print(String.format("%o", b));
	
	}
}

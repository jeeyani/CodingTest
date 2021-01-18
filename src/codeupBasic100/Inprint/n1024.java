package codeupBasic100.Inprint;


import java.util.*;

public class n1024 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		char[] list = new char[str.length()]; //입력받은 문자 길이만큼 char배열 선언
		
		for (int j = 0; j < str.length(); j++) {
			list[j] = str.charAt(j);
		}
		
		for (int i = 0; i < list.length; i++) {
			System.out.println("\'"+list[i]+"\'");
		}
	}
}

package codeupBasic100.Loop;

import java.util.*;

public class n1071 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String a = sc.nextLine();
		String newA[] = a.split(" ");
		
		printResult(newA); //자바에서는 goto를 구현할 수 없기 때문에 함수를 사용
		
	}
	
	public static void printResult(String[] a) {
		
		int[] temp = new int[a.length];
		
		for (int i = 0; i < a.length; i++) {
			temp[i] = Integer.parseInt(a[i]);
		}
		
		for (int i = 0; i < temp.length; i++) {
			if(temp[i]==0) {
				break;
			}
			System.out.println(temp[i]);
		}
		
	}

}
	
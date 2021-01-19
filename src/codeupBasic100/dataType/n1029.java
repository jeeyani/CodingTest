package codeupBasic100.dataType;

import java.util.*;

public class n1029 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next(); //자바에는 따로 unsigned 변수타입이 따로 없음으로 String타입으로 받고
		
		System.out.print(Long.parseLong(a)); //초과된 범위까지 출력하기 위해 8byte범위인 롱으로 변환하여 출력
	
	}
}

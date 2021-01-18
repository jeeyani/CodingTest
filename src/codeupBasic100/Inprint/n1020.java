package codeupBasic100.Inprint;


import java.util.*;

public class n1020 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		
		String[] res = n.split("-");
		
		String frist = res[0];
		String end = res[1];
		
		System.out.print(frist+end);
	}
}

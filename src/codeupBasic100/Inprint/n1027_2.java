package codeupBasic100.Inprint;


import java.text.*;
import java.util.*;

public class n1027_2 {
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		
		String[] str = n.split("\\.");
		
		System.out.printf("%s-%s-%s",str[2],str[1],str[0]);
	
	}
}

package codeupBasic100.Inprint;

import java.text.SimpleDateFormat;
import java.util.*;

public class n1019 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		
		Date after = new SimpleDateFormat("yyyy.mm.dd").parse(n); //string > date
		String newN = new SimpleDateFormat("yyyy.mm.dd").format(after);//date >> string
		
		System.out.print(newN);
	}
}

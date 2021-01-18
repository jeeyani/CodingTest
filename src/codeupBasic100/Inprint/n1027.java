package codeupBasic100.Inprint;


import java.text.*;
import java.util.*;

public class n1027 {
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		
		Date after = new SimpleDateFormat("yyyy.mm.dd").parse(n); //string > date
		String newN = new SimpleDateFormat("dd-mm-yyyy").format(after);//date >> string
		
		System.out.print(newN);
	
	}
}

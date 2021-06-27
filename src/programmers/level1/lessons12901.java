package programmers.level1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class lessons12901 {

	public static void main(String[] args) {
		
		int a =5 ;
		int b = 24;
		
		String res = solution(a,b);

		System.out.print(res);

	}

	private static String solution(int a, int b) {
		String answer = "";
        Calendar cal = Calendar.getInstance();
        cal.set(2016, a-1, b);
        Date date = cal.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("E", Locale.ENGLISH);
          
        answer = sdf.format(date).toUpperCase();
        
        return answer;
	}

	

}

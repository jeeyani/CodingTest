package Kakao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class internship2021_1 {

	public static void main(String[] args) {
		
		String s = "eightseven4one";
	
		int result = new SolutionNumGame().solution(s);
		
		
		System.out.print(result);
	

	}

}


class SolutionNumGame {
	
	public static String[] number= {"0","1","2","3","4","5","6","7","8","9"};
	public static String[] eng = {"zero","one","two","three","four","five","six","seven","eight","nine"};
		
    public int solution(String s) {
		int answer = 0;

		/*String[] tempAns = new String[50];
		String temp = "";
		
		//문자열 있는지 찾기
		for (int i = 0; i < eng.length; i++) {
			int index = 0;
			
			if(s.contains(eng[i])) {
				index = s.indexOf(eng[i]);
				tempAns[index] =number[i];
			}
			if(s.contains(number[i])) {
				index = s.indexOf(number[i]);
				tempAns[index] =number[i];
			}
		}
		
		for (int i = 0; i < tempAns.length; i++) {
			if(tempAns[i] != null) {
				temp += tempAns[i];
			}
		}
		
		answer = Integer.parseInt(temp);*/
		
		
		for (int i = 0; i < eng.length; i++) {
			if(s.contains(eng[i])) {
				s = s.replace(eng[i], number[i]);
			}
		}
		
	
		answer = Integer.parseInt(s);
		

		return answer;
    }

	
}

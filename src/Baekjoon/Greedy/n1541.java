package Baekjoon.Greedy;

import java.util.Scanner;

public class n1541 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input;
		input = sc.nextLine();
		LostBracket(input);

	}

	private static void LostBracket(String input) {
		String[] splitList;
		
		splitList = input.split("-");
		
		int sum = Integer.parseInt(splitList[0]);
		
		for (int i = 1; i < splitList.length; i++) {
			
			String[] intList;
			if(splitList[i].length() > 1) {
				intList = splitList[i].split("\\+");
				for (int j = 0; j < intList.length; j++) {
					sum -=Integer.parseInt(intList[j]);
				}

			}else {sum-=Integer.parseInt(splitList[i]);}
		}
		System.out.println(sum);
	}

}

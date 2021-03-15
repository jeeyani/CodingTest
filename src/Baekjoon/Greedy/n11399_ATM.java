package Baekjoon.Greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class n11399_ATM {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n =0;
		
		List<Integer> list = new ArrayList<Integer>();
		
		n= sc.nextInt();
		for (int i = 0; i < n; i++) {
			int temp = sc.nextInt();
			list.add(temp);
		}
		
		ATM(list);

	}
	
	public static void ATM(List list) {
		
		Collections.sort(list);
		
		
		int sum=(int)list.get(0);
		int total=0;
		for (int i = 1; i < list.size(); i++) {
			sum += (int)list.get(i);
			total += sum;
		}
		
		System.out.println(total+(int)list.get(0));
		
		
	}

}

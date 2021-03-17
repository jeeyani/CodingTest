package Baekjoon.Greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class n11047 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	      
	      int n;
	      int k;
	      int temp;
	      
	      List<Integer> list = new ArrayList<>();
	      
	      n = sc.nextInt();
	      k = sc.nextInt();
	      for (int i = 0; i < n; i++) {
	         temp = sc.nextInt();
	         list.add(temp);
	      }
	      
	      result(n,k,list);

	   }

	   private static void result(int n, int k, List<Integer> list) {
	      
	      Collections.sort(list,Collections.reverseOrder());
	      
	      
	      int sum=0;
	      for (int i = 0; i < n; i++) {
	         
	         if(list.get(i) <=k) {
	        	 sum += k/(int)list.get(i);
	        	 k = k%(int)list.get(i);
	        	 
	         }
	         
	   
	      }
	      
	      System.out.println(sum);
	   }

}
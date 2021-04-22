package Baekjoon.Sorting;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;


public class n2751 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		 
		for (int i = 0; i < n; i++) {
			arr.add(Integer.parseInt(br.readLine())); 
		}
		//단순 Arrays.sort 사용시 시간초과발생
		//Timsort 사용하기 
		Collections.sort(arr);
		
		for(int item : arr) {
			sb.append(item).append("\n");
		}
		
		System.out.println(sb);

	}

}

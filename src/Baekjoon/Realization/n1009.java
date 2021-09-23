package Baekjoon.Realization;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class n1009 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		List<Integer> list = new ArrayList<>();
		
		for (int i = 0; i < T; i++) {
			String str = br.readLine();
			StringTokenizer st = new StringTokenizer(str," ");
			
			int[] temp =  new int[2];
			
			for (int j = 0; j < temp.length; j++) {
				temp[j] = Integer.parseInt(st.nextToken());
			}
			int c = 1;
			for (int j = 0; j < temp[1]; j++) {
				c *=temp[0];
				c %=10;
			}
			 
			if(c == 0) {
				c = 10;
			}
			list.add(c);
		}
		
		
		for (int i = 0; i < T; i++) {
			System.out.println(list.get(i));
		}

	}

}

package Baekjoon.Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class n11034 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = "";
		
		/* EOF처리하기 */
		while((str = br.readLine())!= null) {

			StringTokenizer st = new StringTokenizer(str," ");

			
			int[] location =  new int[3];
			
			for (int i = 0; i < location.length; i++) {
				location[i] = Integer.parseInt(st.nextToken());
			}

			int a = (location[1] - location[0]) -1;
			int b = (location[2] - location[1]) -1;
			
			int result = (a>=b)? a:b;
			
			
			
			System.out.println(result);
			
		}
		
		
		

	}

}

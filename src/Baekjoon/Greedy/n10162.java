package Baekjoon.Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n10162 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		int[] timer = {300, 60, 10};
		int[] countT = new int[3];
		
		while(T>0) {
			//1. 300초 보다 클 경우
			if(T>=timer[0]) {
				T = T-timer[0];
				countT[0]++;
				
			}else {
				//2. 60초 보다 클 경우
				if(T>=timer[1]) {
					
					T = T-timer[1];
					countT[1]++;
					
				}else {
					
					T = T-timer[2];
					countT[2]++;
					
				}
				
			}
			
		}
		
		if(T%10 != 0 ) {
			
			System.out.print(-1);
			
		}else {
			for (int i = 0; i < countT.length; i++) {
				System.out.print(countT[i]+" ");
			}
		}
		
		
		
	}
	
}

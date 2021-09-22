package Baekjoon.Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n2720 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());
		int[] money = new int[T];
		
		for (int i = 0; i < money.length; i++) {
			money[i] = Integer.parseInt(br.readLine());
		}
		
		int[] coin = {25, 10, 5, 1};
		

		for (int i = 0; i < T; i++) {
			
			int[] countT = new int[4];
			
			for (int j = 0; j < coin.length; j++) {
				countT[j] = money[i] / coin[j];
				money[i] %= coin[j];
			}
			
			for (int j = 0; j < countT.length; j++) {
				System.out.print(countT[j] + " ");
			}
			System.out.println("");
		}
		
		

	}

}

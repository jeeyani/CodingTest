package Baekjoon.Binary;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class n10815 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	
	public static void main(String[] args) throws Exception{
		int user = Integer.parseInt(br.readLine());
		String[] userCard = br.readLine().split(" ");
		
		int M = Integer.parseInt(br.readLine());
		String[] mCard= br.readLine().split(" ");
		
		int[] result = new int[mCard.length];
		for (int i = 0; i < mCard.length; i++) {
			U: for (int j = 0; j < userCard.length; j++) {
				if(userCard[j].equals(mCard[i])) {
					result[i] = 1;
					break U;
				}
			}
		}
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]+ " ");
		}
	}

}

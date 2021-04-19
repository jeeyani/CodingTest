package Baekjoon.Binary;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class n10815 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


	public static void main(String[] args) throws Exception{
		int user = Integer.parseInt(br.readLine()); //상근이 카드 수
		String[] userCard = new String[user];
		userCard = br.readLine().split(" "); //상근이 카드 값
		
		int[] userIntCard = new int[user];
		
		for (int i = 0; i < userCard.length; i++) {
			userIntCard[i] = Integer.parseInt(userCard[i]);
		}
		
		Arrays.sort(userIntCard); // 상근이 카드 정렬

		int M = Integer.parseInt(br.readLine()); //비교할 카드의 수
		String[] mCard= new String[M]; //비교할 카드의 값
		mCard= br.readLine().split(" "); //비교할 카드의 값
		
		int[] mIntCard = new int[M];
		for (int i = 0; i < mIntCard.length; i++) {
			mIntCard[i] = Integer.parseInt(mCard[i]);
		}
		
		
		for (int i = 0; i < M; i++) {
			int result = binaryCard(userIntCard, mIntCard[i], 0, user-1);
			System.out.print(result+" ");
		}
	}


	private static int binaryCard(int[] userIntCard, int target, int start, int end) {
		
		if (start > end) return 0;
        int mid = (start + end) / 2;
        if (userIntCard[mid] == target) return 1;
        else if (userIntCard[mid] > target) return binaryCard(userIntCard, target, start, mid - 1);
        else return binaryCard(userIntCard, target, mid + 1, end);
		
		
	}

}
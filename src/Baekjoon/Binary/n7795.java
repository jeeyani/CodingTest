package Baekjoon.Binary;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;


public class n7795 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws Exception {
		int testCase = Integer.parseInt(br.readLine());

		for (int i = 0; i < testCase; i++) {
			String[] countTemp = br.readLine().split(" ");
			int aCount = Integer.parseInt(countTemp[0]);
			int bCount = Integer.parseInt(countTemp[1]);
			
			int[] aList = new int[aCount];
			int[] bList = new int[bCount];
			
			String[] aTemp = br.readLine().split(" ");
			String[] bTemp = br.readLine().split(" ");
			
			for (int j = 0; j < aCount; j++) {
				aList[j]=Integer.parseInt(aTemp[j]);
			}
			
			for (int k = 0; k < bCount; k++) {
				bList[k]=Integer.parseInt(bTemp[k]);
			}
			
			Arrays.sort(bList);
			
			System.out.println(sovle(aList,bList));
		}
		
	}

	private static int sovle(int[] aList, int[] bList) {
		
		int count = 0;
		
		for (int i = 0; i < aList.length; i++) {
			bList:for (int j = 0; j < bList.length; j++) {
				if (aList[i] > bList[j]) {
					count++;
				}else break bList;
			}
		}
		
		return count;
	}

}

package Baekjoon.Binary;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class n7795 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws Exception {
		int testCase = Integer.parseInt(br.readLine());

		for (int i = 0; i < testCase; i++) {
			String[] countTemp = br.readLine().split(" ");
			int aCount = Integer.parseInt(countTemp[0]);
			int bCount = Integer.parseInt(countTemp[1]);
			
			List<Integer> aList = new ArrayList<Integer>();
			List<Integer> bList = new ArrayList<Integer>();
			
			String[] aTemp = br.readLine().split(" ");
			String[] bTemp = br.readLine().split(" ");
			
			for (int j = 0; j < aCount; j++) {
				aList.add(Integer.parseInt(aTemp[j]));
			}
			
			for (int k = 0; k < bCount; k++) {
				bList.add(Integer.parseInt(bTemp[k]));
			}
			
			System.out.println(sovle(aList,bList));
		}
		
	}

	private static int sovle(List<Integer> aList, List<Integer> bList) {
		
		int count = 0;
		
		for (int i = 0; i < aList.size(); i++) {
			for (int j = 0; j < bList.size(); j++) {
				if (aList.get(i) > bList.get(j)) {
					count++;
				}
			}
		}
		
		return count;
	}

}

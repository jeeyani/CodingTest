package Baekjoon.Greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class n1744 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws Exception {
		int testCase = Integer.parseInt(br.readLine());
		
		List<Integer> list = new ArrayList<Integer>();
		
		String[] inputSeq = br.readLine().split(" ");
		for (int i = 0; i < inputSeq.length; i++) {
			list.add(Integer.parseInt(inputSeq[i]));
		}

		Collections.sort(list, Comparator.reverseOrder());
		
		int sum = 0;
		int temp = 0;
		for (int i = 0; i < inputSeq.length; i++) {
			if(list.get(i-1)*list.get(i) !=0 && list.get(i-1)*list.get(i)>0) {
				temp = list.get(i-1)*list.get(i);
				sum+=temp;
				i+=2;
				continue;
			}else {
				sum+=list.get(i-1);
			}
		}
		System.out.println(sum);
	}

}

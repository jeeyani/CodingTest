package Baekjoon.ExhaustiveSearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class n1969 {

	static String[] nucleotide = {"A","C","G","T"};
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		//입력
		int n = Integer.valueOf(st.nextToken());
		int m = Integer.valueOf(st.nextToken());
		
		String[] str = new String[n];
		
		for (int i = 0; i < n; i++) {
			str[i] = br.readLine();
		}
		
		//1. Hamming Distance의 합이 가장 작은 DNA 구하기
		String result ="";

		for (int i = 0; i < m; i++) {
			int[] nucleotideCnt = new int[4];
			
			for (int j = 0; j < n; j++) {
				
				switch (str[j].charAt(i)) {
				case 'A':
					nucleotideCnt[0]++;
					break;
				case 'T':
					nucleotideCnt[3]++;
					break;
				case 'G':
					nucleotideCnt[2]++;
					break;
				case 'C':
					nucleotideCnt[1]++;
					break;

				}
			}
			int max = 0;
			int maxIdx = 0;
			for (int j = 0; j < nucleotideCnt.length; j++) {
				if(max < nucleotideCnt[j]) {
					max = nucleotideCnt[j];
					maxIdx = j;
				}
			}
			
			result += nucleotide[maxIdx];
			
		}

		System.out.println(result);
		
		//2.Hamming Distance의 합 구하기
		int cnt = 0;
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if(result.charAt(j) != str[i].charAt(j)) cnt++;
			}
		}
		
		System.out.println(cnt);
		
	}

}

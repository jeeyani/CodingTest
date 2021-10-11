package Baekjoon.Binary;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class n17266 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		
		int[] lamp =  new int[M];
		int lampHeight = 0;

		StringTokenizer st = new StringTokenizer(br.readLine());
		
		//전등 위치
		for (int i = 0; i < lamp.length; i++) {
			lamp[i] = Integer.parseInt(st.nextToken());
		}
		
		
		int left = 0;
		int right = N;
		int mid = 0;
		while(left <= right) {
			
			mid = (left+right)/2;
			
			if(isCoverd(mid,lamp,N)) { //해당 높이가 덮어진다면
				lampHeight = mid;
				right = mid -1;
			}else {
				left = mid + 1;
			}
		}
		
		System.out.println(lampHeight);

	}

	//해당 높이가 가로등을 다 덮는지 확인
	private static boolean isCoverd(int h, int[] lamp, int n) {
		
		int darkZone = 0; //darkZone이후 부터 어두워짐
		
		for (int i = 0; i < lamp.length; i++) {
			//덮어질 경우
			if(lamp[i]-h <= darkZone) {
				darkZone = lamp[i]+h;
				
			} else break;
		}
		
		return n - darkZone <= 0; //음수이면, 해당 높이가 모두 커버가능
	}

}

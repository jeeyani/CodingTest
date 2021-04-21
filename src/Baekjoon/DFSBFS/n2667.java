package Baekjoon.DFSBFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class n2667 {
	public static int n;
	public static int[][] home = new int[26][26];
	public static boolean[][] visited;
	public static StringBuilder sb = new StringBuilder();
	
	public static int[] dx= {-1,1,0,0};
	public static int[] dy= {0,0,-1,1};

	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		
		//주소 입력
		for (int i = 0; i < n; i++) {
			String temp = br.readLine();
			for (int j = 0; j < n; j++) {
				home[i][j] = temp.charAt(j)-'0';
			}
		}
		
		visited = new boolean[n][n];
		ArrayList<Integer> countList = new ArrayList<Integer>();
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(checkedLoction(i,j)) {
					int val = DFS(i,j);
					countList.add(val);
				}
			}
		}
		
		Collections.sort(countList);
		sb.append(countList.size()+"\n"); //전체 단지 수
		
		for(int num : countList) { //각 단지안에 가구 수 출력하기
			
			sb.append(num+"\n");
		}
		
		System.out.println(sb);
		
	}

	private static int DFS(int i, int j) {
		
		int val =1;
		visited[i][j] = true;
		
		if(checkedLoction(i-1, j)) {
			val+=DFS(i-1,j);
		}
		if(checkedLoction(i+1, j)) {
			val+=DFS(i+1,j);
		}
		if(checkedLoction(i, j-1)) {
			val+=DFS(i,j-1);
		}
		if(checkedLoction(i, j+1)) {
			val+=DFS(i,j+1);
		}
		
		return val;
	}

	private static boolean checkedLoction(int i, int j) {
		
		if(i <= -1 || i >= n || j <= -1 || j >= n) {
			return false;
		}
		
		if(home[i][j] == 0 || visited[i][j] == true) {
			return false;
		}
		
		//가구를 확인 할 수 있는 곳만 선별
		return true;
	}

}

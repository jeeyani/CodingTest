package Baekjoon.DFSBFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class n1260 {

	public static int n;
	public static int m;
	public static int start;
	
	public static boolean[] visited;
	public static int[][] graph = new int[1001][1001];
	
	
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] input = br.readLine().split(" ");
		n = Integer.parseInt(input[0]);
		m = Integer.parseInt(input[1]);
		start = Integer.parseInt(input[2]);
				
		visited = new boolean[1001];

		//연결된 정보 입력받기
		for (int i = 0; i < m; i++) {
			String[] temp = br.readLine().split(" ");
			int x = Integer.parseInt(temp[0]);
			int y = Integer.parseInt(temp[1]);
			
			graph[x][y] = graph[y][x] = 1;
		}
		
		DFS(start);
		System.out.println("");
		
		visited = new boolean[1001]; //초기화
		BFS();
		
	} 


	private static void BFS() {
		
		Queue<Integer> q = new LinkedList<Integer>();
		
		//시작점 체크
		q.offer(start);
		visited[start] = true;
		System.out.print(start+" ");
		
		
		while(!q.isEmpty()) {
			//값 먼저 꺼내기
			int x = q.poll();
			
			for (int i = 1; i <= n; i++) {
				//연결되어 있는 곳이고 방문하지 않은 곳이면 
				if(graph[x][i] == 1 && visited[i] == false) {
					q.offer(i);
					visited[i] = true;
					System.out.print(i+" ");
				}
			}
			
			
		}
		
	}


	private static void DFS(int start) {
		//방문표시
		visited[start] = true;
		System.out.print(start +" ");
		
		for (int i = 1; i <=n ; i++) {
			//연결되어 있는 곳이고 방문하지 않은 곳이면 
			if(graph[start][i] == 1 && visited[i] == false) {
				DFS(i);
			}
		}
	}

}

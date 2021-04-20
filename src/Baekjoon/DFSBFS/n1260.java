package Baekjoon.DFSBFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class n1260 {

	public static int n;
	public static int m;
	public static int start;
	
	public static boolean[] visiteDFS;
	public static boolean[] visiteBFS;
	public static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
	
	
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] input = br.readLine().split(" ");
		n = Integer.parseInt(input[0]);
		m = Integer.parseInt(input[1]);
		start = Integer.parseInt(input[2]);
		
		visiteDFS = new boolean[m+1];
		visiteBFS = new boolean[m+1];
		
		for (int i = 0; i < m+1; i++) {
			graph.add(new ArrayList<Integer>());
		}

		//연결된 정보 입력받기
		for (int i = 0; i < m; i++) {
			String[] graphIn = br.readLine().split(" ");
			graph.get(Integer.parseInt(graphIn[0])).add(Integer.parseInt(graphIn[1]));
		}
		
		DFS(start);
		System.out.println("");
		BFS(start);
		
	}


	private static void BFS(int start) {
		
		Queue<Integer> q = new LinkedList<Integer>();
		
		q.offer(start);
		visiteBFS[start] = true;
		
		while(!q.isEmpty()) {
			int x = q.poll();
			System.out.print(x+" ");
			
			for (int i = 0; i < graph.get(x).size(); i++) {
				int y = graph.get(x).get(i);
				if(!visiteBFS[y]) {
					q.offer(y);
					visiteBFS[y] = true;
				}
			}
		}
		
	}


	private static void DFS(int start) {
		visiteDFS[start] = true;
		System.out.print(start +" ");
		
		for (int i = 0; i < graph.get(start).size(); i++) {
			int y = graph.get(start).get(i);
			if(!visiteDFS[y]) {
				DFS(y);
			}
		}
	}

}

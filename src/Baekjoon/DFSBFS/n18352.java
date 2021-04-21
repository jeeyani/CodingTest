package Baekjoon.DFSBFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class n18352 {

	public static int n,m,path, x;
	public static ArrayList<ArrayList<Integer>> map = new ArrayList<ArrayList<Integer>>();
	public static int[] distance = new int[300001];
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] str = br.readLine().split(" ");
		n = Integer.parseInt(str[0]);
		m = Integer.parseInt(str[1]);
		path = Integer.parseInt(str[2]);
		x = Integer.parseInt(str[3]);
		
		//최단 거리값 초기화
		for (int i = 0; i <= n; i++) {
			map.add(new ArrayList<Integer>());
			distance[i] =-1;
		}
		
		// 도시간의 연결 입력받기
		for (int i = 0; i < m; i++) {
			String[] temp = br.readLine().split(" ");
			int x = Integer.parseInt(temp[0]);
			int y = Integer.parseInt(temp[1]);
			
			map.get(x).add(y);
		}
		
		//시작도시는 0으로 초기화
		distance[x] = 0;
		
		
		//BFS탐색으로 각 노드간의 거리 체크하기
		Queue<Integer> q = new LinkedList<Integer>();
		q.offer(x);
		
		while(!q.isEmpty()) {
			int now = q.poll();
			
			for (int i = 0; i < map.get(now).size(); i++) {
				int next = map.get(now).get(i);
				
				if(distance[next]== -1) {
					distance[next] = distance[now] +1;
					q.offer(next);
				}
				
			}
		}
		
		//거리정보 확인하기
		boolean check = false;
		for (int i = 1; i <=n; i++) {
			if(distance[i] == path) {
				System.out.println(i);
				check = true;
			}
		}
		
		//해당 거리에 맞는 도시가 없을 경우 -1
		if(!check) {
			System.out.println(-1);
		}
		
		
	}

}

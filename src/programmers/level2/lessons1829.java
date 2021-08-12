package programmers.level2;

import java.util.LinkedList;
import java.util.Queue;import javax.crypto.AEADBadTagException;

public class lessons1829 {

	public static void main(String[] args) {
		int m = 6;
		int n = 4;
		int[][] picture = {{1, 1, 1, 0}, {1, 2, 2, 0}, {1, 0, 0, 1}, {0, 0, 0, 1}, {0, 0, 0, 3}, {0, 0, 0, 3}};
		
		int[] result = solution(m,n,picture);
		
		for (int j = 0; j < result.length; j++) {
			System.out.print(result[j]+" ");
		}
		
	}
	
	static int[] dx = {-1,1,0,0};
	static int[] dy = {0,0,-1,1};
	
	static class Node{
		int x;
		int y;
		
		public Node(int x,int y){
			this.x=x;
			this.y=y;
		}
	}
	
	static Queue<Node> q = new LinkedList<lessons1829.Node>();
	static boolean[][] visited; //방문한 위치 체크
	static int areaSize =0; //영역의 갯수

	private static int[] solution(int m, int n, int[][] picture) {

        int numberOfArea = 0;
        int maxSizeOfOneArea = 0;
        
        visited = new boolean[m][n];
        
        for (int i = 0; i < picture.length; i++) {
			for (int j = 0; j < picture.length; j++) {
				if(picture[i][j] > 0 && visited[i][j] != true) {//방문 안한곳 탐사
					areaSize = 1; //방문하자 마다 사이즈 1로 초기화
					bfs(picture,i,j,m,n);
					numberOfArea++;
					if (maxSizeOfOneArea < areaSize) {
						maxSizeOfOneArea = areaSize;
					}
				}
			}
		}

        
        int[] answer = new int[2];
        
        
        answer[0] = numberOfArea;
        answer[1] = maxSizeOfOneArea;
        return answer;
	}

	private static void bfs(int[][] picture, int x, int y, int m, int n) {
		q.add(new Node(x, y));
		visited[x][y] = true; //방문 처리
		
		while (!q.isEmpty()) {
			
			Node now = q.poll();
			
			for (int i = 0; i < 4; i++) {
				int nx = now.x + dx[i];
				int ny = now.y + dy[i];
				
				if(0 <= nx && nx < m && 0 <= ny && ny < n) { //영역을 벗어나지 않을 떄
					if(picture[nx][ny] == picture[x][y] && visited[nx][ny] != true){ //같은 영역과 방문하지 않은 곳일 때
                        q.add(new Node(nx, ny));
                        visited[nx][ny] = true;
                        areaSize++; // 지나온 칸의 개수
                    
                    }
				}
				
			}
			
		}
	}

}

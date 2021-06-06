package programmers.level1;

import java.util.Arrays;

public class lessons64061_success {

	
	static int[] basket;
	static int count=0;
	
	public static void main(String[] args) {
		int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
		
		int[] moves = {1,5,3,5,1,2,1,4};
		
		int res = solution(board, moves);
		
		System.out.print(res);
	}
	
	public static int solution(int[][] board, int[] moves) {
		
		basket = new int[moves.length];
		
        int answer = 0;
        
        for (int i = 0; i < moves.length; i++) {
			
        	fingDoll(board,moves[i]);
        	
		}
        
        answer = removeDoll(basket);
        
        return answer;
    }

	//사라진 인형 갯수 구하기
	private static int removeDoll(int[] basket) {
		
		int notSameCount =1;
		
		for (int i = 1; i < basket.length; i++) {
			
			if(basket[i-1] != basket[i]) {
				notSameCount++;
			}
			
		}
		
		int[] temp;
		temp = new int[notSameCount];
		int basketIndex = 1;
		temp[0] = basket[0];
		
		for (int i = 1; i < basket.length; i++) {
			if(basket[i-1] != basket[i]) {
				temp[basketIndex] = basket[i];
				basketIndex ++;
			} else count++;
			
		}
		
		
		return count*2;
	}

	/** 크레인이 집는 인형 찾기*/
	private static void fingDoll(int[][] board, int n) {
		
		for (int i = 0; i < board.length; i++) {
			//아무것도 없으면 패스
			if(board[i][n-1] == 0) continue; 
			
			else {
				//바구니에 인형 담기
				basket[i] = board[i][n-1];
				
				//바구니에 넣은 인형자리는 0으로 만들기
				board[i][n-1] = 0; // 
				
			}
		}

	}

}

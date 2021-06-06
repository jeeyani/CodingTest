package programmers.level1;

import java.util.Arrays;
import java.util.Stack;

public class lessons64061 {
	public int solution(int[][] board, int[] moves) {
		int answer = 0;

		//크레인이 뽑을 인형을 받을 stack
		Stack<Integer> stack = new Stack<>();

		//stack은 맨 위 값과 비교하는데, 아무것도 없을시 오류하는 것을 방지하기 위해 0을 넣어줌
		stack.push(0);

		//크레인이 움직이는 만큼 for돌려주기
		for (int move : moves) {
			for (int j = 0; j < board.length; j++) {

				//1. 인형이 존재한다면 stack에 넣어주기
				if (board[j][move - 1] != 0) {

					//이전에 넣은 인형과 같은 인형이라면 삭제해주기
					if (stack.peek() == board[j][move - 1]) {
						stack.pop();
						answer += 2;
					} else {
						stack.push(board[j][move - 1]);
					}
					
					//바구니에 넣었다면, 현재 위치는 0으로 만들기
					board[j][move - 1] = 0;
					break;
				}
			}
		}
		return answer;
	}

}

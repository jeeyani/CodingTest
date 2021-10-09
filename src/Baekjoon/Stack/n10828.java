package Baekjoon.Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.EmptyStackException;
import java.util.Stack;
import java.util.StringTokenizer;

public class n10828 {

	/*
	 * System.out.print 출력시 런타임 오류 발생!!!
	 * 
	 * StringBuilder 사용하여 수정
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<Integer>();
		
		for (int i = 0; i < n; i++) {
			
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			String temp = st.nextToken();
			Integer answer =0;
			
			if(temp.equals("push")) {
				int num = Integer.parseInt(st.nextToken());
				
				stack.add(num);	
			}
			
			if(temp.equals("top")) {
				answer = stack.peek();
				sb.append(answer+"\n");
				
			}
			
			if(temp.equals("size")) {
				answer  = stack.size();
				sb.append(answer+"\n");
				
			}
			if(temp.equals("empty")) {
				if(stack.size() == 0) {
					sb.append(1+"\n");
				}else {
					sb.append(0+"\n");
				}

			}
			if(temp.equals("pop")) {
				try {
					answer  = stack.pop();
					sb.append(answer+"\n");
				} catch (EmptyStackException e) {
					sb.append(-1+"\n");
				}
				
			}
			
		}
		
		System.out.println(sb);

	}

}

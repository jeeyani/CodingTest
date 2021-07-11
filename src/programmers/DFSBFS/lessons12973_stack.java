package programmers.DFSBFS;

import java.util.Stack;

public class lessons12973_stack {

	public static void main(String[] args) {
		
		String s = "baaaabbbcbb";
		
		int res = solution(s);
		System.out.println(res);

	}

	private static int solution(String s) {
		int answer = -1;
        Stack<String> stack = new Stack<String>();
        
        for(int i =0; i<s.length(); i++){
            if(stack.isEmpty()){
                stack.push(String.valueOf(s.charAt(i)));
            } else{
                String temp = stack.peek();
                String currTemp = String.valueOf(s.charAt(i));
                
                if(temp.equals(currTemp)){
                    stack.pop();
                }else{
                    stack.push(currTemp);
                }
            }
        }
        
        answer = stack.size() == 0? 1 : 0;
        
        return answer;
	}

}

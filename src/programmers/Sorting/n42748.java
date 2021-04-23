package programmers.Sorting;

import java.util.Arrays;

public class n42748 {

	public static void main(String[] args) {
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		
		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

		System.out.println(new Solution().solution(array, commands));
		
	}

}

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        //return 배열
        int[] answer = new int[commands.length];
        
        //자른 배열을 저장
        int[] temp = {};
        
        for(int i=0; i<commands.length; i++){
            
            int start = commands[i][0];
            int end = commands[i][1];
            
            for(int j=0; j<(start-end)+1; j++){
                temp[j] = array[start-1];
                start +=1;
                
            }
            
            Arrays.sort(temp);
            
            for(int j=0; j<temp.length; j++){
                if(temp[j] == commands[i][2]){
                    answer[i] = temp[j];
                }
            }
            
        }
        
        
        return answer;
    }
}

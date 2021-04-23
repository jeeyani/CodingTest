package programmers.Sorting;

import java.util.Arrays;

public class n42748 {

	public static void main(String[] args) {
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		
		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

		int[] result = new Solution().solution(array, commands);
		
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i]);
		}
		
	}

}

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        //return 배열
        int[] answer = new int[commands.length];

        for(int i=0; i<commands.length; i++) {
            
            int start = commands[i][0];
            int end = commands[i][1];
            //자른 배열을 저장
            int[] temp = new int[end-start+1];
            
            int n = start;
            for(int j=0; j<(end-start)+1; j++){
                temp[j] = array[n-1];
                n +=1;
                
            }
            
            Arrays.sort(temp);
            for (int j = 0; j < temp.length; j++) {
				System.out.print(temp[j]);
			}
            
            System.out.println();
            
            int set = commands[i][2];
            
            answer[i] = temp[set-1];
             
            
        }
        
        
        return answer;
    }
}

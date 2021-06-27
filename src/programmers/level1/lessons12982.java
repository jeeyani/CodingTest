package programmers.level1;

import java.util.*;

public class lessons12982 {

	public static void main(String[] args) {
		
		int[] d = {1,3,2,5,4};
		int[] d2= {2,2,3,3};
		
		int res = solution(d,9);

		System.out.print(res);
		
	}

	private static int solution(int[] d, int budget) {
		int answer = 0;
        
        Arrays.sort(d);
        
        int sum=0;
       
        for(int i=0; i<d.length; i++){
            
            sum += d[i];
            if(sum <= budget){
            	answer ++;
            }
            else {break;}
            
        }
        
        
        return answer;
	}

}

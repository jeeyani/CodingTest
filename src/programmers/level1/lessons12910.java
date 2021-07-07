package programmers.level1;

import java.util.*;

public class lessons12910 {

	public static void main(String[] args) {
		int[] arr = {10, 9, 7, 5};
		int divisor =5; 
		
		int[] res = solution(arr,divisor);
		
		for (int i = 0; i < res.length; i++) {
			System.out.print(res[i]);
		}
		
	}

	private static int[] solution(int[] arr, int divisor) {
ArrayList<Integer> list = new ArrayList<Integer>();
        
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] %divisor ==0){
                list.add(arr[i]);
                count ++;
            }
        }
        if(count <= 0){
            list.add(-1);
        }
        
        Collections.sort(list);
        
        int[] answer = new int[list.size()];
        for(int i=0; i<answer.length; i++){
            answer[i] = list.get(i);
        }
        
        return answer;
	}

}

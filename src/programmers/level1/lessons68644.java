package programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lessons68644 {

	class Solution {
	    public int[] solution(int[] numbers) {
	    	
	    	int sum=0;
	    	
	    	List<Integer> list = new ArrayList<Integer>();
	    	
	    	for(int i=0; i<numbers.length-1; i++) {
		    	for (int j = i+1; j < numbers.length; j++) {
		    		sum = numbers[j]+numbers[j];
		    		
		    		if(list.indexOf(sum) <0) { //중복된 값이 없으면 -1을 리턴
		    			list.add(sum);
		    		}
				}
	    	}
	       
	    	int[] answer = new int[list.size()];
	    	
	    	for (int i = 0; i < answer.length; i++) {
				answer[i] = list.get(i);
			}
	    	
	    	Arrays.sort(answer);
	    	
	        return answer;
	    }
	}

}

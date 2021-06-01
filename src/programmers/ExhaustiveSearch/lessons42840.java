package programmers.ExhaustiveSearch;

import java.util.ArrayList;

public class lessons42840 {

	public int[] solution(int[] answers) {
        
		
		int[] num1 = {1,2,3,4,5};
		int[] num2 = {2,1,2,3,2,4,2,5};
		int[] num3 = {3,3,1,1,2,2,4,4,5,5};
		
		int[] scoreNum = new int[3];
		
        
        
        for (int i = 0; i < answers.length; i++) {
			if(answers[i]==num1[i%num1.length]) {
				
				scoreNum[0]++;
			}
			
			if(answers[i]==num2[i%num2.length]) {
				scoreNum[1]++;
			}

			if(answers[i]==num3[i%num3.length]) {
				scoreNum[2]++;
			}
		}
        
      int max = Math.max(Math.max(scoreNum[0], scoreNum[1]), scoreNum[2]);
      
      ArrayList<Integer> list = new ArrayList<>();
      
      if (scoreNum[0]==max) {list.add(1);}
      if (scoreNum[1]==max) {list.add(2);}
      if (scoreNum[2]==max) {list.add(3);}
        
      int[] result = new int[list.size()];
      
      for (int i = 0; i < result.length; i++) {
		result[i] = list.get(i);
      }
      
        return result;
    }

}

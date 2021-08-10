package programmers.WeeklyChallenge;

public class SecondWeek {

	public static void main(String[] args) {
		int[][] scores = {{100,90,98,88,65},{50,45,99,85,77},{47,88,95,80,67},{61,57,100,80,65},{24,90,94,75,65}};

		String res = solution(scores);
		System.out.println(res);
		
	}

	private static String solution(int[][] scores) {
		String answer = "";
        
        double[] avg = new double[scores.length];
        int tmepArry =0;
        int maxArr;
        int minArr;
        int sum;
        
        for(int i=0; i<scores[0].length; i++){
            tmepArry = scores[i][i];
            sum =0;
            maxArr =-1;
            minArr =101;
            
            for(int j=0; j<scores.length; j++){
            	
            	if(i==j) continue;
				maxArr = Math.max(maxArr,scores[j][i]);
				minArr = Math.min(minArr,scores[j][i]);
				sum +=scores[j][i];
            }
            
            if(maxArr < tmepArry || minArr > tmepArry){ //유일한 최고 혹은 최저일때 제외

                avg[i] = (double)sum/(scores.length-1);
               
            }else {
            	sum +=tmepArry;
                avg[i] = (double)sum/scores.length;
                
            }
            
        }
        

        for(int i=0; i<avg.length; i++){
        	
        	if(avg[i] >=90) {
        		answer +="A";
        	} else if(avg[i] <90 && avg[i] >=80) {
        		answer +="B";
        	}else if(avg[i] <80 && avg[i] >=70) {
        		answer +="C";
        	}else if(avg[i] <70 && avg[i] >=50) {
        		answer +="D";
        	}else {
        		answer +="F";
        	}

        }
        
        return answer;
	}

}

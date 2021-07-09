package programmers.level1;

public class lessons12916 {

	public static void main(String[] args) {
		String s ="pPoooyY";
		
		boolean res = solution(s);
		System.out.println(res);
	}

	private static boolean solution(String s) {
		boolean answer = true;

        int countP =0;
        int countY =0;

       for(int i=0; i<s.length(); i++){
           
           if(String.valueOf(s.charAt(i)).equalsIgnoreCase("p")){
               countP++;
           }
           
           if(String.valueOf(s.charAt(i)).equalsIgnoreCase("y")){
               countY++;
           }
           
       }
        
        if(countP == countY || countP ==0 && countY==0){
            answer = true;
        }else{ answer = false;}
        
        return answer;
	}

}

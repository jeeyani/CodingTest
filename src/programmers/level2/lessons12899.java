package programmers.level2;

public class lessons12899 {

	public static void main(String[] args) {
		int n = 465462;
		
		String res = solution(n);
		
		System.out.println(res);

	}

	static String[] num = {"4","1","2"};
	
	private static String solution(int n) {
		String answer = "";
	       
        while(n > 0){
            answer = num[n%3] + answer;
            n =(n-1)/3;
        }
        
        
        return answer;
	}

}

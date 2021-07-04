package Naver;


public class webtoon3 {

	public static void main(String[] args) {

		String s="aaaaabbbbb";
		String t="ab";

		int res = solution(s, t);
		
		System.out.print(res);

	}

	private static int solution(String s, String t) {
        int result = 0;      

		while(true) {
			
			s = s.replace(t, "");
			result ++;
			
			if(!s.contains(t)) break;
		}
        
        
        return result;
	}

}

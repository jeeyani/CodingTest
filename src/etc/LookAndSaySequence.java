package etc;

/*
 * 
 * 개미 수열 문제
 * 
 * n번째의 해당하는 결과 값을 리턴하라
 * 
 * */

public class LookAndSaySequence {

	public static void main(String[] args) {
		
		int n = 9;
		
		String result = solution(n);
		System.out.println(result);
		
	}

	private static String solution(int n) {
		String answer = "";
		
		//최대 40번 반복까지 할 수 있음
		for (int i = 0; i < n; i++) {
			
			//첫 시작은 1부터 시작
			if("".equals(answer)) {
				answer = "1";
			}
			
			else {
				
				char[] input = answer.toCharArray(); // 문자형으로 변형하여 넣어주기
				answer = ""; //초기화
				String target = ""; //숫자 갯수를 누적 하자

				//input 하나씩 읽기
				for (int j = 0; j < input.length; j++) {
					
					//첫 문자는 target에 넣기
					if(j==0) {
						target += ""+input[j];
						answer = "1";
					}
					//앞 문자와 같으면 target에 넣기
					else if(target.charAt(0) == input[j]) {
						target += ""+input[j];
					}
					
					//앞 문자와 다르면(새로운문자)이면 answer에 target 수를 넣어주기, 달라진 문자도 target에 넣기
					else {
						
						answer += ""+target.length()+input[j];
						target =""+input[j];
						
					}
					
					//
					if(j == (input.length-1)) {
						answer += ""+ target.length();
					}
					
				}	
				
			}
			
		}
		
		return answer;
		
		
	}

}

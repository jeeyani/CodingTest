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
		
		int n = 40;
		
		String result = solution2(n);
		
		//result = solution2(n);
		System.out.println(result);
		
	}

	private static String solution2(int n) {
		
		String answer ="1";
		
		String next = "";
		int idx = 0;
		
		while(idx < n) {
			
			next = ANT(answer);
			answer = next;
			idx++;
			
		}
		
		
		return answer;
		
	}

	private static String ANT(String answer) {
		
		String next = "";
		
		for (int i = 0; i < answer.length(); i++) {
			// 첫 번째 문자가 아닐 때, 앞 문자와 같으면
			if(i>0) {
				if(answer.charAt(i-1) == answer.charAt(i)) {
					continue;
				}
			}
			//계속 누적하기
			next += numberOf(answer, i);
		}
		
		return next;
		
	}

	//앞 문자와 같지 않은 경우 때부터 같은 문자 숫자 세기
	private static String numberOf(String answer, int index) {
		
		char str = answer.charAt(index);
		int cnt =0;
		
		for (int j = index; j < answer.length(); j++) {
			if(str == answer.charAt(j)) {
				cnt++;
			}else {break;}
			
		}
		return str + Integer.toString(cnt);
	}

	/* 40번째 값이 출력되지 않음 */
	private static String solution(int n) {
		String answer = "";
		
		for (int i = 0; i < n; i++) {
			
			//첫 시작은 1부터 시작
			if("".equals(answer)) {
				answer = "1";
			}
			
			else {
				
				char[] input = answer.toCharArray(); // 문자형으로 변형하여 넣어주기
				answer = ""; //초기화
				String target = ""; //숫자 갯수를 계산해서 누적 하자

				//input 하나씩 읽기
				for (int j = 0; j < input.length; j++) {
					
					//첫 문자는 target에 넣기
					if(j==0) {
						target += ""+input[j];
						answer = "1";
					}
					//첫 문자와 같으면 target에 넣기
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

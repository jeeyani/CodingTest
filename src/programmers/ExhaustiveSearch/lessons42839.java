package programmers.ExhaustiveSearch;

import java.util.ArrayList;

public class lessons42839 {
	
	//소수의 갯수
	static int answer = 0;
	
	//number의 몇번째 인덱스에 방문했는지 체크
	static boolean[] check = new boolean[7];
	
	//number의 각 자리수로 만들 수 있는 조합을 저장
	static ArrayList<Integer> arr = new ArrayList<Integer>();
	
	
	/**  
	 * 
	 * 1~n 자리의 정수를 조합하기 위한 재귀 메소드
	 * 
	 *  **/
	public static void rec(String n, String temp, int len) {
		
		// 종료조건 : 현재 만들고 있는 자릿수가 temp에 붙인 숫자의 길이인 경우
		if(temp.length() == len) {
			
			//중복방지
			if(!arr.contains(Integer.parseInt(temp))) {
				arr.add(Integer.parseInt(temp));
				return;
			}
			
		}
		
		//number배열 탐색
		for (int i = 0; i < n.length(); i++) {
			
			//true 이미 방문한 인덱스이면 패스!
			if(check[i]) continue;
			
			//temp에 붙여나가면서 숫자를 조합
			temp += n.charAt(i);
			
			//temp에 숫자를 조합해놨기 때문에 방문처리
			check[i] = true;
			
			//현재 몇 자리의 수를 만드는지에 대한 정보 len
			rec(n,temp,len);
			
			//조합완료시 false로 처리
			check[i] = false;
			
			//tmep 초기화
			temp = temp.substring(0,temp.length()-1);
		}
		
	}
	
	/**
	 * 
	 * 소수 판별하기
	 * 
	 * **/
	private  static void cal(int n) {
		//0과 1은 소수가 아니므로 바로 종료.
       if(n == 0) return;
       if(n == 1) return;
       
       //2~n의 제곱근까지 돌면서 나누어 떨어지면 소수가 아니므로 메소드 종료.
       for(int i=2;i<=Math.sqrt(n);i++){
           if(n % i == 0) return;
       }
       
       //모두 나누어 떨어지지 않으면 소수이므로 answer 증가.
       answer++;
		
	}

	
	 public int solution(String numbers) {
	        //numers의 각 자리수를 붙여나갈 변수.
	        String temp="";
	        
	        //몇 자리의 수를 만들 지에 대한 반복, 011의 경우 1~3자리의 다양한 숫자 조합이 가능.
	        for(int i = 1;i<=numbers.length();i++){
	            rec(numbers,temp,i);
	        }
	        
	        //만든 모든 조합의 수가 담긴 ArrayList 탐색.
	        for(int x : arr){            
	            //각 정수들이 소수인지 판별하는 함수 호출
	            cal(x);
	        }
	        
	        return answer;
	        
	 }

	

}

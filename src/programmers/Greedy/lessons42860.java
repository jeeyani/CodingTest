package programmers.Greedy;


import java.util.*;

public class lessons42860 {

	public static void main(String[] args) {

		String name1 = "JAZ";
		
		int result = solution(name1);
		System.out.println(result);

	}

	private static int solution(String name) {
		int answer = 0;
		int continue_a = 0; //연속 된 A의 갯수
		int index_a = name.indexOf('A'); //연속된 A가 시작하는 위치
		boolean reverse = false; //왼쪽 방향이 포함되어 있는지 여부
		List<Integer> list_a = new ArrayList<>(); //연속된 A그룹을 담는 리스트
        
        if(index_a > -1){
            for(int i =0; i<name.length(); i++){
                if(continue_a > 0 && name.charAt(i) > 65){ //A가 연속으로 있고난 후 다른 문자 일때
                    list_a.add(continue_a);
                    continue_a = 0;
                }else if(name.charAt(i) == 65){ //A일때 
                    continue_a++;
                }
            }
        } //name이 모두 A인 것을 제외
        
        list_a.sort(Comparator.reverseOrder());
        
        while(!list_a.isEmpty()){ //연속된 A가 있을 경우
            
            int temp = list_a.remove(0); //가장 A가 많이 연속되는 갯수
            
            if(temp == continue_a){ //countinue_a 맨왼쪽이 A일 경우 A의 연속된 갯수
                
                index_a = name.indexOf("A".repeat(temp), index_a+1); //ex)  첫 A 위치 이후 'AAA'의 위치 찾기
                
            }else{ // 맨 왼쪽끝이 A가 아닐경우 
                index_a = name.indexOf("A".repeat(temp)); //'AAA'의 위치 찾기
                continue_a = temp;
            }
            
            if(index_a < continue_a + 1){ //맨왼쪽에 연속된 A가 더 많을 경우 리버스
                reverse = true;
                break;
            }
            
        }
        
        // 위/아래 횟수 계산
        for(char i : name.toCharArray()) {
            answer += Math.min(i-'A', 'Z'-i+1);
        }
 
        // 좌/우 횟수 계산
        // 왼쪽으로 가는 것이 포함되어 있는 경우
        if(reverse) {
            // 오른쪽으로 갔다가 왼쪽으로 가는 경우
            if(index_a > 0) {
                answer += name.length() + index_a - continue_a - 2;
            }
            // 쭉 왼쪽으로 가는 경우
            else answer += name.length() - index_a - continue_a;
        }
        // 오른쪽으로만 가는 경우
        else {
            if(index_a + continue_a == name.length()) {
                // 맨 마지막에 A가 있을 때 : continue_a
                answer += name.length() - 1 - continue_a;
                // 전부 A
                if(answer < 0) answer = 0;
            }
            else {
                answer += name.length() - 1;
            }
        }
        
        
        return answer;
	}

}

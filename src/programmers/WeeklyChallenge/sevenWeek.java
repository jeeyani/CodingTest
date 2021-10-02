package programmers.WeeklyChallenge;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class sevenWeek {

	public static void main(String[] args) {
		
		int[] enter1 = {1,3,2};
		int[] enter2 = {1,4,2,3};
		int[] enter3 = {3,2,1};
		int[] enter4 = {1,4,2,3};
		
		int[] leave1= {1,2,3};
		int[] leave2= {2,1,3,4};
		int[] leave3= {2,1,3};
		int[] leave4= {1,3,2};
		
		int[] result = solution(enter1, leave1);
		result = solutionMap(enter2, leave2);
		
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i]+" ");
		}

	}

	//Map 사용한 다른 사람 풀이
	private static int[] solutionMap(int[] enter, int[] leave) {
		 //결과값 사람 수 만큼 초기화
        int[] answer = new int[enter.length];
        
        //key: 사람의 번호
        Map<Integer, Integer> room =  new HashMap<Integer, Integer>();
        
        //각 입실과 퇴실의 index 초기화
        int eIdx = 0;
        int lIdx = 0;
        
        while(eIdx != enter.length || lIdx != leave.length) {
        	room.put(enter[eIdx],enter[eIdx]);
        	
        	//회의실에 입장한 사람이 있을 경우
        	if(room.size() > 1) {
        		for(int key: room.keySet()) {
        			//방에 들어오면 무조건 만남
        			answer[key-1]++;
        		}
        		//회의실에 들어온 사람은 현재 회의실에 있는 사람 수 만큼 사람은 만남
        		answer[enter[eIdx]-1] += room.size()-2;
        	}
        	
        	while(true) {
        		
        		if(lIdx < leave.length && room.containsKey(leave[lIdx])) {
        			room.remove(leave[lIdx]);
        			lIdx++;
        		}
        		else {
        			break;
        		}
        	}
        	eIdx++;
        }    
		return answer;
	}

	//List 사용한 다른 사람 풀이
	private static int[] solution(int[] enter, int[] leave) {
		 //결과값 사람 수 만큼 초기화
        int[] answer = new int[enter.length];
        
        //인덱스값 초기화
        int idx = 0;
        
        //회의실에 입장한 사람을 담기
        List<Integer> room = new ArrayList<>();
        
        for(int i=0; i< answer.length; i++){
            //입실 넣어주기
            room.add(enter[i]);
            
            //회의실 확인하기
            //방금 들어온 사람은 현재 room.size()-1 만큼 사람과 만남, 이미 room에 있는 사람은 새로운 사람을 만났음 으로 +1증가
            for(int j=0; j<room.size(); j++){
                if(enter[i] == room.get(j)){
                    answer[room.get(j)-1] = room.size()-1;
                }else{
                    answer[room.get(j)-1]++;
                }
            }
            //퇴실한 사람 처리하기
            //입실 한 후 확인하기, leave의 인덱스 값이 room에 있는지 확인
            //있다면, 삭제
            //없다면 그 인덱스에 머무른다
            while(idx<answer.length && room.contains(leave[idx])){
                    room.remove(Integer.valueOf(leave[idx++]));
            }
                
        }
        
        return answer;
	}

}

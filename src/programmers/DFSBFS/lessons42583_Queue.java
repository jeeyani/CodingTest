package programmers.DFSBFS;

import java.util.LinkedList;
import java.util.Queue;

public class lessons42583_Queue {

	public static void main(String[] args) {
		
		int bridge_length1 = 2;
		int weight1 = 10;
		int[] truck_weights1 = {7,4,5,6};
		
		int bridge_length2 = 100;
		int weight2 = 100;
		int[] truck_weights2 = {10};
		
		int bridge_length3 = 100;
		int weight3 = 100;
		int[] truck_weights3 = {10,10,10,10,10,10,10,10,10,10};
		
		int result = solution(bridge_length1,weight1,truck_weights1);
		
		System.out.println(result);

	}


	private static int solution(int bridge_length, int weight, int[] truck_weights) {
		int answer = 0;
		
		Queue<Integer> q =  new LinkedList<Integer>();
		int sum =0;
		
		for(int w : truck_weights) {
			
			while(true) {
				//1. 다리에 아무 트럭도 안지나갈때
				if(q.isEmpty()) {
					q.add(w);
					sum +=w;
					answer++;
					break; //while문만 빠져나가는 거임~!
					
				//2. 트럭이 모두 다리 위에 있는 경우(=가장 먼저 진입한 트럭이 다리의 끝자락에 도착)	
				}else if(q.size() == bridge_length) {
					sum -=q.poll(); //다리는 지난간 트럭의 무게만큼 무게의 합 빼주기
					
				//3. 트럭이 다리위에 있지만 q가 가득차 있지 않은 상태	
				}else {
					if(sum+w > weight) { //무게의 합이 초과되면 0을 대입
						answer++;
						q.add(0);
					}else {
						q.add(w);
						sum +=w;
						answer++;
						break;
					}
				}
			}
			
		}

        return answer+bridge_length; //모든 트럭이 다리를 모두 지나야 하기때문에 더해준다.
	}

}

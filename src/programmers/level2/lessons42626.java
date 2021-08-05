package programmers.level2;

import java.util.PriorityQueue;

public class lessons42626 {

	public static void main(String[] args) {
		int[] scoville = {1, 2, 3, 9, 10, 12};
		int K = 7;

		int result =0;
		result = solution(scoville , K);
	}

	private static int solution(int[] scoville, int K) {
		
		/*우선 순위 큐를 이용*/
		int answer = 0;
        
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for(int i=0; i<scoville.length; i++){
            heap.offer(scoville[i]);
        }
        
        while(heap.peek() < K){
            if(heap.size() < 2) return -1;
            int f1 = heap.poll();
            int f2 = heap.poll();
            
            int newFood = f1 + (f2 * 2);
            heap.offer(newFood);
            answer ++;
            
        }
         
        
        return answer;
	}

}

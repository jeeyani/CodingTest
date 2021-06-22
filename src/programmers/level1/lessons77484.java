package programmers.level1;

public class lessons77484 {

	public static void main(String[] args) {
		int[] lottos1 = {44, 1, 0, 0, 31, 25};
		int[] lottos2 = {0,0,0,0,0,0};
		int[] lottos3 = {45, 4, 35, 20, 3, 9};
		
		int[] win_nums1 = {31,10,45,1,6,19}; 
		int[] win_nums2 = {38, 19, 20, 40, 15, 25}; 
		int[] win_nums3 = {20, 9, 3, 45, 4, 35}; 
		
		int[] res = solution(lottos3, win_nums3);

		for (int i = 0; i < res.length; i++) {
			System.out.print(res[i]+" ");
		}
		

	}
	
	private static int[] solution(int[] lottos, int[] win_nums) {
		int[] answer = new int[2];
		
		int count = 0;
		for (int i = 0; i < lottos.length; i++) {
			for (int j = 0; j < win_nums.length; j++) {
				
				if(lottos[i] == win_nums[j]) {
					count ++;
				}
				
			}
		}
		
		answer[1] = scoreCount(count);
		
		for (int i = 0; i < lottos.length; i++) {
			if(lottos[i] ==0) {
				count++;
			}
		}
		
		answer[0] = scoreCount(count);
		
        return answer;
	}

	private static int scoreCount(int count) {
		
		switch (count) {
		case 6:
			return 1;
		case 5:
			return 2;
		case 4:
			return 3;
		case 3:
			return 4;
		case 2:
			return 5;
		default:
			return 6;
		}
	}

}

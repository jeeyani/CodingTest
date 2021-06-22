package programmers.level1;

public class lessons76501 {

	public static void main(String[] args) {
	
		int[] absolutes = {4,7,12};
		int[] absolutes2 = {1,2,3};
		
		boolean[] signs = {true, false, true};
		boolean[] signs2 = {false, false, true};
		
		int res = solution(absolutes, signs);

		System.out.print(res);

	}

	private static int solution(int[] absolutes, boolean[] signs) {
		int answer = 0;
		
		for (int i = 0; i < signs.length; i++) {
			if(signs[i]) {
				answer +=absolutes[i];
			}else {
				answer -=absolutes[i];
			}
		}
		
		
        return answer;
	}

}

package programmers.level1;

public class lessons70128 {

	public static void main(String[] args) {
		
		int[] a1 = {1,2,3,4};
		int[] a2 = {-1,0,1};
		
		int[] b1 = {-3,-1,0,2};
		int[] b2 = {1,0,-1};
		
		int res = solution(a2,b2);
		
		System.out.print(res);
	}

	private static int solution(int[] a, int[] b) {
		int answer =0;
		
		for (int i = 0; i < a.length; i++) {
			answer +=(a[i]*b[i]);
		}
		
		return answer;
	}

}

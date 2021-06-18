package programmers.level1;

public class lessons12977 {

	public static void main(String[] args) {
		
		int[] num = {1,2,3,4};
		int[] num2= {1,2,7,6,4};
		
		int res = solution(num);

		System.out.print(res);

	}

	private static int solution(int[] num) {
		
		int answer = 0;
		
		for (int i = 0; i < num.length-2; i++) {
			for (int j = i+1; j < num.length-1; j++) {
				for (int k = j+1; k < num.length; k++) {
					if(check(num[i]+num[j]+num[k])) {
						answer ++;
					}
				}
			}
		}
		
		return answer;
	}

	private static boolean check(int sum) {
		
		for (int i = 2; i*i <= sum; i++) {
			if(sum%i ==0){
				return false;
			}			
		}
		return true;
		
	}

}

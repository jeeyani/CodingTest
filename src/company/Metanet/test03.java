package company.Metanet;

public class test03 {
	
	public long[] solution(long n) {
		long[] answer = { 0, 0 };
		int[] week = { 0, 0, 0, 0, 0, 1, 1 }; //월화수목금토일

		
		int min = 0;
		int max = 0;

		
		if(n<3) {
			for (int i = 0; i < week.length-2; i++) {
				int temp = 0;
				
				for (int j = i; j < i+n; j++) {
					temp += week[i];
				}
		
				if (temp <= min) {
					min = temp;
				} else if (temp > max) {
					max = temp;
				}
			}

			
			answer[0] = min;
			answer[1] = max;

			return answer;
			
		} else {
			
			for (int i = 0; i < week.length; i++) {
				int temp = 0;
				
				for (int j = i; j < i+n; j++) {
					temp += week[i];		
				}
				if (temp <= min) {
					min = temp;
				} else if (temp > max) {
					max = temp;
				}
				
			}
			answer[0] = min;
			answer[1] = max;

			return answer;
		}
	}

}

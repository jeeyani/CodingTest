package programmers.level1;

public class lessons12912 {

	public static void main(String[] args) {
		int a = 3;
		int b = 5;
		
		long res = solution(a,b);
		
		System.out.println(res);

	}

	private static long solution(int a, int b) {
		/*long answer = 0;
		
		int temp =0;
		if(b < a){
		    temp = a;
		    a = b;
		    b = temp;
		}
		
		for(int i = a; i<=b; i++){
		    answer +=i;
		}
		
		return answer;*/
		
		 return sumAtoB(Math.min(a, b), Math.max(b, a));
	}

	private static long sumAtoB(long min, long max) {
		//등차수열의 합
		return (max - min + 1) * (min + max) / 2;
	}

}

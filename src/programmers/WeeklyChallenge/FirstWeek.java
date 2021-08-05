package programmers.WeeklyChallenge;

public class FirstWeek {

	public static void main(String[] args) {
		int price = 3;
		int money =20;
		int count = 4;
		
		long result = 0;
		result = Mysolution(price, money, count);
		result = solution2(price, money, count);
		result = solution3(price, money, count);

	}

	private static long solution3(int price, int money, int count) {
		long answer = money;

        for (int cnt = 0; cnt < count; ++cnt) {
            answer -= (price * (cnt + 1));
        }

        return (answer > 0 ? 0 : -answer);
	}

	private static long solution2(int price, int money, int count) {
		return Math.max(price * (count * (count + 1) / 2) - money, 0); //등차수열의 합 공식 n(n-1)/2
	}

	private static long Mysolution(int price, int money, int count) {
		long answer = -1;
        
        long sum =0;
        for(int i =1; i<=count; i++){
            sum += i*price;
        }
        
        if(money > sum){
            answer = 0;
        }else{
            answer = sum - money;
        }

        return answer;
	}

}

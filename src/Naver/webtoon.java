package Naver;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;

public class webtoon {

	public static void main(String[] args) {

		int[] prices = {13000, 88000, 10000};
		int[] discounts = {30,20};

		int res = solution(prices, discounts);

		System.out.print(res);

	}

	private static int solution(int[] prices, int[] discounts) {
		int answer = 0;
		
		Integer[] price = Arrays.stream(prices).boxed().toArray(Integer[]::new);
		Integer[] discount = Arrays.stream(discounts).boxed().toArray(Integer[]::new);
		
		Arrays.sort(price,Collections.reverseOrder());
		Arrays.sort(discount,Collections.reverseOrder());	
		
		for (int i = 0; i < discounts.length; i++) {
			int temp =0;
			temp = price[i]-(price[i] * discount[i]/100);
			answer += temp;
		}

		if(prices.length > discounts.length) {
			for (int i = discount.length; i < prices.length; i++) {
				answer +=price[i];
			}
		}
		
		return answer;
	}

}

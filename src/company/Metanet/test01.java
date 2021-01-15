package company.Metanet;

import java.util.Arrays;

public class test01 {
	public String[] solution(String[] orders) {
        String[] answer = {};
        String[] userID = new String[orders.length];
        String[] foodlist = new String[5]; //최대 주문할 수 있는 음식 수는 5개
        
        Arrays.sort(orders);
        int[] orderCount =new int[userID.length];
        
        for (int i = 1; i < orders.length; i++) {
			String[] food = orders[i-1].split(" ");
			
			if(!userID.equals(food[0])) {
				userID[i-1] = food[0];
			}
			
			for (int j = 1; j < food.length; j++) {
				if(!foodlist.equals(food[i-1])) {
					foodlist[j-1] = food[j];
					orderCount[i-1] +=1;
				}
			}
			
		}
        
        for (int i = 0; i < orderCount.length; i++) {
			
		}
        
        
        return answer;
    }
}
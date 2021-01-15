package company.BankwareGlobal;

import java.util.ArrayList;
import java.util.List;

public class Bankware01 {


	public static void main(String[] args) {

		
		List<String> userMap = new ArrayList<String>();
		
		int result =0;
		
		userMap.add("2 3");
		userMap.add("3 5");
		userMap.add("4 1");
		
		String[] table = userMap.toArray(new String[userMap.size()]);
		for (int i = 0; i < table.length; i++) {
			System.out.println(table);
		}
		/*
		result = maxCount(userMap);
		
		System.out.print(result);*/

	}

	public static int maxCount(List<String> userMap) {
		
		int res=0;
		
		String[] table = userMap.toArray(new String[userMap.size()]);
		int[] row = new int[userMap.size()];
		int[] col = new int[userMap.size()];
		
		
		for (int i = 0; i < table.length; i++) {
			if(i%2 != 0 || i ==0) {
				row[i] = Integer.parseInt(table[i]);
				
			} else if(i%2==0){
				col[i] = Integer.parseInt(table[i]);
			}
		}
		
		int rowMax = 0, rowCount=0;
		int colMax=0, colCount = 0;
		
		for (int i = 0; i < userMap.size(); i++) {
			if(rowMax < row[i]) {
				rowMax = row[i];
				rowCount++;
			}
			
			if(colMax < col[i]) {
				colMax = col[i];
				colCount++;
			}
		}
		
		if(rowMax==colMax) {
			res = 2;
		} else {
			res = 1;
		}
		
		
		return res;
	}

}

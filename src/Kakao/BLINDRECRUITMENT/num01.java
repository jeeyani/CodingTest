package Kakao.BLINDRECRUITMENT;

import java.util.HashMap;
import java.util.Map;

public class num01 {

	public static void main(String[] args) {
		
		String[] id_list = {"muzi", "frodo", "apeach", "neo"};
		String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"}; 
		int k = 2;
		
		int[] result = solution(id_list, report, k);
		
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}

	}

	private static int[] solution(String[] id_list, String[] report, int k) {
		int[] answer = new int[id_list.length];
		

		String[] KoList =  new String[report.length]; //신고당한유저
		Map<Integer, String[]> reportID = new HashMap<>();
		
		//신고당한 유저만 저장
		for (int i = 0; i < report.length; i++) {
			String[] splitTemp = report[i].split(" ");
			KoList[i] = splitTemp[1];
		}
		
		//신고한 유저와 신고당한 유저 저장하기
		for (int i = 0; i < id_list.length; i++) {
			String[] TempKo = new String[200001];
			
			for (int j = 0; j < report.length; j++) {
				String[] splitTemp = report[j].split(" ");
				
				if(id_list[i].equals(splitTemp[0])) {
					TempKo[i] = splitTemp[1];
				} 
			}
			reportID.put(i,TempKo);
		}
		
		
		//신고당한 횟수
		int[] countOk = new int[id_list.length];
		
		for (int i = 0; i < id_list.length; i++) {
			for (int j = 0; j < KoList.length; j++) {
				if(id_list[i].equals(KoList[j])) {
					countOk[i] ++;
				}
			}
		}
		
		//누구를 신고 했는지 
		for (int i = 0; i < countOk.length; i++) {
			if(countOk[i] >=k) {
				
				for (Integer key : reportID.keySet()) {
					String[] value = reportID.get(key);
					
					for (int j = 0; j < value.length; j++) {
						if(id_list[i].equals(value[j])) {
							answer[i]++;
						}
					}
				}
				
			}
		}	
		
		
		for (int i = 0; i < KoList.length; i++) {
			System.out.print(KoList[i]);
		}
		System.out.println(" ");
		
		
		for(Integer key : reportID.keySet()){
		    String[] value = reportID.get(key);
		    System.out.println(key+" : "+value[0]+""+value[1]);
		}
		
		
		System.out.println(" ");
		for (int i = 0; i < countOk.length; i++) {
			System.out.print(countOk[i]);
		}
		
		
        return answer;
	}

}

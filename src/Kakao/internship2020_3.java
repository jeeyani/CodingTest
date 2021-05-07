package Kakao;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class internship2020_3 {

	public static void main(String[] args) {

		// gems를 탐색하면서 하나씩 다른 객체에 저장하며 모든 종류의 gems이 포함되었는지 체크하자

		String[] gems = { "DIA", "RUBY", "RUBY", "DIA", "DIA", "EMERALD", "SAPPHIRE", "DIA" };

		int[] result = new Solution3().solution(gems);

		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i]);
		}

	}

}

class Solution3 {

	private static Set<String> gemType = new HashSet<>(); //순서가 중요하지 않고 빠른 검색이 요구되었기 때문에 HashSet 사용
	private static Queue<String> gemsToBuy = new LinkedList<>(); //a부터 b까지의 gems를 순서대로 저장해야 했기 때문에 Queue 사용
	private static Map<String, Integer> gemsToBuyCount = new HashMap<>(); //Queue에 저장된 각 gems들의 count를 저장해야 했기 때문에 HashMap 사용
	private static int startIndex;

	private static int answerStartIndex;
	private static int answerSize = Integer.MAX_VALUE;

	public int[] solution(String[] gems) {
		//각기 다른 보석타입구하기
		countGemType(gems);
		
		//
		shopGems(gems);
		return new int[] { answerStartIndex + 1, answerStartIndex + answerSize };

	}

	//각기 다른 보석타입 갯수 구하기
	private void countGemType(String[] gems) {
		gemType.addAll(Arrays.asList(gems));//일반배열을 arrayList로 변경

	}
	
	//gems[]를 순서대로 탐색하면서 gem을 gemsToBuy(Queue)에 담고, 조건을 체크하여 답을 업데이트 한다.
	private void shopGems(String[] gems) {
		for (String gem : gems) {
			//1. 구매한 보석에 대한 함수
			addGemsToBuy(gem);
			//2. 중복제거
			removeDuplicateStartGem();
			
			updateAnswer();
		}

	}

	private void addGemsToBuy(String gem) {
		//나열된 순서대로 구매
		gemsToBuy.add(gem);
		updateGemsToBuyCount(gem);

	}
	
	//보석을 몇개를 샀는지 카운팅하기
	private void updateGemsToBuyCount(String gem) {
		//Map타입에 저장되어 있다면 갯수를 추가하기
		//저장되어 있지 않으면 값을 추가하기
		if (gemsToBuyCount.containsKey(gem)) {
			gemsToBuyCount.put(gem, gemsToBuyCount.get(gem) + 1); //["DIA", 2]
		} else {
			gemsToBuyCount.put(gem, 1); //["DIA", 1]
		}

	}
	
	//gemsToBuy(Queue)의 맨 첫 번째 gem이 맨 뒤에 또 들어 온다면 최단 구간이 아니게 되므로, 맨 첫 번째 gem을 삭제하는 메소드
	//이 때 gemsToBuyCount를 통해 이미 존재하는 gem인지 아닌지 확인
	private void removeDuplicateStartGem() {
		while (true) {
			String startGem = gemsToBuy.peek(); // 큐에 저장된 순서대로 추출
			int startGemCount = gemsToBuyCount.get(startGem); //큐에서 꺼낸 보석을 몇번이나 샀는지에 관한 카운트
			
			//한번이상 구매를 했다면
			if (startGemCount > 1) {
				gemsToBuyCount.put(startGem, startGemCount - 1);
				gemsToBuy.poll();
				startIndex++;
				System.out.println("startIndex"+startIndex);
			} else {
				break;
			}
		}

	}
	
	//gemsToBuy(Queue)에 모든 gemType(Set)이 포함되어 있고, gemsToBuy(Queue)의 길이가 현재까지 구한 최단 구간의 길이보다 작은 경우 최종 답을 업데이트
	private void updateAnswer() {
		//진열대 번호가 제일 작은 구간
		if (gemsToBuyCount.size() == gemType.size() && answerSize > gemsToBuy.size()) {
			answerStartIndex = startIndex;
			answerSize = gemsToBuy.size();
		}

	}

	

}

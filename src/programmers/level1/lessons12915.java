package programmers.level1;

import java.util.*;
import java.util.Map.Entry;

public class lessons12915 {

	public static void main(String[] args) {

		String[] strings = { "sun", "bed", "car" };
		int n = 1;
		String[] strings2 = { "abce", "abcd", "cdx" };
		int n2 = 2;

		String[] res = solution(strings2, n2);

		for (int i = 0; i < res.length; i++) {
			System.out.print(res[i] + " ");
		}

	}

	private static String[] solution(String[] strings, int n) {
		String[] answer = new String[strings.length];

		Character[] temp = new Character[strings.length];
		Map<Character, String> map = new HashMap<>();

		for (int i = 0; i < strings.length; i++) {
			temp[i] = strings[i].charAt(n);
			map.put(temp[i], strings[i]);
		}
	
		Iterator<Character> iter = map.keySet().iterator(); 
		while(iter.hasNext()) { 
			Character key = iter.next(); 
		
			String value = (String) map.get(key); 
		
			System.out.println(key + " : " + value);
			
		}

		
		
		List<Entry<Character, String>> list_entries = new ArrayList<Entry<Character, String>>(map.entrySet());

		// 비교함수 Comparator를 사용하여 오름차순으로 정렬
		Collections.sort(list_entries, new Comparator<Entry<Character, String>>() {
			// compare로 값을 비교
			public int compare(Entry<Character, String> obj1, Entry<Character, String> obj2) {
				// 오름 차순 정렬
				return obj1.getKey().compareTo(obj2.getKey());
			}

		});
		
		for (int i = 0; i < answer.length; i++) {
			answer[i] = list_entries.get(i).getValue();
		}
		

		return answer;
	}

}

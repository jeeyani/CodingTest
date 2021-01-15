package programmers.level1;

import java.util.Arrays;

public class lessons42576 {

	public static void main(String[] args) {
		String[] participant = {"leo","kiki","eden"};
		String[] completion = {"kiki","eden"};
		
		String res = solution(participant, completion);
		
		System.out.print(res);
	}
	
	public static String solution(String[] participant, String[] completion) {
		String answer = "";
		String temp = "";
		
		Arrays.sort(participant);
		Arrays.sort(completion);
		
		for (int i = 0; i < completion.length; i++) {
			
			if (!participant[i].equals(completion[i])) {
				temp = participant[i];
				return temp; //답은 어차피 하나임으로 이미 답이 나왔다면 리턴해주자!!
			}
				
		}
		
		if(!temp.equals("")) {
			answer = temp;
		} else {
			answer = participant[participant.length-1];
		}

		return answer;
	}

}

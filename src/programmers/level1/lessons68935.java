package programmers.level1;

import java.util.ArrayList;

public class lessons68935 {

	public static void main(String[] args) {
		int n = 45;

		int res = solution(n);
		System.out.println(res);

	}
	
	public static ArrayList<Integer> list = new ArrayList<>();

	private static int solution(int n) {
		int answer = 0;

		ArrayList<Integer> ternaryResult = ternary(n);

		answer = decimal(ternaryResult);

		return answer;
	}

	private static int decimal(ArrayList<Integer> n) {
		int res =0;
        
        for(int i=0; i<n.size(); i++){
            res +=(n.get(i))*(Math.pow(3,n.size()-i-1));
        }
       return res;

	}

	private static ArrayList<Integer> ternary(int n) {
		while(true){
            if(n<3){
                list.add(n);
                break;
            }
            list.add(n%3);
			n = n / 3;

        }

		return list;
	}

}

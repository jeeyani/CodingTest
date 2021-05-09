package Kakao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class internship2021_2 {

	public static void main(String[] args) {
		
		String[][] places = {{"POOOP", "OXXOX", "OPXPX", "OOXOX", "POXXP"}, {"POOPX", "OXPXP", "PXXXO", "OXXXO", "OOOPP"},
							{"PXOPX", "OXOXP", "OXPXX", "OXXXP", "POOXX"}, {"OOOXX", "XOOOX", "OOOXX", "OXOOX", "OOOOO"}, {"PXPXP", "XPXPX", "PXPXP", "XPXPX", "PXPXP"}};
		
	
		int[] result = new SolutionDistancing().solution(places);
		
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i]);
		}
		

	}

}


class SolutionDistancing {
	
	ArrayList<Integer> locationX = new ArrayList<Integer>();
	ArrayList<Integer> locationY = new ArrayList<Integer>();

    public int[] solution(String[][] places) {
		int[] answer = new int[places.length];
		
		for (int i = 0; i < places.length; i++) {		
			answer[i] = AddPlce(places[i]);
		}

		return answer;
    }

	private int AddPlce(String[] place) {
		int ok =0;
		
		
		String[][] tempPlace = new String[5][5];
		
		for (int i = 0; i < place.length; i++) {
			for (int j = 0; j < place.length; j++) {
				tempPlace[i][j] = Character.toString(place[i].charAt(j));
			} 
		}
		
	
		
		//P의 위치를 저장
		for (int i = 0; i < place.length; i++) {
			for (int j = 0; j < place.length; j++) {
				if(tempPlace[i][j].equals("P")) {
					locationX.add(i);
					locationY.add(j);
				}
			} 
		}
		
		distance(locationX, locationY);
		
		return ok;	
	}


	private void distance(ArrayList<Integer> x, ArrayList<Integer> y) {
		int[] dis = new int[locationX.size()];
	
		
		for (int i = 0; i < x.size(); i++) {
			for (int j = i; j < x.size(); j++) {
				dis[i] = Math.abs(x.get(i)-x.get(j))+Math.abs(y.get(i)-y.get(j));
			}
		}
		
		
	}
	
}

package programmers.level1;

import java.util.ArrayList;

public class lessons12906 {

	public static void main(String[] args) {
		
		int[] arr = {1,1,3,3,0,1,1};
		
		ArrayList<Integer> res = solution(arr);

		for (int i = 0; i < res.size(); i++) {
			System.out.print(res.get(i));
		}
		

	}

	private static ArrayList<Integer> solution(int[] arr) {
		int temp = arr[0];
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        list.add(temp);
                 
        for(int i=1; i<arr.length; i++){
            if(temp != arr[i]){
                list.add(arr[i]);
                temp = arr[i];
            }
   
        }
        
        return list;
	}

}

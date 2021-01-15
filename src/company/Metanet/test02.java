package company.Metanet;


public class test02 {
	public boolean solution(int[] arr) {
        boolean answer = true;
        
        for (int i = 1; i < arr.length; i++) { //앞뒤 차이가 2이상일때만 고려
			if(arr[i-1] > arr[i]) {
				if(arr[i-1]-arr[i] >=2) {
					answer = false;
					return answer;
				}
			}
		}
        
        return answer;
    }
	
}

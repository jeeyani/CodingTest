package programmers.level1;

import java.util.HashSet;

public class lessons1845 {

	public static void main(String[] args) {
		
		int[] nums1 = {3,1,2,3};
		int[] nums2 = {3,3,3,2,2,4};
		int[] nums3 = {3,3,3,2,2,2};
		
		int res = solution(nums3);
		
		System.out.print(res);

	}

	private static int solution(int[] nums) {
		int answer = 0;
		
		int max = nums.length/2;
		HashSet<Integer> set = new HashSet<>();
		
		for(int n : nums) {
			set.add(n);
		}
		
		if(set.size() > max) {
			
			answer = max;
			
		}else if(set.size() <= max) {
			answer = set.size();
		}
		
		
        return answer;
	}

}

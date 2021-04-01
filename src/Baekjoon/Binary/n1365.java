package Baekjoon.Binary;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class n1365 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws Exception{
		int test = Integer.parseInt(br.readLine());
		
		List<Integer> list = new ArrayList<Integer>();
		String[] temp = br.readLine().split(" ");
		for (int i = 0; i < test; i++) {
			list.add(Integer.parseInt(temp[i]));
		}
		
		System.out.println(solve(list));
	}

	private static int solve(List<Integer> list) {
		
		int count =0;
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i-1) > list.get(i)) {
				count++;
			}
		}
		return count;
	}

}

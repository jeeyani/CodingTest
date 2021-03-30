package Baekjoon.Greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class n13305 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws Exception {
		int test = Integer.parseInt(br.readLine());
		List<Oils> list = inputValue(test);
		System.out.println(solve(list));
	}
	
	public static class Oils{
		int km;
		int price;
		
		public Oils(int km, int price) {
			this.km = km;
			this.price = price;
		}
		
	}
	
	private static List<Oils> inputValue(int test) throws Exception {
		List<Oils> list = new ArrayList<>();
		String[] kmAdd=br.readLine().split(" ");
		String[] priceAdd=br.readLine().split(" ");
		
		for (int i = 0; i < test-1; i++) {
			list.add(new Oils(Integer.parseInt(kmAdd[i]), Integer.parseInt(priceAdd[i])));
		}
		return list;
	}
	
	private static int solve(List<Oils> list) {
		
		int sum =list.get(0).price*list.get(0).km;
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i-1).price < list.get(i).price) {
				sum+=list.get(i-1).price * list.get(i).km;
			}else {
				sum+=list.get(i).price * list.get(i).km;
			}
		}
		return sum;
	}

}

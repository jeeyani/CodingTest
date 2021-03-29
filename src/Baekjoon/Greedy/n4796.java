package Baekjoon.Greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class n4796 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws Exception {
		List<Vacation> list;
		int i=0;
		while (true) {
			i++;
			list = inputVac();
			if(list.get(0).L==0 &&list.get(0).P==0&&list.get(0).V==0) break;
			
			System.out.println("Case "+i+": "+solve(list));
			
		}
	}
	
	static class Vacation{
	
		int L;
		int P;
		int V;
		
		public Vacation(int l, int p, int v) {
			L = l;
			P = p;
			V = v;
		}
	}
	
	private static List<Vacation> inputVac() throws Exception {
		List<Vacation> list = new ArrayList<>();
		
		String[] times = br.readLine().split(" ");
		list.add(new Vacation(Integer.parseInt(times[0]), Integer.parseInt(times[1]), Integer.parseInt(times[2])));
		return list;
	}
	
	private static int solve(List<Vacation> list) {
		int days =0;
		
		for(Vacation vac : list) {
			days = (vac.V/vac.P)*vac.L + (vac.V%vac.P);
			return days;
		}
		return days;
	}

}

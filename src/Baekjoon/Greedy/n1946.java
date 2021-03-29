package Baekjoon.Greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class n1946 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws Exception {
		int test = Integer.parseInt(br.readLine());
		for (int i = 0; i < test; i++) {
			List<Employee> empList = inputSortEmployees();
			System.out.println(solve(empList));
		}
	}
	
	private static int solve(List<Employee> employeeList) {
		int cnt = 0;
		int miniRank =Integer.MAX_VALUE;
		
		for(Employee emp:employeeList) {
			if(emp.iRank < miniRank) {
				cnt++;
				miniRank = emp.iRank;
			}
		}
		
		return cnt;
	}
	
	private static List<Employee> inputSortEmployees() throws Exception {
		int num = Integer.parseInt(br.readLine());
		List<Employee> empList = new ArrayList<>();
		
		for (int i = 0; i < num; i++) {
			String[] rankInput = br.readLine().split(" ");
			empList.add(new Employee(Integer.parseInt(rankInput[0]), Integer.parseInt(rankInput[1])));
		}
		Collections.sort(empList);
		return empList;
	}
	
	static class Employee implements Comparable<Employee>{
		int dRank;
		int iRank;
		
		public Employee(int dRank, int iRank) {
			this.dRank = dRank;
			this.iRank = iRank;
		}
		
		@Override
		public int compareTo(Employee employee) {
			return this.dRank-employee.dRank;
		}
	}
	

}

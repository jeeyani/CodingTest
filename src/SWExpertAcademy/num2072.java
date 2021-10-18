package SWExpertAcademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class num2072 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T;
		T=sc.nextInt();
		/*
		   여러 개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
		*/

        int[] result = new int[T];
		
		for(int test_case = 1; test_case <= T; test_case++)
		{   
            
			int[] arr = new int[10]; 
			for(int i=0; i<10; i++){
				arr[i] = sc.nextInt();
			}
			
            int sum = 0;
            
            for(int i=0; i<10; i++){
            	if(arr[i]%2 !=0){
                	sum +=arr[i];
                }
            }
            
            result[test_case] = sum;

		}
		
		for (int i = 0; i < result.length; i++) {
			System.out.println("#"+(i+1)+" "+result[i]);
		}
	
	}

}

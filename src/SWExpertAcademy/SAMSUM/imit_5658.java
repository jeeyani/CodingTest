package SWExpertAcademy.SAMSUM;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class imit_5658 {
	
	static Set<Long> set;
	static String num;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
        
		for(int test_case = 1; test_case <= T; test_case++)
		{
            
            //1.입력받기
            int n = sc.nextInt();
			int k = sc.nextInt();
            num = sc.next();
            
            //2. 16진수를 계산한 값을 넣은 set(중복제거를 위해/Long)
            //TreeSet의 경우 기본적으로 오름차순으로 정렬되어 있음
            set = new TreeSet<Long>();
     
            //3. 가능한 회전수 만큼 돌리기
            for (int i = 0; i <= n/4; i++) {
            	
				int rotCnt=n/4;
				
				for(int j=0;j<4;j++) { //1회전마다 4개씩 생성됨
					String s1=num.substring(j*rotCnt,(j+1)*rotCnt);
					long dec = Long.parseLong(s1,16); //16진수를 10진수 변환
					set.add(dec);
				}
				rot(); //회전하기
			}
			
            Iterator<Long> itr = set.iterator();
            long lo1=0;
            long ans = 0;
            int cnt = 0;
            
            // TreeSet는 오름차순으로 정렬되어 있음으로 k번째 큰 수를 구하기 위해서는 Set.size()-k 위치에 있는 원소를 출력
            while(itr.hasNext()){
            	lo1 = itr.next();
                if(cnt == set.size()-k){
                	ans = lo1;
                    break;
                }
                cnt++;
            }        
            System.out.println("#"+test_case+" "+ans);
		}
	}
    
	/*회전시키기*/
    static void rot(){
    	char c = num.charAt(num.length()-1); //맨 끝 단어
        String sub = num.substring(0,num.length()-1); //(시작위치,끝위치) >> 첫번째숫자부터 맨끝에서 두번째자리까지만 자르기
        num =c+sub;
    }
}

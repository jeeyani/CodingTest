package programmers.level2;

public class lessons12911 {

	public static void main(String[] args) {
		int n = 78;
		
		int res = solution(n);
		res = solution2(n);
		System.out.println(res);
	}

	/*다른 사람 풀이*/
	//비트연사자를 활용한 풀이
	
	private static int solution2(int n) {
		int postPattern = n & -n, smallPattern = ((n ^ (n + postPattern)) / postPattern) >> 2;
        return n + postPattern | smallPattern;
	}

	private static int solution(int n) {
		int answer = 0;
        
        String nBinary ="";
        nBinary = Integer.toBinaryString(n); //toBinaryString 이진수 변환
    
        int nOneCount = oneCOunt(nBinary);
        
        int nextNcount =0;
        int nNext = n+1;
        
        while(true){
            
            nBinary =  Integer.toBinaryString(nNext);
            nextNcount = oneCOunt(nBinary);
            
            if(nextNcount == nOneCount){
                answer = nNext;
                break;
            }
            nNext ++;
            
        }
        
        
        return answer;
	}

	private static int oneCOunt(String nBinary) {
		int res =0;
        
        for(int i = 0; i<nBinary.length(); i++){
            if(nBinary.charAt(i)=='1'){
                res ++;
            }
        }
        
        return res;
	}

}

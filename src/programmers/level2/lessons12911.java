package programmers.level2;

public class lessons12911 {

	public static void main(String[] args) {
		int n = 78;
		
		int res = solution(n);
 
	}

	private static int solution(int n) {
int answer = 0;
        
        String nBinary ="";
        nBinary = Integer.toBinaryString(n);
    
        int nOneCount = oneCOunt(nBinary);
        
        int nextNcount =0;
        int nNext = n+1;
        
        while(nextNcount != nOneCount){
            
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

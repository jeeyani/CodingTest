package Baekjoon.Realization;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n1212 {

	static char[] twoCharArr;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String eight = br.readLine();
		
		char[] eightCharArr = eight.toCharArray();
		
		int twoLen = getPossibleDigitNumber(eightCharArr);
		twoCharArr = new char[twoLen];
		
		int index = twoLen - 1;
		//맨 뒤의 수부터 탐색
		for (int i = eight.length()-1; i>=0; i--) {
			char num = eightCharArr[i];
			index = getTwoDigitNumber(num, index);
		}
		System.out.print(new String(twoCharArr));
	}
	/**
	 * 8잔수 숫자 1개 -> 2진수 숫자 3개 변환
	 * 2진수 현재 index리턴
	 */
	private static int getTwoDigitNumber(char ch, int nowindex) {
		
		int num = ch -'0';
		
		for (int i = 0; i < 3; i++) {
			twoCharArr[nowindex--] =(char)((num%2)+'0'); //2진수 변환
			num /=2;
			
			 // 이미 전체 2진수개수를 알고 있으므로 index로 길이 판단.
			if(nowindex < 0) {
				break;
			}
		}
		
		return nowindex;
	}

	//8진수를 2진수로 변환했을 때 2진수의 길이 리턴
	private static int getPossibleDigitNumber(char[] charArr) {
		
		int len = charArr.length * 3;
		if(len == 0) return 0;
		
		int firstNum = charArr[0] -'0';
		
		if(firstNum /4 > 0) { //첫 번째 숫자가 3자리 수 **3이상일 시 앞에 0이 필요없음
			return len;
		}
		
		if(firstNum /2 > 0) { // 첫 번째 숫자가 2자리 수 가능 *앞에 0이 생김으로 길이 축소
			return len -1;
		}
		
		return len -2;
		
	}

}

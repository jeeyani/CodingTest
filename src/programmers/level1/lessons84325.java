package programmers.level1;

public class lessons84325 {

	public static void main(String[] args) {
		String[] table = { "SI JAVA JAVASCRIPT SQL PYTHON C#", "CONTENTS JAVASCRIPT JAVA PYTHON SQL C++",
				"HARDWARE C C++ PYTHON JAVA JAVASCRIPT", "PORTAL JAVA JAVASCRIPT PYTHON KOTLIN PHP",
				"GAME C++ C# JAVASCRIPT C JAVA" };
		String[] languages = { "PYTHON", "C++", "SQL" };
		int[] preference = { 7, 5, 5 };

		String result;

		result = solution(table, languages, preference);
		result = solutionOther(table, languages, preference);
		System.out.println(result);

	}


	private static String solutionOther(String[] table, String[] languages, int[] preference) {
		String rstStr[] = new String[table.length]; 
		int[] sum = new int[table.length]; //선호도 합산
		
		for (int i = 0; i < table.length; i++) {
			
			String[] temp = table[i].split(" ");
			rstStr[i] = table[i].split(" ")[0];
			
			for (int j = 1; j < temp.length; j++) {
				for (int k = 0; k < languages.length; k++) {
					if(temp[j].equals(languages[k])) {
						sum[i] +=(temp.length-j) * preference[k];
					}
				}
			}
			
		}
		
		//최댓값 탐색하기
		int temp = sum[0]; 
		String answer = rstStr[0];
		for (int i = 0; i < sum.length; i++) {
			if(temp <=sum[i]) {
				if (temp == sum[i] && answer.compareTo(rstStr[i]) > 0) { /*compareTo*/
					answer = rstStr[i];
				}else if(temp < sum[i]) {
					temp = sum[i];
					answer = rstStr[i];
				}
			}
		}
	
		return answer;

		
	}


	private static String solution(String[] table, String[] languages, int[] preference) {
		String answer = "";

		int[] sum = new int[5];

		//1. table과 languages와 비교
		for (int i = 0; i < languages.length; i++) {

			for (int j = 0; j < 5; j++) {
				int index = 0;
				String[] tempSplit = table[j].split(" ");

				for (String str : tempSplit) {
					index++;

					if (languages[i].equals(str)) {
						sum[j] += cal(index) * preference[i];
					}

				}
			}
		}
		int max =0;
		int index = 0;
		for (int i = 0; i < sum.length; i++) {
			if(max < sum[i]) {
				max = sum[i];
				index = i;
			}

		}
		String[] chk = table[index].split(" ");
		answer = chk[0];
		
		return answer;
	}

	private static int cal(int index) {
		switch (index) {
		case 2:
			return 5;
		case 3:
			return 4;
		case 4:
			return 3;
		case 5:
			return 2;
		case 6:
			return 1;
		default:
			return 0;
		}
	}

}

package programmers.level1;

public class lessons12918 {

	public static void main(String[] args) {

		String s1 = "12321564";
		String s2 = "a123dsad";

		boolean res = solution(s1);
		res = solutionOther(s1);
		System.out.println(res);

	}

	//다른사람풀이
	private static boolean solutionOther(String s) {
		if(s.length() == 4 || s.length() == 6){
	          try{
	              int x = Integer.parseInt(s);
	              return true;
	              
	          } catch(NumberFormatException e){ //**예외처리를 이용한 방법
	              return false;
	          }
	      }
	      else return false;
	}

	private static boolean solution(String s) {
		if (s.length() == 4 || s.length() == 6) {

			for (int i = 0; i < s.length(); i++) {

				if (s.charAt(i) < '0' || s.charAt(i) > '9')
					return false;

			}

		} else {
			return false;
		}

		return true;
	}

}

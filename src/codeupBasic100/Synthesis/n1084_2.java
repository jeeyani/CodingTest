package codeupBasic100.Synthesis;

import java.io.*;

public class n1084_2 {
	
	
	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //시간초과 문제 해결
		
		
		try {
			String color = br.readLine();
			String rgb[] = color.split(" ");
			
			int count =0;
			
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
			for (int i = 0; i < Integer.parseInt(rgb[0]); i++) {
				for (int j = 0; j < Integer.parseInt(rgb[1]); j++) {
					for (int j2 = 0; j2 < Integer.parseInt(rgb[2]); j2++) {
						bw.write(i+" "+j+" "+j2+"\n");
						count++;
					}
				}
			}
			bw.write(String.valueOf(count));
			bw.flush();
			bw.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}
	
	
}
	
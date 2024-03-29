package Baekjoon.Greedy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class n11694 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		int N = Integer.parseInt(br.readLine());
		int input[] = new int[N];

		boolean flag = false; // 돌이 1개인 더미만 존재하는가?
		int num = 0; // 돌이 1개인 더미의 개수

		st = new StringTokenizer(br.readLine());

		for (int i = 0; i < N; i++) {//더미 만큼 반복
			input[i] = Integer.parseInt(st.nextToken());

			if (input[i] != 1) {//더미안에 돌 갯수가 1개가 아니면
				flag = true;
				
			} else { //돌이 1개인 더미갯수
				num++; 
			}
		}

		// 돌이 1개인 더미만 존재하는 경우(무조건 한개씩만 있는경우)
		// 돌 더미가 짝수면 선공이 승리하고, 홀수면 후공이 승리한다.
		if (!flag) {
			bw.write((num % 2 == 1) ? "cubelover" : "koosaga");
			bw.flush();
			bw.close();
			br.close();
			return;
		}

		
		long result = 0; // 님 합
		for (int i = 0; i < N; i++) {
			result ^= input[i];
		}

		if (num != 0) { // 돌이 1개인 더미가 존재하는 경우
			
			//돌 1개 더미가 홀수일때 님합이 0이 아니면 선 승
			if (num % 2 == 1 && result != 0) {
				bw.write("koosaga");
				
			//돌 1개 더미가 홀수일때 님합이 0이면 후 승
			} else if (num % 2 == 1 && result == 0) {
				bw.write("cubelover");
				
			} else if (num % 2 == 0) {
				// 돌이 1개인 더미가 짝수인 경우
				// 돌이 1개가 아닌 임의의 더미를 돌이 1개인 더미로
				// 만들어주어야 한다.

				for (int i = 0; i < N; i++) {
					if (input[i] != 1) {
						input[i] = 1;
						break;
					}
				}

				result = 0; // 님 합
				for (int i = 0; i < N; i++) {
					result ^= input[i];
				}

				if (result != 0) { //0이 아니면 선승
					bw.write("koosaga");
				} else { //0이면 후 승
					bw.write("cubelover");
				}
			}
			
		} else { // 돌이 1개인 더미가 없는 경우 님합이 0이 아니면 선 승, 0 이면 후 승
			bw.write((result != 0) ? "koosaga" : "cubelover");
		}

		bw.flush();
		bw.close();
		br.close();
	}

}

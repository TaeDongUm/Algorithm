package backjoon;
import java.util.Scanner;
// 다른 사람 풀이 공부
// 참고사이트 https://st-lab.tistory.com/74
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class backjoon_1193 {
 
	public static void main(String[] args) throws Exception{
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
 
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
 
		int cross_count = 1, prev_count_sum = 0;
 
		while (true) {
        
			// 직전 대각선 누적합 + 해당 대각선 개수 이용한 범위 판별
			if (X <= prev_count_sum + cross_count) {	
				
				if (cross_count % 2 == 1) {	// 대각선의 개수가 홀수라면 
					// 분자가 큰 수부터 시작
					// 분자는 대각선상 내의 블럭 개수 - (X 번째 - 직전 대각선까지의 블럭 개수 - 1) 
					// 분모는 X 번째 - 직전 대각선까지의 블럭 개수
					System.out.print((cross_count - (X - prev_count_sum - 1)) + "/" + (X - prev_count_sum));
					break;
				} 
				
				else {	// 대각선상의 블럭의 개수가 짝수라면 
					// 홀수일 때의 출력을 반대로 
					System.out.print((X - prev_count_sum) + "/" + (cross_count - (X - prev_count_sum - 1)));
					break;
				}
 
			} else {
				prev_count_sum += cross_count;
				cross_count++;
			}
		}
	}
}


package backjoon;
import java.util.Scanner;
public class backjoon_2869 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int A = sc.nextInt();
			int B = sc.nextInt();
			int V = sc.nextInt();
			int cnt =0;
	        cnt = (V-B)/(A-B);
	        if(((V-B)%(A-B)) !=0)
	            cnt++;
	      	System.out.println(cnt);
		}

	}

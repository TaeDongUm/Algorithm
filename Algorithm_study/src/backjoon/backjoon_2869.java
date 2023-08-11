package backjoon;
import java.util.Scanner;
public class backjoon_2869 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int V = sc.nextInt();
		int cnt =0;
		cnt = V/(A-B)-((A/(A-B))-1);
		
//		if(((V/A)*B+ V%A)%A !=0) {
//			cnt +=((V/A)*B+ V%A)/A +1;
//		}else {
//			cnt +=((V/A)*B+ V%A)/A;
//		}
		System.out.println(cnt);
	}

}

import java.util.Scanner;
public class study_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		 System.out.println("1부터 n까지의 합을 구합니다.");
		 System.out.print("n값: ");
		 int n = stdIn.nextInt();
		 
		 int sum =0;
		 int i = 1;
		 
		 while (i<=n) {
			 sum += i;
			 i++;
		 }
		 // for문으로 작성한다면
//		 int sum_=0;
//		 for(int k=1;k<=n;k++) {
//			 sum_ +=k;
//		 }
//		 System.out.println("1부터 " + n + "까지의 합은 " + sum_ + "입니다." );
		 
		 
		 System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
	}

}

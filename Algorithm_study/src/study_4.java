import java.util.Scanner;
public class study_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		int num = stdIn.nextInt();
		triangleLB(num);
		for (int i =1; i<=num;i++) {
			for (int j=1; j<=num-i;j++) {
				System.out.print(" "); 
			}
			for (int j =1; j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("");
		for(int i =1; i<=num;i++) {
			for (int j = 1;j<=num-(i-1);j++ ) {
				System.out.print("*");
			}
			for (int j=1;j<=(i-1)*2;j++) {
				System.out.print(" ");
			}
			for (int j =1;j<=num-(i-1);j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		for (int i=1; i<=num-1;i++) {
			for (int j = 1;j<=i+1;j++ ) {
				System.out.print("*");
			}
			for (int j=1;j<=(num-1-i)*2;j++) {
				System.out.print(" ");
			}
			for (int j =1;j<=i+1 ;j++) {
				System.out.print("*");
			}
			System.out.println("");
	}

	}
	// 직각이등변삼각형 메서드를 만든 뒤 사용함
	static void triangleLB(int num) {
		for(int i =1; i<=num;i++) {
			for(int j = 1; j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
//**********
//****  ****
//***    ***
//**      **
//*        *
//**      **
//***    ***
//****  ****
//**********

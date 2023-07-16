import java.util.Scanner;

public class backjoon_2444 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for(int i=0;i<N;i++) {
			for(int j=0;j<N-i-1;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<2*i+1;k++) {
				System.out.print("*");
			}
			for(int l =0;l<N-i-1;l++) {
				System.out.print(" ");
			}
			System.out.println();	
		}
		for(int i=0;i<N-1;i++) {
			for(int j=0;j<i+1;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<2*N-1-(2*(i+1));k++){
				System.out.print("*");
			}
			for(int l=0;l<i+1;l++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}

}

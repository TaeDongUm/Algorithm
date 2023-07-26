import java.util.Scanner;
public class backjoon_2720 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for(int i =0;i<N;i++) {
			int Money = sc.nextInt();
			int[] arr = new int[4];
			int m1=25;
			int m2=10;
			int m3=5;
			int m4=1;
			int count =0;
			if(Money >=m1) {
				int n = Money/m1;
				arr[0]=n;
				Money = Money%m1;
			}
			if(Money >=m2) {
				int n = Money/m2;
				arr[1] +=n;
				Money = Money%m2;
			}
			if(Money >=m3) {
				int n = Money/m3;
				arr[2] +=n;
				Money = Money%m3;
			}
			if(Money >=m4) {
				int n = Money/m4;
				arr[3] +=n;
				Money = Money%m4;
			}
			for(int j=0;j<arr.length;j++) {
				System.out.print(arr[j]+" ");
			}
			
		}
	}

}

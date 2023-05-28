import java.util.Scanner;
//public class test {
//
//	public static void main(String[] args) {
//		for (int i =0; i<2;i++) {
//			System.out.print("abcs");
//			System.out.println();
//		}
//	}
//}

class test{
	static int maxOf(int[] a) {
		int max= a[0];
		for (int i=1; i <a.length; i++) 
			if (a[i] > max) 
				max = a[i];
		return max;
		
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("asbsd");
		System.out.println();
		
		int num = stdIn.nextInt();
		
		int[] height = new int[num];
		
		for (int i =0;i< num; i++) {
			System.out.print("height[" + i + "]");
			height[i] = stdIn.nextInt();
		}
		System.out.println("최댓값은" + maxOf(height) + "입니다.");
	}
}
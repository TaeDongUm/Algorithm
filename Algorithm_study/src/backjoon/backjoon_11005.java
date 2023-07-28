package backjoon;
import java.util.Scanner;

public class backjoon_11005 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = Integer.parseInt(sc.next());
		int num2 = Integer.parseInt(sc.next());
		String value = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String result ="";
		while(true) {
			if(num1 ==0) {
				break;
			}
			int share = num1%num2;
			result += Character.toString(value.charAt(share));
			num1 = num1/num2;
		}
		StringBuffer sb = new StringBuffer(result);
		String reverse = sb.reverse().toString();
		System.out.println(reverse);
		
	}

}

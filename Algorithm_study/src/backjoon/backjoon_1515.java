package backjoon;
import java.util.Scanner;
public class backjoon_1515 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String N = sc.nextLine();
		int checking=0;
		for(int i =0;i<N.length();i++) {
			boolean ok = true;
			while(ok) {
				checking++;
				String check = String.valueOf(checking);
				for(int j =0;j<check.length();j++) {
					if(N.charAt(i) == check.charAt(j)) {
						i++;
						if(i>=N.length())
							break;
					}
				}
				if(i>=N.length())
					break;
			}
		}
		System.out.println(checking);
	}

}
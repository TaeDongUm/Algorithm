import java.lang.Math;
import java.util.Scanner;
public class study_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        char c = s.charAt(0);
        a = (Math.round(a*100)/100.0);
        b = (Math.round(b*100)/100.0);
        System.out.println(c);
        System.out.println(a+"\n"+b);
	}

}

import java.util.Scanner;
public class study_15{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        a +=b;
        b +=a;
        System.out.println(a+" "+b);

}
}
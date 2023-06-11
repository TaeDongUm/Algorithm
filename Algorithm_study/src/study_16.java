import java.util.Scanner;
public class study_16{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c;
        c= (a+b)/(a-b);
        System.out.println(String.format("%.2f",c));
        // Math.round를 써서 하니까 5000 처럼 소수점이 0인 경우 절삭해서 제출이 틀렸다고 나옴.
}
}
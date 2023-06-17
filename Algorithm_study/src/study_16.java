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

class SumAverage {
	void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println((a+b) +" "+(double)(a+b)/2);
	}
}

class Minus {
	void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println(a);
		if(a<0) {
			System.out.println("minus");
		}
	}
}

class MaxminusMin {
	void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언
        int a, b;
        
        // 입력
        a = sc.nextInt();
        b = sc.nextInt();
        
        // 출력
        if(a < b)
            System.out.println(b - a);
        if(a >= b)
            System.out.println(a - b);
	    }
	}
class IfElseUse{
	void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if(a>=80) {
			System.out.println("pass");
		}
		else {
			System.out.println(80-a + " more score");
		}
	}
}
class Ternary{
	void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int max;
		max = a>b ? a:b;
		System.out.println(max);
	}
}
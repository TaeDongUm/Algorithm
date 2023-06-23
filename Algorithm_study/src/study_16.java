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
class IfElseIf {
	void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if(a<0) {
			System.out.println("ice");
		}
		else if(a>=100) {
			System.out.println("vapor");
		}
		else {
			System.out.println("water");
		}
	}
}
class CallAttendence {
	void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int John = 1;
		int Tom = 2;
		int Paul = 3;
		if(John == a) {
			System.out.println("John");
		}
		else if(Tom == a) {
			System.out.println("Tom");
		}
		else if(Paul == a) {
			System.out.println("Paul");
		}
		else {
			System.out.println("Vacancy");
		}
	}
}
class Score{
	void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a =sc.nextInt();
        if(a>=90){
            System.out.println("A");
        }
        else if(a>=80){
            System.out.println("B");
        }
        else if(a>=70){
            System.out.println("C");
        }
        else if (a>=60){
            System.out.println("D");
        }
        else{
            System.out.println("F");
        }
	}
}
class ThreeValue {
	void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(a<=b && a<=c) {
			System.out.print(1+" ");
		}
		else {
			System.out.print(0+" ");
		}
		if(a==b && a ==c) {
			System.out.print(1+" ");
		}
		else {
			System.out.print(0+" ");
		}
	}
}
class VisionTest {
	void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        if (a>=1.0 && b>=1.0){
            System.out.println("High");
        }
        else if(a>=0.5 && b>=0.5){
            System.out.println("Middle");
        }
        else {
            System.out.println("Low");
        }
	}
}

public class study_2 {
	static int max4(int a, int b, int c, int d) {
		int max = a;
		if (b> max);
		max = b;
		if (c> max);
		max = c;
		if (d > max);
		max = d;
		return max;
		
	}
	//  방법1
	static int max5(int a, int b) {
		int max = a;
		if (b>max);
		max = b;
		return max;
	}
	// The method max5(int, int) is undefined for the type study_2
	// 현재 코드에서 어떤 문제이며 어떻게 해결할 수 있을까
	// static 메서드는 top level에서 만들어야 하거나(여기서는 public class study_2 안에서
	// 또는 클래스를 static으로 선언해준다.
	class Max4method{
		int max5(int a, int b) {
			int max = a;
			return max;
		}
	}
	// 방법 2
//	static int max5(int a, int b) {
//		int max = a;
//		if(b>max)
//			max =b;
//		return max;
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("max(1,2,3,4) = " + max4(1,2,3,4));
		System.out.println(max5(1,2));

	}

}

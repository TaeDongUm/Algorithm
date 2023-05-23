
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
	// The method max5(int, int) is undefined for the type study_2
	// 현재 코드에서 어떤 문제이며 어떻게 해결할 수 있을까
	class Max4method{
		int max5(int a, int b) {
			int max = a;
			return max;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("max(1,2,3,4) = " + max4(1,2,3,4));
		System.out.println(max5(1,2));

	}

}

import java.util.Scanner;
public class study_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        sc.useDelimiter(":");
        int h = sc.nextInt();
        int m = sc.nextInt();
        
        // 출력
        System.out.println((h + 1) + ":" + m);
	}

}
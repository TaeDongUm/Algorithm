import java.util.Scanner;
public class study_11{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\\."); // . 기준으로 잘라서 입력 받겠다는 뜻
        int y = sc.nextInt(); // . 기호가 나오기 전까지 입력 진행
        int m = sc.nextInt(); // . 기호가 나오기 전까지 입력 진행
        int d = sc.nextInt(); // . 기호가 나오기 전 or 입력의 마지막 부분까지 진행

        // 출력
        System.out.println(m + "-" + d + "-" + y);
	}

}

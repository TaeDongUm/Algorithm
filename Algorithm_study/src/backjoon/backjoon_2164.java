package backjoon;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class backjoon_2164 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Queue<Integer> q = new LinkedList<>(); 
		for(int i=0;i<N;i++) {
			q.add(i+1);
		}
		while(q.size()!=1) {
			int num;
			q.remove();
			num = q.poll();
			q.add(num);
		}
		int result = q.poll();
		System.out.println(result);
		
	}

}

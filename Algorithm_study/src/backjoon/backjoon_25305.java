package backjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class backjoon_25305 {
	static List<Integer> list = new ArrayList<>();
	public static void main(String[]  args) {
		Scanner sc= new Scanner(System.in);
		int N = sc.nextInt();
		int k = sc.nextInt();
		for(int i=0;i<N;i++) {
			list.add(sc.nextInt());
		}
		Collections.sort(list);
		System.out.println(list.get(N-k));
	}
}

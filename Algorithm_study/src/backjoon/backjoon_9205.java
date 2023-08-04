package backjoon;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.LinkedList;
import java.lang.Math;

public class backjoon_9205 {
	static int n, sx,sy,px,py;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int t = Integer.parseInt(br.readLine());
		for(int i=0;i<t;i++) {
			List<int[]> list = new ArrayList<>();
			int n = Integer.parseInt(br.readLine());
			for(int j =0;j<n+2;j++) {
				st = new StringTokenizer(br.readLine());
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				if(j==0) {
					// 상근이네 집 좌표
					sx = x;
					sy = y;
				}else if(j==n+1) {
					// 페스티벌 좌표
					px = x;
					py = y;
				}else {
					// 편의점 좌표
					list.add(new int[]{x,y});
				}
				
			}
//			if(bfs(list)) {
//				System.out.println("happy");
//			}else {
//				System.out.println("sad");
//			}
		}
	}
	// 임시 commit
//	static boolean bfs(List<int[]> list) {
//		Queue<int[]> q = new LinkedList<>();
//		boolean[] visited = new boolean[n];
//		q.add(new int[]{sx,sy});
//		if(!q.isEmpty()) {
//			int[] position = q.poll();
//			int a = position[0], b = position[1];
//			if(Math.abs(a-px)+Math.abs(b-py)<=1000) {
//				return true;
//			}
//			
//		}
//	}
//
}

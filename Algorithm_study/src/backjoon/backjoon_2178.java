package backjoon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
public class backjoon_2178 {
	static Queue<int[]> q = new LinkedList<>();
	static int[][] map;
	static int[][] visited;
	static int N,M, count=0;
//	static int[] dx = {0,1,0,-1};
//	static int[] dy = {1,0,-1,0};
	// 어떤 순서로 먼저 방문하는지에 따라 깊이가 달라짐. 왜? 값이 다르게 나옴
//	static int[] dx = {1,0,-1,0};
//	static int[] dy = {0,1,0,-1};
	static int[] dx = { -1, 1, 0, 0 }; //x방향배열-상하
	static int[] dy = { 0, 0, -1, 1 }; //y방향배열-좌우
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		map = new int[N][M];
		visited = new int[N][M];
		for(int i =0;i<N;i++) {
			String line = br.readLine();
			for(int j=0;j<M;j++) {
				map[i][j] = Integer.parseInt(line.charAt(j)+"");
				visited[i][j] = map[i][j];
			}
		}
		path(0,0);
		System.out.println(count);
		
	}
	private static void path( int x, int y) {
		q.add(new int[] {x,y});
		visited[x][y] = 2;
		while(!q.isEmpty()) {
			int size = q.size();
			count++;  // q.size()가 1일때는 문제없지만 2이상일 때는 for문을 벗어나지 못하고 마지막 끝점에서 return하는 경우가 발생
			// 그래서 size가 변하지 않게 변수에 넣었음
			for(int i=0;i<size;i++) {
				int[] current = q.poll();
				if(current[0]==N-1 && current[1]==M-1) return;
				int nx, ny;
				for(int j =0;j<4;j++) {
					nx = current[0] + dx[j];
					ny = current[1] + dy[j];
					if((nx>=0 && nx<N) && (ny>=0 && ny<M)) {
						if(map[nx][ny]==1 && visited[nx][ny]==1) {
							q.add(new int[] {nx,ny});
							visited[nx][ny] = 2;
						}
					}
				}
			}
			
		}
		
	}

}

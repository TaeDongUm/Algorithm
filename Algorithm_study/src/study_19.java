import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;

public class study_19{
	
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		int TC = sc.nextInt();
		for (int i =0; i<TC;i++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			int[][] arr = new int[N][N];
			for(int r=0;r<N;r++) {
				for(int c =0;c<N;c++) {
					arr[r][c] = sc.nextInt();
				}
			}
			// dx, dy + shape
			int[] dx = {0,-1,0,1};
			int[] dy = {-1,0,1,0};
			
			// dx,dy x shape
			int[] xdx = {-1,1,-1,1};
			int[] xdy = {-1,-1,1,1};
			int[][] result = new int[N][N];
			for(int r =0;r<N;r++) {
				for(int c =0;c<N;c++) {
					int sum =0;
					for(int k =0;k<4;k++) {
						for(int m =0;m<=M-1;m++) {
							if(((r+dx[k]*m>=0) && (r+dx[k]*m<N)) &&((c+dy[k]*m>=0) && (c+dy[k]*m<N))) {
								sum += arr[r+dx[k]*m][c+dy[k]*m];
							}
						}
					}
					result[r][c] = sum;
				}
			}
			for(int r =0; r<N;r++) {
				for(int c =0; c<N;c++) {
					int sum =0;
					for(int k =0;k<4;k++) {
						for(int m = 0;m<=M-1;m++) {
							if(((r+xdx[k]*m>=0) && (r+xdx[k]*m<N)) &&((c+xdy[k]*m>=0) && (c+xdy[k]*m<N))) {
								sum += arr[r+xdx[k]*m][c+xdy[k]*m];
							}
						}
					}
					if(sum>result[r][c]) {
						result[r][c] = sum;
					}
				}
			}
			int max =0;
			for(int r =0; r<N;r++) {
				for(int c =0;c<N;c++) {
					if(max<result[r][c]) {
						max = result[r][c];
					}
				}
			}
			System.out.println("#"+(i+1)+" "+max);
			
		}
	
	}
}


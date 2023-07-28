package backjoon;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class backjoon_2566 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[][] Matrix = new int[9][9];
		for(int i =0;i<9;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0;j<9;j++) {
				Matrix[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		int max=0;
		int indexR=0;
		int indexC=0;
		for(int i=0;i<9;i++) {
			for(int j=0;j<9;j++) {
				if(max <=Matrix[i][j]) {
					max = Matrix[i][j];
					indexR = i+1;
					indexC = j+1;
				}
			}
		}
		System.out.println(max);
		System.out.println(indexR + " "+ indexC);
		
	}

}

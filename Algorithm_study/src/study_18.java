import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.text.MessageFormat;
import java.util.Scanner;
import java.lang.StringBuffer;

public class study_18{
	
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		int TC = sc.nextInt();
		for (int i =0;i<TC;i++) {
			int answer =1;
			int[][] Sudoku = new int[9][9];
			for(int j =0;j<9;j++) {
				for(int k=0;k<9;k++) {
					Sudoku[j][k]= sc.nextInt();
				}
			}
			boolean rowcheck[];
			boolean colcheck[];
			boolean cubecheck[];
			
			// row, column check
			for(int j =0;j<9;j++) {
				rowcheck = new boolean[10];
				colcheck = new boolean[10];
				for(int k = 0;k<9;k++) {
					int RowValue = Sudoku[j][k];
					int ColValue = Sudoku[k][j];
					rowcheck[RowValue] = true;
					colcheck[ColValue] = true;
				}
				for (int k =1; k<10;k++) {
					if(!rowcheck[k]) {
						answer = 0;
						break;
					}
					if(!colcheck[k]) {
						answer = 0;
						break;
					}
				}
			}
			// cube check
			int[] xcheck = {0,3,6};
			int[] ycheck = {0,3,6};
			for(int j =0;j<3;j++) {
				for(int k =0;k<3;k++) {
					for(int m =0; m<9;m++) {
						cubecheck = new boolean[10];
						for(int r =0;r<3;r++) {
							for(int c =0;c<3;c++) {
								int CubeValue = Sudoku[r+xcheck[j]][c+ycheck[k]];
								cubecheck[CubeValue] = true;
							}
						}
						for(int r = 1; r<10;r++) {
							if(!cubecheck[r]) {
								answer =0;
								break;
							}
						}
					}

				}
			}
			System.out.println("#"+(i+1)+" "+answer);
		}
    }
	
	
}

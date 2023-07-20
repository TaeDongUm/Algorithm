
import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.io.InputStreamReader;

class backjoon_2738{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] arrA = new int[N][M];
        int[][] arrB = new int[N][M];
        for(int j =0;j<N;j++){
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            for(int k =0;k<M;k++){
                arrA[j][k] =Integer.parseInt(st1.nextToken());
            }
        }
        for(int j =0;j<N;j++){
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            for(int k =0;k<M;k++){
                arrB[j][k] =Integer.parseInt(st2.nextToken());
            }
        }
        for(int j =0;j<N;j++){
            for(int k =0;k<M;k++){
                System.out.print(arrA[j][k]+arrB[j][k]+" ");
            }
            System.out.println();
        }
    }
}
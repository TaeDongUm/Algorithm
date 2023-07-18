import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

class BackJoon_3003{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = {1,1,2,2,2,8};
        for(int i =0;i<6;i++){
            int answer=0;
            int N = Integer.parseInt(st.nextToken());
            answer = arr[i] -N;
            System.out.print(answer+" ");
        }
    }
}
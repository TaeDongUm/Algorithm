package backjoon;
import java.io.BufferedReader;
import java.util.StringTokenizer;
import java.io.InputStreamReader;
import java.lang.StringBuffer;

public class BackJoon_10811{
    public static void main(String[] args) throws Exception{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        String boxnum ="";
        for(int i=0;i<N;i++){
            boxnum +=Integer.toString(i+1);
        }
        for(int i=0;i<M;i++){
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st1.nextToken());
            int b = Integer.parseInt(st1.nextToken());
            String cut = boxnum.substring(a-1,b);
            StringBuffer sb = new StringBuffer(cut);
            String reverse = sb.reverse().toString();
            boxnum = boxnum.replace(cut, reverse);
        }
        for(int i =0;i<boxnum.length();i++){
            System.out.print(boxnum.charAt(i)+" ");
        }
    }
}
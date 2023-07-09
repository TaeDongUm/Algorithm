import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.StringTokenizer;

public class study_21{
	
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        char b = st.nextToken().charAt(0);
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int c = Integer.parseInt(st1.nextToken());
        char d = st1.nextToken().charAt(0);
        
        if((a>=19 && b =='M') || (c>=19 && d=='M')){
            bw.write("1");
        }
        else {
            bw.write("0");
        }
        bw.flush();
        bw.close();
	}
	
}



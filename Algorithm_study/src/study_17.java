import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;

public class study_17{

	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = "";
        while ((s=br.readLine()) !=null)
        {
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str);
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        bw.write(a+b+"\n");
        bw.flush();
        bw.close();
        }
	}
	
}

class AndOr {
	void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String s = br.readLine();
		int n = Integer.parseInt(s);
		if((n%2==1 && n%3==0) || (n%2==0 && n%5==0)){
			bw.write("true");
		}
		else {
			bw.write("false");
		}
		bw.flush();
		bw.close();
	}
}
class Seasons1 {
	void main(String[] args) throws Exception {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int m = Integer.parseInt(br.readLine());
    if(m>=3 && m<=5){
        bw.write("Spring");
    }
    else if(m>=6 && m<=8) {
        bw.write("Summer");
    }
    else if(m>=9 && m<=11){
        bw.write("Fall");
    }
    else {
        bw.write("Winter");
    }
    bw.flush();
    bw.close();
	}
}
class Scholarship{

    void main(String[] args) throws Exception {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        if(a>=90){
            if(b>=95){
                bw.write("100000");
            }
            else if(b>=90){
                bw.write("50000");
            }
            else{
                bw.write("0");
            }
        }
        else {
            bw.write("0");
        }
        bw.flush();
        bw.close();

	    }
	
}
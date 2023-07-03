import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.text.MessageFormat;
import java.util.Scanner;

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
class CompareScore{
	void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st1.nextToken());
		int d = Integer.parseInt(st1.nextToken());
		if(a>c) {
			bw.write("A");
		}
		else if(a<c) {
			bw.write("B");
		}
		else if(a==c) {
			if(b>d) {
				bw.write("A");
			}
			else if(b<d) {}
		}
		bw.flush();
		bw.close();
	}
}
// SWEA 사이트에서 Error Message:
//Memory error occured, (e.g. segmentation error, memory limit Exceed, stack overflow,... etc)
// 오류 뜸
class SWEA2072{
	void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int b=0;
		for (int i=0;i<a;i++) {
			int result = 0;
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0;j<10;j++) {
				b =  Integer.parseInt(st.nextToken());
				if(b%2 !=0) {
				result +=b;
			}
			System.out.println("#"+(i+1)+" "+result);
			}
		}
	}
}

// 다른 사람 풀이
class Solution{
    public static void main(String args[]) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
 
        int T = Integer.parseInt(br.readLine());
 
        for(int test_case = 1; test_case <= T; test_case++)
        {
            int result = 0;
            st = new StringTokenizer(br.readLine());
             
            while(st.hasMoreTokens()) {
                int temp = Integer.parseInt(st.nextToken());
                if((temp % 2) == 1) {
                    result += temp;
                }
            }
 
            sb.append("#" + test_case + " " + result + "\n");
        }
        bw.write(sb.toString());
        bw.flush();
    }
}

class SWEA2068{
	void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int a = Integer.parseInt(br.readLine());
		for(int i =0;i<a;i++) {
			int result;
			int b=0;
			int max=0;
			st = new StringTokenizer(br.readLine());
			for(int j =0; j<10;j++) {
				b = Integer.parseInt(st.nextToken());
				if(max<=b) {
					max = b;
				}
			}
			System.out.println("#"+(i+1)+" "+max);
		}
	}
}

class Solution1 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc=0; tc<T;tc++) {
			int t = sc.nextInt();
			int[] Score = new int[101];
			for(int i = 0;i<1000;i++) {
				int n = sc.nextInt();
				Score[n]++;
			}
			int count=0;
			int mode=0;
			for (int i = 0; i<Score.length;i++) {
				if(Score[i]>=count) {
					count = Score[i];
					mode = i;
				}
			}
			System.out.println("#"+(tc+1)+" "+mode);
		}
	}
}
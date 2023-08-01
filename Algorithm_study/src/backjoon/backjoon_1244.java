package backjoon;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class backjoon_1244 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n=Integer.parseInt(st.nextToken());
		int[] switch1=new int[n];
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++) {
			switch1[i]=Integer.parseInt(st1.nextToken());
		}
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		int m=Integer.parseInt(st2.nextToken());
		for(int i=0;i<m;i++) {
			int gen=Integer.parseInt(st2.nextToken());
			int x=Integer.parseInt(st2.nextToken())-1;
			if(gen==1) {
				for(int j=x;j<n;j+=x+1) {
					switch1[j]=1-switch1[j];
				}
			}else {
				int mk=Math.min(x, n-1-x);
				switch1[x]=1-switch1[x];
				for(int j=1;j<=mk;j++) {
					if(switch1[x-j]!=switch1[x+j]) break;
					switch1[x-j]=1-switch1[x-j];
					switch1[x+j]=1-switch1[x+j];
				}
			}
		}
		
		for(int i=0;i<n;i++) {
			if(i%20==0 && i>0) System.out.println();
			System.out.print(switch1[i]+" ");
		}

	}



}

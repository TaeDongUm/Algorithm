import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.Math;

public class backjoon_2745 {

	public static void main(String[] args) throws IOException{
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String  alpha= "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String Input =st.nextToken();
		int B = Integer.parseInt(st.nextToken());
		int Tennum =0;
		for(int i =0;i<Input.length();i++) {
			for(int j = 0;j<alpha.length();j++) {
				if(Input.charAt(i)==alpha.charAt(j)) {
					Tennum += (j)*(Math.pow(B, Input.length()-1-i));
				}
			}
		}
		System.out.println(Tennum);
	}

}

package backjoon;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
public class backjoon_1759 {
	static char[] alpha;
	static boolean[] check;
	static String str;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		int L = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		
		alpha = new char[C];
		check = new boolean[C];
		for(int i =0;i<C;i++) {
			alpha[i] = st.nextToken().charAt(0);
		}
		Arrays.sort(alpha);
		combination(L,0,0);
		
	}
	public static void combination(int L, int depth, int index) {
		if(depth == L) {
			str ="";
            int cnt=0;
			for(int j=0;j<check.length;j++) {
				if(check[j]) {
					str += alpha[j]+"";
				}
			}
			if(str.contains("a")) cnt++;
			if(str.contains("e")) cnt++;
			if(str.contains("i")) cnt++;
			if(str.contains("o")) cnt++;
			if(str.contains("u")) cnt++;
			if((str.length()-cnt >=2) && cnt>0) {
				System.out.println(str);
			}
		}
		for(int i =index;i<alpha.length;i++) {
			check[i] = true;
			combination(L,depth+1, i+1);
			check[i] =false;
		}
	}

	}



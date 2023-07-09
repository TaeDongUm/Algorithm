import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;
import java.io.BufferedReader;

// java EOF
// 1. scanner hasNexxt()
public class study_20{
	
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			System.out.print(sc.nextInt()+" ");
		}
	}
}

// 2. BufferedReader, input = br.readLine()

class EOF2{
	void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";
		while((line = br.readLine()) != null) {
			// ~~~~
		}
	}
}



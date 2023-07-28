package backjoon;
import java.util.Scanner;

class Backjoon_1316{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        String line ="";
        int result =N;
        for(int i =0;i<N;i++){
            line = sc.nextLine();
            String string1 ="";
            if((line.length() ==1) || (line.length() ==0)) {
            	continue;
            }
            for(int j =0;j<line.length();j++){
            	if(j<=line.length()-2) {
	                if(line.charAt(j) == line.charAt(j+1)){
	                    continue;
	                } 
	                else{
	                    string1 += String.valueOf(line.charAt(j));
	                }
            	}
                else if(j==line.length()-1){
                    if(line.charAt(j-1) ==line.charAt(j)){
                    	string1 += String.valueOf(line.charAt(j));
                        continue;
                    }
                    else{
                        string1 += String.valueOf(line.charAt(j));
                    }
                }
            }
            System.out.println(string1);
            for(int k =97;k<123;k++){
                int count1 =0;
                for(int l =0;l<string1.length();l++){
                    if((char)(k) == string1.charAt(l)){
                        count1 +=1;
                    }
                }
                if(count1 >=2){
                	result -=1;
                    break;
                }
            }
        }
        System.out.print(result);
    }
}
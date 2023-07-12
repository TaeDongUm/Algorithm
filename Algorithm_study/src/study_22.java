import java.util.Scanner;


public class study_22{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N];
        int[] Reverse = new int[N];
        for(int i=0;i<N;i++){
            arr[i]= i+1;
        }
        for(int i=0;i<M;i++){
            String value ="";
            int a = sc.nextInt();
            int b = sc.nextInt();
            for(int j=a;j<=b;j++){
                value += Integer.toString(arr[j-1]);
            }
            for(int k =value.length()-1;k>=0;k--){
                value.charAt(k);
            }
        }
    }
}



import java.util.Scanner;

public class Backjoon_9086{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i = 0;i<N;i++){
            String line;
            sc.nextLine();
            line = sc.nextLine();
            int length = line.length();
            if(length !=0){
                System.out.print(line.charAt(0));
                System.out.print(line.charAt(length-1));
            }
            else {
                System.out.print(line);
            }
            System.out.print("\n");
        }
    }
}
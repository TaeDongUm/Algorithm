import java.util.Scanner;

class test1{
    public static void main(String[] args){
        System.out.println("|\\_/|");
        System.out.println("|q p|   /}");
        System.out.println("( 0 )\"\"\"\\");
        System.out.println("|\"^\"`    |");
        System.out.println("||_/=\\\\__|");
        Scanner input = new Scanner(System.in);
        int a,b,b1,num;
        a = input.nextInt();
        b = input.nextInt();
        b1 =b;
        while(b1>0){
            num = b1%10;
            System.out.println(a*num);
            b1 =b1/10;
        }
        System.out.println(a*b);
        }
}